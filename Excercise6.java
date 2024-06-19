public class Excercise6 {
    public static void main(String[] args) {
        // write a program to print star in decreaseing order.
        int n =10;
        for (int i=n; i>0; i--){
            for (int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
