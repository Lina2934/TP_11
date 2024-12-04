package exemple;

import bandeau.Bandeau;

public class EffetClignotant extends Effet {

    public EffetClignotant() {
        super("Clignotant");
    }

    @Override
    public void jouer(Bandeau bandeau) {
        for (int i = 0; i < 10; i++) {
            bandeau.setMessage(i % 2 == 0 ? "Clignotant" : "");
            bandeau.sleep(200);
        }
    }
}
