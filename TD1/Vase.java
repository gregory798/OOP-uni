class Vase {
    public static void main(String[] args) {
        int n;
        if (args.length == 1) {
            n = Integer.parseInt(args[0]);


            System.out.println("--------- With a for loop : ---------");

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++ ){
                    System.out.print("*");
                }
                for (int l = n*2-1; l >= i*2; l--){
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++ ){
                    System.out.print("*");
                }

                System.out.println();
            }




            System.out.println("\n \n --------- With a while loop : ---------");

            int i =1;
            while (i <= n) {
                int j = 1;
                while (j <= i){
                    System.out.print("*");
                    j++;
                }
                int l = n*2-1;
                while (l >= i*2){
                    System.out.print(" ");
                    l--;
                }
                int k = 1;
                while (k <= i){
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
*              *
**            **
***          ***
****        ****
*****      *****
******    ******
*******  *******
****************


 --------- With a while loop : ---------
*              *
**            **
***          ***
****        ****
*****      *****
******    ******
*******  *******
****************


*/



