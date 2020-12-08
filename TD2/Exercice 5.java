public class Segment {
    private Point ex1, ex2;
    private double longueur;

    public Segment(Point p, Point q){
        setEx1(p);
        setEx2(q);
        setLongueur(p, q);
    }

    public void setEx1(Point ex1) {
        this.ex1 = ex1;
    }

    public void setEx2(Point ex2) {
        this.ex2 = ex2;
    }

    public Point getEx1() {
        return ex1;
    }

    public Point getEx2() {
        return ex2;
    }

    public void setLongueur(Point ex1, Point ex2){
        longueur = ex1.distance(ex2);
    }

    public double longueur(){
        return longueur;
    }

    public boolean egale(Segment s){
        return (this.ex1 == s.ex1 && this.ex2 == s.ex2);
    }

    public String affiche(){
        return "Extremité 1 : " + ex1 + "\nExtremité 2 : " + ex2 + "\nLongueur segment : "+longueur;
    }
}


///////////////////////TEST//////////////////////////


public class App {
    public static void main(String[] args) {

        System.out.println("Test sur les points --------------------------");
        Point p = new Point(2,4);
        Point q = new Point(3,5);
        System.out.println(p.origine());
        // false
        System.out.println(p.egale(q));
        // false
        System.out.println(p.toString());
        //2.0/4.0
        System.out.println(p.distance(q));
        // 1.41... Distance euclidienne


        System.out.println("Test sur les segments --------------------------");


        Segment s1 = new Segment(p,q);
        Segment s2 = new Segment(p,q);
        System.out.println(s1.longueur());
        // 1.41....
        System.out.println(s1.egale(s2));
        // true
        System.out.println(s1.affiche());
        //Extremité 1 : 2.0/4.0
        //Extremité 2 : 3.0/5.0
        //Longueur segment : 1.4142135623730951
    }
}
