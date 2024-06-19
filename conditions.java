import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        /*int a = 18;
        if (a==18) {
        System.out.println("You can drive"); 
           
        }
        else{
            System.out.println("sorry you cant drive");
        }*/
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age");
        int a = sc.nextInt();
        if (a>18) {
        System.out.println("You can drive"); 
           
        }
        else{
            System.out.println("sorry you cant drive");
        }
    }
}
