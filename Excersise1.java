// Write a program to calculate percentage of a given student in SPPU university. His marks from 5 subjects must be taken as input
// from the keyboard.(marks must be out of 100)

import java.util.Scanner;
public class Excersise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Subject 1");
        int sub1 = sc.nextInt();

        System.out.println("Enter Marks of Subject 2");
        int sub2 = sc.nextInt();

        System.out.println("Enter Marks of Subject 3");
        int sub3 = sc.nextInt();

        System.out.println("Enter Marks of Subject 4");
        int sub4 = sc.nextInt();

        System.out.println("Enter Marks of Subject 5");
        int sub5 = sc.nextInt();

        float sum = sub1+sub2+sub3+sub4+sub5;
        System.out.println("The Total of 5 Subjects is ");
        System.out.println(sum);

        float percentage = sum/5;
        System.out.println("The percentage of 5 subject is");
        System.out.println(percentage);


    }
}
