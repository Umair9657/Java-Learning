public class star5 {
    public static void main(String[] args) {
        /*
             *
            **
           ***
          ****   inverted half pyramid (rotated by 180 deg)
         */
            int n=10;
            for (int i=1; i<=n; i++){
                for (int j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                for (int j=1; j<=i; j++){
                    System.out.print("*");
                }
                    System.out.println();
            }
    }
}
