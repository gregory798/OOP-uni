/////////////////////////////////  Objet Mesure qui contient un tableau de n rationnels ////////////////////////////

class Mesure{
    private Rationnel[] tabR;
    private double moyenne;

    public Mesure(int n){
        tabR = new Rationnel[n];
    }

    public void ajouter(Rationnel r){
        int i = 0;
        while ((i < tabR.length) && (tabR[i] != null)) {
            i = i + 1;
        }
        if (i < tabR.length) {
            tabR[i] = r;
        } else {
            System.out.println("Taille du tableau depassee");
        }
    }

    public void afficher(){
        System.out.println("Affichage tu tableau de rationnels : -------");
        for(int i =0; i<tabR.length;i++){
            System.out.println("N°\t"+(i+1)+":\t"+tabR[i]);
        }
    }

   
    public void moyenne(){
        double sum = 0;
        int j = 0;
        while ((j < tabR.length) && (tabR[j] != null)) {
            sum += tabR[j].afficheDec2();
            j++;
        }
        System.out.println("La moyenne de la série est de : "+sum / tabR.length);

    }


}



//////////////////////////////////  Modification de la classe Rationnel pour qu'elle fonctionne avec Mesure /////////////////////////


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

    public double afficheDec2() {
        return this.numerateur / this.denominateur;
    }

    public String toString() {
        return this.numerateur+"/"+this.denominateur;
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




///////////////////////////////////////////////////////////////   TEST    /////////////////////////////////////////////////////////////// 


class Test{
    public static void main(String[] args) {
        Mesure m1 = new Mesure(5);
        m1.ajouter(new Rationnel(1,2));
        m1.ajouter(new Rationnel(2,3));
        m1.ajouter(new Rationnel(3,2));
        m1.ajouter(new Rationnel(10,6));
        m1.ajouter(new Rationnel(2,99));
        m1.afficher();
        m1.moyenne();
    }
}


/*

Affichage tu tableau de rationnels : -------
N°	1:	1.0/2.0
N°	2:	2.0/3.0
N°	3:	3.0/2.0
N°	4:	5.0/3.0
N°	5:	2.0/99.0
La moyenne de la série est de : 0.8707070707070705


 */
