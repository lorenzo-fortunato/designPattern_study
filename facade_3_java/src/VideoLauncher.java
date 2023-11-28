import facade.VideoConversionFacade;

import java.io.File;

public class VideoLauncher {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        converter.convertVideo("youtubevideo.ogg", "mp4");

        // come puoi notare hai "spostato" la complessità fuori dal main (unica parte visibile del programma, hai guadagnato in sicurezza) e l'hai raggruppata in unico punto (creando una "facciata", appunto), la classe VideoConversionFacade che al suo interno compie tutte le logiche
    }
}
