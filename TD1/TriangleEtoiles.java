class TriangleEtoiles {
    public static void main(String[] args) {
        int n;
        if (args.length == 1) {
            n = Integer.parseInt(args[0]);


            System.out.println("--------- With a for loop : ---------");

            for (int i = 1; i <= n ; i++){
                for (int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }


            System.out.println("\n \n --------- With a while loop : ---------");

        int i = 1;
        while (i <= n){
            int j = 1;
            while (j <= i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }



        }


        else{
            System.out.println("Please enter only one argument");
        }
    }
}



/*

--------- With a for loop : ---------
*
**
***
****


 --------- With a while loop : ---------
*
**
***
****

*/
