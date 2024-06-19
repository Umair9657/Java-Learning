public class star3 {
    public static void main(String[] args) {
        /* 
            *
            **
            ***
            ****    // Half Pyramid
         */

         int n =5;
         for (int i=1; i<=n; i++){  // outer loop
            for (int j=1; j<=i; j++){  // innr loop
                System.out.print("*");
            } System.out.println();
         } 
    }
}
