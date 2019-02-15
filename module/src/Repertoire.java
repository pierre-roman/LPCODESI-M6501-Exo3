import java.util.ArrayList;

public class Repertoire extends Noeud {
    protected ArrayList<Noeud> noeuds;
    public void ajouteNoeud(Noeud noeud) {
        noeuds.add(noeud);
    }
}
