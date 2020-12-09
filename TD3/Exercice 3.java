// Les rationnels manipulés ici sont sous forme réduite

public class Rationnel {
    private double numerateur;
    private double denominateur;

    public Rationnel() {
        this.setNumerateur(0);
        this.setDenominateur(1);
    }

    public Rationnel(int n) {
        this.setNumerateur(n);
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


    //////// Additions //////////////


    public Rationnel addition(Rationnel r) {
        double newNum = this.getNumerateur()*r.getDenominateur()+r.getNumerateur()*this.getDenominateur();
        double newDen = this.getDenominateur()*r.getDenominateur();
        return new Rationnel(newNum,newDen);
    }


    public void ajouter(Rationnel r) {
        setNumerateur(this.getNumerateur()*r.getDenominateur()+r.getNumerateur()*this.getDenominateur());
        setDenominateur(this.getDenominateur()*r.getDenominateur());
    }


    ///// On peut créer ajouter car les paramètres d'ajouter1 et ajouter2 sont différents
    public void ajouter(int n) {
        setNumerateur(this.getNumerateur()+n*this.getDenominateur());
        setDenominateur(this.getDenominateur());
    }


    //////// Multiplications ////////////////////

    public Rationnel multiplier(Rationnel r) {
        double newNum = this.getNumerateur()*r.getNumerateur();
        double newDen = this.getDenominateur()*r.getDenominateur();
        return new Rationnel(newNum,newDen);
    }

    /////// On ne peut pas créer de méthode void multiplier(Rationnel r) car celle du dessus existe déjà avec le même nom, et le même type de paramètre


    //////// On peut créer multiplier(int n) car il prend n, donc différent de multiplier1
    public void multiplier(int n){
        setNumerateur(this.getNumerateur()*n);
        setDenominateur(this.getDenominateur());
    }

    /////// On ne peut pas créer de méthode void multiplier(int n) car celle du dessus existe déjà avec le même nom, et le même type de paramètre



}

//////////////////////TEST////////////////////


public class App {
    public static void main(String[] args) {
        Rationnel r1 = new Rationnel(2,5);
        r1.afficheDec();
        // 0.4
        r1.afficheFrac();
        // 2/5
        r1.multiplier(2);
        r1.afficheDec();
        // 0.8
        r1.afficheFrac();
        // 4/5

    }
}
