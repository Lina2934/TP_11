package exemple;

import bandeau.Bandeau;

public class EffetRotation extends Effet {

    public EffetRotation() {
        super("Rotation");
    }

    @Override
    public void jouer(Bandeau bandeau) {
        for (int i = 0; i < 360; i += 45) {
            bandeau.setRotation(Math.toRadians(i));
            bandeau.sleep(200);
        }
        bandeau.setRotation(0); // Réinitialiser après la rotation
    }
}
