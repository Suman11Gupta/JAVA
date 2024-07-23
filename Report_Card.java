package Suman;
import java.util.Scanner;
class Student{
    Scanner sc=new Scanner(System.in);
    String name,roll_number;
    int java,c,go,ruby,csharp,python;

    public void name(){
        System.out.println("Student Report Card System");
        System.out.println("...........................");
        System.out.println("Enter Your Name");
        name=sc.nextLine();
        System.out.println("Enter Your Roll Number");
        roll_number=sc.nextLine();
    }

    void sub_marks(){
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
    
    void name_marks(){
        System.out.println("Student Report Card System ");
        System.out.println("...........................");
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+roll_number);
        System.out.println();
        System.out.println("Marks: ");
        if(java<=30){
            System.out.println("Java = "+java+"/100"+" F");
        }else{
            System.out.println("Java = "+java+"/100");
        }

        if(c<=30){
            System.out.println("C++ = "+c+"/100"+" F");
        }else{
            System.out.println("C++ = "+c+"/100");
        }

        if(go<=30){
            System.out.println("Go = "+go+"/100"+" F");
        }else{
            System.out.println("Go = "+go+"/100");
        }

        if(ruby<=30){
            System.out.println("Ruby = "+ruby+"/100"+" F");
        }else{
            System.out.println("Ruby = "+ruby+"/100");
        }

        if(csharp<=30){
            System.out.println("C# = "+csharp+"/100"+" F");
        }else{
            System.out.println("C# = "+csharp+"/100");
        }

        if(python<=30){
            System.out.println("Python = "+python+"/100"+" F");
        }else{
            System.out.println("Python = "+python+"/100");
        }
    }


    int total(){
        int total=java+c+go+ruby+csharp+python;
        return total;
    }

   float percentage(){
        float percentage=(float)(total()*100/600);
        return percentage;
   }

    void status(){
        if(java>30 && c>30 && go>30 && ruby>30 && csharp>30 && python>30){
            System.out.println("Status: Pass");
        }else{
            System.out.println("Status: Fail");
        }
    }
    
    void grade(){
        if(percentage()<=40 ){
            System.out.println("Grade D");
        } else if (percentage()<=60) {
            System.out.println("Grade C");
        } else if (percentage()<=80) {
            System.out.println("Grade B");
        }else if (percentage()<=100) {
            System.out.println("Grade A");
        }
    }

}

public class Report_Card {
    public static void main(String[] args) {
        Student ob=new Student();
        ob.name();
        ob.sub_marks();
        System.out.println();
        ob.name_marks();
        System.out.println();
        System.out.println("Total = "+(ob.total())+"/600");
        System.out.println("Percentage = "+(ob.percentage())+"%");
        ob.status();
        ob.grade();
    }
}
