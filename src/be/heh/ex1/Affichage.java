package be.heh.ex1;

public class Affichage {

    public void affichageAire(Triangle[] t,Carre[] c,double valeur){
        int i=0;
        for(Triangle triangle : t){
            i++;
            System.out.println("Triangle : " + i + ",cote = "+triangle.getCote());
        }

        for(Carre carre : c){
            i++;
            System.out.println("Carre : " + i + ",cote = "+carre.getCote());
        }

        System.out.println("L'aire totale = " + valeur);
        System.out.println("*************************************");
    }

    public void affichagePerim(Triangle[] t,Carre[] c,double valeur){
        int i=0;
        for(Triangle triangle : t){
            i++;
            System.out.println("Triangle : " + i + ",cote = "+triangle.getCote());
        }

        for(Carre carre : c){
            i++;
            System.out.println("Carre : " + i + ",cote = "+carre.getCote());
        }

        System.out.println("Le perimètre total = " + valeur);
        System.out.println("*************************************");
    }
}