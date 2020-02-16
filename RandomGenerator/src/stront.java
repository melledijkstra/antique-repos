import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 * Created by melle_000 on 2015-11-17.
 */
public class stront {
    public String smell = "nasty";

    public stront() {
        String bip = "C:\\Users\\melle_000.LAPTOP-MELLE\\Music\\YouTube\\BestFutureHouseMix2015.mp3";
        Media hit = new Media(bip);
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
    }
}
