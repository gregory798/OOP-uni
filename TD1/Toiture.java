class Toiture {
    public static void main(String[] args) {
        int n;
        if (args.length == 1) {
            n = Integer.parseInt(args[0]);


            System.out.println("--------- With a for loop : ---------");

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i-1; j++){
                    System.out.print(" ");
                }
                for (int j = 1; j <= n; j++){
                    System.out.print("*");
                }
                System.out.println();
            }



            System.out.println("\n \n --------- With a while loop : ---------");

            int i = 1;
            while (i <= n) {
                int j = 1;
                while (j <= i-1){
                    System.out.print(" ");
                    j++;
                }
                int k = 1;
                while (k <= n){
                    System.out.print("*");
                    k++;
                }
                System.out.println();
                i++;
            }


        }
        else{
                System.out.println("Please enter 1 argument");
            }

    }
}

/*

--------- With a for loop : ---------
******
 ******
  ******
   ******
    ******
     ******


 --------- With a while loop : ---------
******
 ******
  ******
   ******
    ******
     ******

*/



