class Chevron {
    public static void main(String[] args) {
        int n;
        if (args.length == 1) {
            n = Integer.parseInt(args[0]) / 2;


            System.out.println("--------- With a for loop : ---------");

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }

            for (int i = 1; i <= n; i++) {
                for (int j = n - 1; j >= i; j--) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }


            System.out.println("\n \n --------- With a while loop : ---------");
            int i = 1;
            while (i <= n) {
                int j = 1;
                while (j <= i - 1) {
                    System.out.print(" ");
                    j++;
                }
                System.out.print("*");
                System.out.println();
                i++;
            }
            int k = 1;
            while (k <= n) {
                int l = n - 1;
                while (l >= k) {
                    System.out.print(" ");
                    l--;
                }
                System.out.print("*");
                System.out.println();
                k++;
            }
        }
        else{
                System.out.println("Please enter 1 argument");
            }

    }
}
/*
--------- With a for loop : ---------
*
 *
  *
   *
    *
    *
   *
  *
 *
*


 --------- With a while loop : ---------
*
 *
  *
   *
    *
    *
   *
  *
 *
*


*/



