import java.util.Scanner;

public class String_new {
    public static void main(String[] args) {
        String name = new String("Umair");
        System.out.printf(name);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your full Name");
        String st = sc.nextLine();
        System.out.println(st);

    }
}
