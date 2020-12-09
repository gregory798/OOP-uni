class Constructeur {
    int x, y;
    Constructeur(int x, int y) { //c1
        this.x = x;
        this.y = this.x + y;
    }
    Constructeur(String s) { //c2
        this();
        System.out.print(s);
        x = y * 2 + x;
    }
    Constructeur(int a) { //c3
        this(5, a);
        System.out.print("=>");
        x = x + a;
        y++;
    }
    Constructeur() { //c4
        this(4);
        y = x + y;
        x--;
    }
    public static void main(String[] args) {
        Constructeur c = new Constructeur("Hello !");
        System.out.println("(" + c.x + ", " + c.y + ")");


        /*
        1) Création d'un c2 --> appel à this(), affichage de "Hello !", x = y * 2 + x;
        2) Appel à this() --> appel à this(4), y = x + y et x--;
        3) Appel à this(4) --> appel à this(5,a) soit this(5,4), affichage de "=>", x = x + a et y++;
        4) Appel à this(5,4) --> x=5 et y=5+4=9;
        5) On remonte la chaîne --> / Affichage de "=>" / x=5+4=9 et y=10; // y=x+y=19, x=8 // x=19*2+8=46 // Affichage de "Hello !"
        6) On a donc créer un objet ayant comme x=46 et y=19, et, avant de créer l'objet, on a affiché "=>" puis "Hello !"


         */
    }
}
