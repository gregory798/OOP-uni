class PaireEntier{
    private int a,b;

    PaireEntier(int a, int b){
        this.a = a;
        this.b = b;
    }

    PaireEntier(){
        a = 0;
        b = 0;
    }

    PaireEntier(PaireEntier pe){
        this.a = pe.a;
        this.b = pe.b;
    }

    public int getA(){
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String affiche(){
        return "Paire : " + this.a +"/"+this.b;
    }

    public static void main(String[] args) {
        PaireEntier p = new PaireEntier(5,6);
        System.out.println(p.affiche());
        PaireEntier q = new PaireEntier(p);
        System.out.println(q.affiche());

        System.out.println("---------------");

        RationnelPaire rp = new RationnelPaire(p);

        rp.afficheDec();
        // 0
        rp.afficheFrac();
        // 5/6
        rp.multiplier(2);
        rp.afficheDec();
        // 1
        rp.afficheFrac();
        // 10/6


    }
}

class RationnelPaire {
    private PaireEntier pe;
    private int x;
    private int y;

    public RationnelPaire() {
        this.setNumerateur(0);
        this.setDenominateur(1);
    }

    public RationnelPaire(PaireEntier pe) {
        this.setNumerateur(pe.getA());
        this.setDenominateur(pe.getB());
    }

    public RationnelPaire(int n) {
        this.setNumerateur(n);
        this.setDenominateur(1);
    }

    public RationnelPaire(int n, int d) {
        this.setNumerateur(n/pgcd(n,d));
        this.setDenominateur(d/pgcd(n,d));
    }

    public int pgcd(int a, int b) {
        if (b == 0)
            return a;
        return pgcd(b, a % b);
    }

    public int getNumerateur() {
        return x;
    }

    public int getDenominateur() {
        return y;
    }

    public void setNumerateur(int n) {
        x = n;
    }

    public void setDenominateur(int d) {
        if (d == 0) {
            throw new RuntimeException("Denominateur doit être différent de 0 !");
        }else {
            y = d;
        }
    }

    public void afficheFrac() {
        System.out.println(this.getNumerateur()+"/"+this.getDenominateur());
    }

    public void afficheDec() {
        int dec = this.getNumerateur() / this.getDenominateur();
        System.out.println(dec);
    }


    //////// Additions //////////////


    public RationnelPaire addition(RationnelPaire r) {
        int newNum = this.getNumerateur()*r.getDenominateur()+r.getNumerateur()*this.getDenominateur();
        int newDen = this.getDenominateur()*r.getDenominateur();
        return new RationnelPaire(newNum,newDen);
    }


    public void ajouter(RationnelPaire r) {
        setNumerateur(this.getNumerateur()*r.getDenominateur()+r.getNumerateur()*this.getDenominateur());
        setDenominateur(this.getDenominateur()*r.getDenominateur());
    }


    ///// On peut créer ajouter car les paramètres d'ajouter1 et ajouter2 sont différents
    public void ajouter(int n) {
        setNumerateur(this.getNumerateur()+n*this.getDenominateur());
        setDenominateur(this.getDenominateur());
    }


    //////// Multiplications ////////////////////

    public RationnelPaire multiplier(RationnelPaire r) {
        int newNum = this.getNumerateur()*r.getNumerateur();
        int newDen = this.getDenominateur()*r.getDenominateur();
        return new RationnelPaire(newNum,newDen);
    }

    /////// On ne peut pas créer de méthode void multiplier(Rationnel r) car celle du dessus existe déjà avec le même nom, et le même type de paramètre


    //////// On peut créer multiplier(int n) car il prend n, donc différent de multiplier1
    public void multiplier(int n){
        setNumerateur(this.getNumerateur()*n);
        setDenominateur(this.getDenominateur());
    }

    /////// On ne peut pas créer de méthode void multiplier(int n) car celle du dessus existe déjà avec le même nom, et le même type de paramètre



}
