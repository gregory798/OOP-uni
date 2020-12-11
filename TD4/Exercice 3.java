class Vecteur{
    private int [] tab;
    private int nbElem;

    Vecteur(){
        tab = new int[10];
    }

    void add(int n){
        nbElem++;
        if (nbElem <= tab.length){
            for (int i=0; i<tab.length; i++){
                if(tab[i]==0){
                    tab[i] = n;
                    break;
                }
            }
        }else{
            tab = new int[tab.length+10];
            System.out.println("\n-------------------------------\nCapacité maximale atteinte.\nAjoutez vos éléments dans ce nouveau tableau :\n");
            }
        }


    int getCapacity(){
        return tab.length;
    }

    int getSize(){
        return nbElem;
    }

    public String toString(){
        String s = "";
        for(int i = 0; i<tab.length; i++){
            s += " {"+tab[i]+"} ";
        }
        return "[ " + s + " ]";
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
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(5);
        v1.add(6);
        v1.add(7);
        v1.add(8);
        v1.add(9);
        System.out.println(v1);
        v1.add(10);
        System.out.println(v1);
        v1.add(11);
        System.out.println(v1);
        v1.add(1);
        System.out.println(v1);

/*
          
[  {1}  {2}  {3}  {4}  {5}  {6}  {7}  {8}  {9}  {0}  ]
[  {1}  {2}  {3}  {4}  {5}  {6}  {7}  {8}  {9}  {10}  ]

-------------------------------
Capacité maximale atteinte.
Ajoutez vos éléments dans ce nouveau tableau :

[  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  ]
[  {1}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  {0}  ]
           
*/

    }
}
