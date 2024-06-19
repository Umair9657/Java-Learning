public class number2 {
    public static void main(String[] args) {
        /*
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         * 11 12 13 14 15     Floyds Triangle
         */
            int n=10;
            int number =1;

            for (int i=1; i<=n;i++){
                for (int j = 1; j<=i; j++){
                    System.out.print(number);
                    number++;
                }
                System.out.println();
            }

    }
}
