package be.heh.ex1;

public class Carre {

    private double cote;


    public double getCote() {
        return cote;
    }

    public Carre(int cote){

        this.cote=cote;
    }

    public double perimetre(){
        double perim = 4*cote;
        return perim;
    }

    public double aire(){
        double aire = Math.pow(2,cote);
        return aire;
    }

}
