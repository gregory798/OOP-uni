class Surcharge{
    int a = 0;

    //f1
    public int f(int n, int m){
        a = n + m;
        return a;
    }

    //f2
    public String f(int n, String m){
        a += n;
        return "(" + String.valueOf(a) + "," + m + ")";
    }

    //g1
    public String g(int n){
        a = n;
        return String.valueOf(a);
    }

    //g2
    public int g(String n){
        a++;
        System.out.println(n);
        return a;
    }

    public static void main(String[] args) {
        Surcharge s = new Surcharge();

        System.out.println(s.f (s.g(s.g(s.g("A"))), s.g(s.f(5,s.g("B")))) );

        /*
        On affiche ce que renvoie s.f(p1,p2)

        p1:
        1) s.g("A") / a=1 / affiche "A" / renvoie 1;
        2) s.g(1) / a=1 / renvoie "1";
        3) s.g("1") / a=2 / affiche "1" / renvoie 2;
        Donc p1 = 2
        A ce stade, a=2;

        p2:
        1) s.g("B") / a=3 / affiche "B" / renvoie 3;
        2) s.f(5,3) / a=8 / renvoie 8;
        3) s.g(8) / a=8 / renvoie "8";
        Donc p2 = 8
        A ce stade, a=8
        Donc s.f(p1,p2) = s.f(2,"8")
        s.f(2,"8") --> a=10 et renvoie (10,8), à noter que 10 devient un String (et m l'était déjà)
        */


    }

}
