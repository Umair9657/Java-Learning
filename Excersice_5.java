import java.util.Scanner;
    
public class Excersice_5 {
    public static void main(String[] args) {
       byte m1,m2,m3,m4,m5;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the physics marks ");
       m1 =  sc.nextByte();
       
       System.out.println("Enter the marks of Chemistry");
       m2 = sc.nextByte();

       System.out.println("Enter the marks of Mathematics");
       m3 = sc.nextByte();

       System.out.println("Enter the marks of Biology");
       m4 =  sc.nextByte();

       System.out.println("Enter the marks of English");
       m5 =  sc.nextByte();

       float avg = m1+m2+m3+m4+m5/5.0f;
       System.out.println("Average percentage is :" + avg/5);
       if (avg>=40 && m1>=33 &&  m2>=33 &&  m3>=33 &&  m4>=33 &&  m5>=33); {
        System.out.println("YOU ARE PASSED!");
       }
        {
        System.out.println("You are failed sorry try again");

       }
      
    }}

