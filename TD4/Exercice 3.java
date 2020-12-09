/*

TODO : "La taille initiale du tableau interne sera de 10 éléments, et sera incrémentée de 10 à chaque fois
 que cela sera nécessaire. On ne devra pas avoir plus de 30 cases inutilisées dans le tableau."

 */

class Vecteur{
    private int [] tab;
    private int nbElem;

    Vecteur(){
        tab = new int[10];
    }

    void add(int n){
        nbElem++;
        if (nbElem < tab.length){
            for (int i=0; i<tab.length; i++){
                if(tab[i]==0){
                    tab[i] = n;
                    break;
                }
            }
        }else{
            tab = new int[tab.length+10];
        }
    }

    int getCapacity(){
        return tab.length;
    }

    int getSize(){
        return nbElem;
    }

    void afficher(){
        System.out.print("[ ");
        for(int i = 0; i<tab.length; i++){
            System.out.print(" |"+tab[i]+"| ");
        }
        System.out.println(" ]");
    }

    int get(int n){
        return tab[n];
    }

    void remove(int n){
        for (int i = n; i < tab.length - 1; i++) {
            tab[i] = tab[i + 1];
        }
    }

    public static void main(String[] args) {
        Vecteur v1 = new Vecteur();
        v1.add(888);
        v1.add(777);
        v1.add(666);
        v1.add(555);
        v1.afficher();
        v1.remove(2);
        v1.afficher();

        /*
        [  |888|  |777|  |666|  |555|  |0|  |0|  |0|  |0|  |0|  |0|  ]
        [  |888|  |777|  |555|  |0|  |0|  |0|  |0|  |0|  |0|  |0|  ]

         */

    }
}
