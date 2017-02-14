package be.heh.ex1;

public class Main {
    public static void main(String[] args) {
        double aireTotale = 0;
        double perimTotal = 0;

        ConstructeurPoly cp = new ConstructeurPoly();

        Geometrie g = new Geometrie();

        aireTotale = g.calculAire(cp.getTriangles(), cp.getCarres());
        perimTotal = g.calculPerim(cp.getTriangles(), cp.getCarres());

        Affichage aff = new Affichage();
        aff.affichageAire(cp.getTriangles(),cp.getCarres(),aireTotale);
        aff.affichagePerim(cp.getTriangles(),cp.getCarres(),perimTotal);
    }
}
