package firstpackagedemo;
import java.util.Scanner;


public class Report_Card_System {
    public static void main(String[] args) {
        String name,rollNumber,className;
        int java,c,python,ruby,sql,total;
        float percentage;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        name=sc.nextLine();
        System.out.println("Enter Your Roll Number: ");
        rollNumber=sc.nextLine();
        System.out.println("Enter Class: ");
        className=sc.nextLine();
        System.out.println("Enter JAVA Marks: ");
        java=sc.nextInt();
        System.out.println("Enter C++ Marks: ");
        c=sc.nextInt();
        System.out.println("Enter Python Marks: ");
        python=sc.nextInt();
        System.out.println("Enter Ruby Marks: ");
        ruby=sc.nextInt();
        System.out.println("Enter SQL Marks: ");
        sql=sc.nextInt();

        total=(java+c+python+ruby+sql);
        System.out.println("Total Marks : "+total);


        percentage=(total*100/500);
        System.out.println("Percentage: "+percentage+"%");
        percentage=sc.nextFloat();

    }


}
