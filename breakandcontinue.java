public class breakandcontinue {
    public static void main(String[] args) {
        // Break and continue in loops
       for (int i=0; i<10; i++){
            System.out.println(i);
            System.out.println("Java is great");

            if (i==2) {
                System.out.println("Loops ends");
                continue;
            }

           /*  int r =0;
            while (r<5) {
                System.out.println(r);
                if (r==2) {
                    System.out.println("Loops ends");
                    break; }
                    r++;*/

        }
    }
}


