package be.heh.ex1;

public class Triangle {

    private double cote;

    public double getCote() {
        return cote;
    }

    public Triangle(double cote){

        this.cote=cote;
    }

    public double perimetre(){
        double perim = 3*cote;
        return perim;
    }

    public double aire(){
        double aire = Math.sqrt(3)/4*Math.pow(2,cote);
        return aire;
    }
}
