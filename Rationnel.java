// Les rationnels manipulés ici sont sous forme réduite

public class Rationnel {
    private double numerateur;
    private double denominateur;

    public Rationnel() {
        this.setNumerateur(0);
        this.setDenominateur(1);
    }

    public Rationnel(double n, double d) {
        this.setNumerateur(n/pgcd(n,d));
        this.setDenominateur(d/pgcd(n,d));
    }

    public double pgcd(double a, double b) {
        if (b == 0)
            return a;
        return pgcd(b, a % b);
    }

    public double getNumerateur() {
        return this.numerateur;
    }

    public double getDenominateur() {
        return this.denominateur;
    }

    public void setNumerateur(double n) {
        this.numerateur = n;
    }

    public void setDenominateur(double d) {
        if (d == 0) {
            throw new RuntimeException("Denominateur doit être différent de 0 !");
        }else {
            this.denominateur = d;
        }
    }

    public void afficheFrac() {
        System.out.println(this.numerateur+"/"+this.denominateur);;
    }

    public void afficheDec() {
        double dec = this.numerateur / this.denominateur;
        System.out.println(dec);
    }

    public Rationnel addition(Rationnel r) {
        double newNum = this.getNumerateur()*r.getDenominateur()+r.getNumerateur()*this.getDenominateur();
        double newDen = this.getDenominateur()*r.getDenominateur();
        return new Rationnel(newNum,newDen);
    }

    public Rationnel multiplier(Rationnel r) {
        double newNum = this.getNumerateur()*r.getNumerateur();
        double newDen = this.getDenominateur()*r.getDenominateur();
        return new Rationnel(newNum,newDen);
    }

    public void ajouter(Rationnel r) {
        setNumerateur(this.getNumerateur()*r.getDenominateur()+r.getNumerateur()*this.getDenominateur());
        setDenominateur(this.getDenominateur()*r.getDenominateur());
    }
}





-------------------------------------TEST-------------------------------------------------


public class App {
    public static void main(String[] args) {
        Rationnel r1 = new Rationnel(365,156);
        Rationnel r2 = new Rationnel(98,245);

        r1.ajouter(r1);
        r1.afficheDec();
        //4.67948717948718
        r1.ajouter(r2);
        r1.afficheDec();
        //5.079487179487179

    }
}



