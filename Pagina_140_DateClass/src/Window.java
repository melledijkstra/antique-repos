/**
 * Created by melle_000 on 2015-09-29.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Window extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Date generator - ");

        // make new layout for scene
        VBox layout = new VBox();
        Label dagLabel = new Label("Dag: ");
        Label maandLabel = new Label("Maand: ");
        Label jaarLabel = new Label("Jaar: ");

        TextField dagInput = new TextField();
        TextField maandInput = new TextField();
        TextField jaarInput = new TextField();
        TextField output = new TextField();
        output.setEditable(false);

        Button button = new Button("Maak datum!");

        button.setOnAction(e -> {
            System.out.println("Button clicked");
            int dag = (dagInput.getText() != null && !dagInput.getText().isEmpty()) ? Integer.parseInt(dagInput.getText()) : 1;
            int maand = (maandInput.getText() != null && !maandInput.getText().isEmpty()) ? Integer.parseInt(maandInput.getText()) : 1;
            int jaar = (jaarInput.getText() != null && !jaarInput.getText().isEmpty()) ? Integer.parseInt(jaarInput.getText()) : 2001;
            System.out.println("dag: "+dag+", maand: "+maand+", jaar: "+jaar);
            Datum date = new Datum(dag,maand,jaar);
            output.setText(date.getDag() + "/" + date.getMaand() + "/" + date.getJaar());
        });

        layout.getChildren().addAll(dagLabel, dagInput, maandLabel, maandInput, jaarLabel, jaarInput, button, output);

        // make new scene for stage
        Scene theScene = new Scene(layout,250,250);

        // set startup scene
        window.setScene(theScene);
        window.show();
    }
}
