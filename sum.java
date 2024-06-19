import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter the Second Number");
        int b = sc.nextInt();

        System.out.println("Enter the third Number");
        int c =sc.nextInt();

        int multiplication = a-b-c;
        System.out.println("The Total is");
        System.out.println(multiplication);
    }
}
