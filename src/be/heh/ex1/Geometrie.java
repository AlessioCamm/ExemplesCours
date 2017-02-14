package be.heh.ex1;

public class Geometrie {

    public double calculPerim(Triangle[] t,Carre[] c){

        double totalPerim = 0;

        for(int i=0; i<t.length;i++){
            totalPerim = totalPerim+t[i].perimetre();
        }

        for(int i=0; i<c.length;i++){
            totalPerim = totalPerim+c[i].perimetre();
        }

        return totalPerim;
    }

    public double calculAire(Triangle[] t,Carre[] c){
        double totalAire = 0;

        for(int i=0; i<t.length;i++){
            totalAire = totalAire+t[i].aire();
        }

        for(int i=0; i<c.length;i++){
            totalAire = totalAire + c[i].aire();
        }
        return totalAire;
    }
}
