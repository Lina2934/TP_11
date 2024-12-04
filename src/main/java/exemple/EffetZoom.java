package exemple;

import bandeau.Bandeau;
import java.awt.Font;

public class EffetZoom extends Effet {

    public EffetZoom() {
        super("Zoom");
    }

    @Override
    public void jouer(Bandeau bandeau) {
        for (int i = 5; i <= 50; i += 5) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, i));
            bandeau.sleep(100);
        }
    }
}
