package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        // Création du bandeau
        Bandeau bandeau = new Bandeau();
        bandeau.setBackground(Color.BLUE);
        bandeau.setForeground(Color.PINK);
        bandeau.setFont(new Font("SansSerif", Font.PLAIN, 20));
        bandeau.setMessage("Début des animations");

        // Création d'un scénario
        Scenario scenario = new Scenario();
        scenario.ajouterEffet(new EffetRotation(), 1);
        scenario.ajouterEffet(new EffetClignotant(), 2);
        scenario.ajouterEffet(new EffetZoom(), 2);


        // Lancement du scénario
        scenario.jouer(bandeau);

        // Fin
        bandeau.setMessage("Fin des animations");
        bandeau.sleep(2000);
        bandeau.close();
    }
}
