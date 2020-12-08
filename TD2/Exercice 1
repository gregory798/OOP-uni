public class Ex1 {
    int a = 0;

    public void f(){
        a++;
    }

    public String toString(){
        return String.valueOf(a);
    }


    public static void main(String[] args) {
        Ex1 p = new Ex1() ;
        Ex1 q = new Ex1() ;
        System.out.println("Creation de 2 objets, attributs à 0 par défaut:" );
        System.out.println("p = " + p.toString() );
        System.out.println("q = " + q.toString() );
        p.f();
        System.out.println("Utilisation de la méthode f sur l'objet p: p=1, et q=0" );
        System.out.println("p = " + p.toString() );
        System.out.println("q = " + q.toString() );
        p = q;
        p.f();
        System.out.println("Maintenant à l'objet p est assignée la référence de l'objet q (p=q)" );
        System.out.println("p.f() ajoute 1 à p, et comme p et q ont la même référence, p.f() <=> q.f() " );
        System.out.println("p = " + p.toString() );
        System.out.println("q = " + q.toString() );
    }
}
