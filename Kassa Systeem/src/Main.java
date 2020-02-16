import javax.swing.*;


public class Main extends JFrame {
	public static void main(String[] args) {
	
		JFrame frame = new Main();
		frame.setSize(300,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Kassa Paneel");
        frame.setContentPane( new KassaPaneel() );
        frame.setVisible(true);


	}
}
