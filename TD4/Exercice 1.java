class Statique {
    int a = 0;
    Statique(int n) {
        a = n + 1;
    }
    int f(int x) {
        a += x;
        return a + 2;
    }
    static int g(int n) {
        a += n + 1;
        return a;
    }
    public static void main(String[] args) {
        Statique s = new Statique(3);
        System.out.println(s.f(5));
        System.out.println(s.g(7));
        System.out.println(s.f(13));
        System.out.println(Statique.g(2));
        System.out.println(Statique.f(4));
    }
    /*
    Ce code ne compile pas car s.g(7) accède à une variable non-statique, alors que g est une méthode statique.
    De plus, Statique.f(4) est une méthode non-statique mais qui est utilisée dans un contexte statique.
    Pour compiler et éxécuter ces méthodes,
    il faut modifier le code pour obtenir,
    par exemple, quelquechose comme ça :-----|
                                             |
                                             |
                                             |
                                             |
                                             |
                                             V

    */
}



class Statique {
    int a = 0;
    Statique(int n) {
        a = n + 1;
    }
    int f(int x) {
        a += x;
        return a + 2;
    }
    static int g(int n) {
        Statique s2 = new Statique(n);
        s2.a += n + 1;
        return s2.a;
    }
    public static void main(String[] args) {
        Statique s = new Statique(1);
        System.out.println(s.f(2));         // 6
        System.out.println(Statique.g(3));  // 8
        System.out.println(s.f(4));         // 10
        System.out.println(Statique.g(5));  // 12
        System.out.println(s.f(6));         // 16


    }
}
