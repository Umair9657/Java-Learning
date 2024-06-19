public class star4 {
    public static void main(String[] args) {
        /*
            ****
            ***
            **
            *       inverted half pyramid
         */
        int n =5;
         for (int i=n; i>=1; i--){  // outer loop
            for (int j=1; j<=i; j++){  // innr loop
                System.out.print("*");
            } 
            System.out.println();
         } 


    }

}
