package exemple;

import bandeau.Bandeau;
import java.util.ArrayList;
import java.util.List;

public class Scenario {
    private static class EffetRepetition {
        Effet effet;
        int repetitions;

        EffetRepetition(Effet effet, int repetitions) {
            this.effet = effet;
            this.repetitions = repetitions;
        }
    }

    private final List<EffetRepetition> effets = new ArrayList<>();

    public void ajouterEffet(Effet effet, int repetitions) {
        effets.add(new EffetRepetition(effet, repetitions));
    }

    public void jouer(Bandeau bandeau) {
        for (EffetRepetition er : effets) {
            for (int i = 0; i < er.repetitions; i++) {
                er.effet.jouer(bandeau);
            }
        }
    }
}

