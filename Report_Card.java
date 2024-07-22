package Suman;
import java.util.Scanner;
class Student{
    public void name_marks(){
     Scanner sc=new Scanner(System.in);
        String name,roll_number;
        int java,c,go,ruby,csharp,python;

        System.out.println("Student Report Card System");
        System.out.println("...........................");
        System.out.println("Enter Your Name");
        name=sc.nextLine();
        System.out.println("Enter Your Roll Number");
        roll_number=sc.nextLine();
        System.out.println("Enter Your Java Marks: ");
        java=sc.nextInt();
        System.out.println("Enter Your C++ Marks: ");
        c=sc.nextInt();
        System.out.println("Enter Your Go Marks: ");
        go=sc.nextInt();
        System.out.println("Enter Your Ruby Marks: ");
        ruby=sc.nextInt();
        System.out.println("Enter your C# Marks: ");
        csharp=sc.nextInt();
        System.out.println("Enter Your Python Marks: ");
        python=sc.nextInt();

    }

}

public class Report_Card {
    public static void main(String[] args) {
        Student ob=new Student();
        ob.name_marks();
    }
}
