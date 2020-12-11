class CarreAlterne {
    public static void main(String[] args) {
        int n;
        String a;
        String b;
        if (args.length == 3) {
            n = Integer.parseInt(args[0]);
            a = args[1];
            b = args[2];


            System.out.println("--------- With a for loop : ---------");

            for (int i = 0; i < n; i++) {
                if (i%2 == 0){
                    //X-X-X-X
                    for (int j = 0; j <n; j++){
                        if (j%2 == 0){
                            System.out.print(a);
                        }else{
                            System.out.print(b);
                        }
                    }
                }else{
                    //-X-X-X
                    for (int j = 0; j < n; j++){
                        if (j%2 == 0){
                            System.out.print(b);
                        }else{
                            System.out.print(a);
                        }
                    }
                }
                System.out.println();
            }



            System.out.println("\n \n --------- With a while loop : ---------");

            int i = 0;
            while (i < n) {
                if (i%2 == 0){
                    //X-X-X-X
                    int j = 0;
                    while (j <n){
                        if (j%2 == 0){
                            System.out.print(a);
                        }else{
                            System.out.print(b);
                        }
                        j++;
                    }
                }else{
                    //-X-X-X
                    int k = 0;
                    while (k < n){
                        if (k%2 == 0){
                            System.out.print(b);
                        }else{
                            System.out.print(a);
                        }
                        k++;
                    }
                }
                System.out.println();
                i++;
            }


        }
        else{
                System.out.println("Please enter 3 arguments");
            }

    }
}

/*

--------- With a for loop : ---------
X-X-X-X-X-
-X-X-X-X-X
X-X-X-X-X-
-X-X-X-X-X
X-X-X-X-X-
-X-X-X-X-X
X-X-X-X-X-
-X-X-X-X-X
X-X-X-X-X-
-X-X-X-X-X


 --------- With a while loop : ---------
X-X-X-X-X-
-X-X-X-X-X
X-X-X-X-X-
-X-X-X-X-X
X-X-X-X-X-
-X-X-X-X-X
X-X-X-X-X-
-X-X-X-X-X
X-X-X-X-X-
-X-X-X-X-X


*/



