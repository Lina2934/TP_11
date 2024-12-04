package exemple;
import bandeau.Bandeau;


public abstract class Effet {
    protected String nom;

    public Effet(String nom) {
        this.nom = nom;
    }

    public abstract void jouer(Bandeau bandeau);
}

