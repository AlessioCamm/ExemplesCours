package be.heh.ex1;

public class ConstructeurPoly {

    private Carre[] carres = new Carre[2];;
    private Triangle[] triangles = new Triangle[2];

    public ConstructeurPoly(){
        this.contructeurCarre();
        this.contructeurTriangle();
    }

    private void contructeurTriangle(){
        triangles[0] = new Triangle(5);
        triangles[1] = new Triangle(3);
    }

    private void contructeurCarre(){
        carres[0] = new Carre(5);
        carres[1] = new Carre(3);
    }

    public Carre[] getCarres(){
        return this.carres;
    }

    public Triangle[] getTriangles(){
        return this.triangles;
    }
}
