public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }

    public boolean origine(){
        return (x==0 && y==0);
    }

    public boolean egale(Point p){
        return (x == p.x && y == p.y);
    }

    public Point symetrie(){
        return new Point(0-x,0-y);
    }

    public double distance (Point p){
        return Math.sqrt( (p.x-this.x) + (p.y-this.y) );
    }

    public String toString(){
        return x+"/"+y;
    }
}



----------------------------TEST-----------------------------


public class App {
    public static void main(String[] args) {
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

    }
}
