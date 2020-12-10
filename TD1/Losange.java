class Losange {
    public static void main(String[] args) {
        int n;
        String s;
        if (args.length == 2) {
            n = Integer.parseInt(args[0]);
            s = args[1];


            System.out.println("--------- With a for loop : ---------");

            for (int i = 1; i <= n ; i++){
                for (int j = 1; j <= i; j++){
                    System.out.print(s);
                }

                System.out.println();
            }

            for (int i = 1; i <= n-1; i++){
                for (int j = 1; j <= i; j++){
                    System.out.print(" ");
                }
                for (int k = 3; k >= i; k--){
                    System.out.print(s);

                }
                System.out.println();
            }


            System.out.println("\n \n --------- With a while loop : ---------");

            int i = 1;
            while (i <= n){
                int j = 1;
                while (j <= i){
                    System.out.print(s);
                    j++;
                }

                System.out.println();
                i++;
            }


            int k = 1;
            while (k <= n-1){
                int l = 1;
                while (l <= k){
                    System.out.print(" ");
                    l++;
                }
                int m = 3;
                while (m >= k){
                    System.out.print(s);
                    m--;

                }
                System.out.println();
                k++;
            }


        }


        else{
            System.out.println("Please enter 2 arguments");
        }
    }
}
/*

--------- With a for loop : ---------
!
!!
!!!
!!!!
 !!!
  !!
   !


 --------- With a while loop : ---------
!
!!
!!!
!!!!
 !!!
  !!
   !


*/



