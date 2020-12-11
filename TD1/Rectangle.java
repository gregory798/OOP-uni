class Rectangle {
    public static void main(String[] args) {
        int m;
        int n;
        if (args.length == 2) {
            m = Integer.parseInt(args[0]);
            n = Integer.parseInt(args[1]);


            System.out.println("--------- With a for loop : ---------");

            for (int i = 1; i <= m; i++) {

                for (int j = 1; j <= n; j++){
                    if (j%2 != 0){
                        System.out.print("+");
                    }else{
                        System.out.print("-");
                    }
                }

                System.out.println();
            }




            System.out.println("\n \n --------- With a while loop : ---------");

            int i = 1;
            while (i <= m) {
                int j = 1;
                while (j <= n){
                    if (j%2 != 0){
                        System.out.print("+");
                    }else{
                        System.out.print("-");
                    }
                    j++;
                }

                System.out.println();
                i++;
            }



        }
        else{
                System.out.println("Please enter 2 arguments");
            }

    }
}

/*
--------- With a for loop : ---------
+-+-+-+-
+-+-+-+-
+-+-+-+-
+-+-+-+-


 --------- With a while loop : ---------
+-+-+-+-
+-+-+-+-
+-+-+-+-
+-+-+-+-


*/



