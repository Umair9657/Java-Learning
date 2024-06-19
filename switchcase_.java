import java.util.Scanner;

public class switchcase_ {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age= sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("Now You can make your Voter Id card");
                break;
            
                case 23:
                System.out.println("Now you are eligibale for a job");
                break;

                case 60:
                System.out.println("nOW YOU CAN RETIRE FROM YOUR JOB");
                break;

                case 90:
                System.out.println("Now your time is finish");

             default:
                    System.out.println("Enjoy your life");
                break;
        }
    }
}
