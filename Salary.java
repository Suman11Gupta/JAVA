package Suman;
import java.util.Scanner;

class Employee{
    String name,id,designation,department;
    int basic_salary;
    float house,dearness,provident;

     void employee_detail(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        name=sc.nextLine();
        System.out.println("Enter Your ID: ");
        id=sc.nextLine();
        System.out.println("Enter Your Designation: ");
        designation=sc.nextLine();
        System.out.println("Enter Your Department: ");
        department=sc.nextLine();
        System.out.println("Enter your Basic salary: ");
        basic_salary=sc.nextInt();
        System.out.println("Enter House Rent Allowance: ");
        house=sc.nextFloat();
        System.out.println("Enter Dearness Allowance: ");
        dearness=sc.nextFloat();
        System.out.println("Enter Provident Fund: ");
        provident=sc.nextFloat();
    }

    void display(){
        System.out.println("Employee Salary Details");
        System.out.println("........................");
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Designation: "+designation);
        System.out.println("Department: "+department);
        System.out.println();
        System.out.println("Basic Salary: "+basic_salary);

    }

    float hra(){
         float hra=(float)(basic_salary*house)/100;
         return hra;
    }

    float da(){
         float da=(float)(basic_salary*dearness)/100;
         return da;
    }

    float ma(){
        System.out.print("Medical allowance: ");
        return 1500;
    }

    float pf(){
         float pf=(float)(basic_salary*provident)/100;
         return pf;
    }

    float gs(){
         float gs=basic_salary+hra()+da()+ma();
         return gs;
    }

    float ns(){
         float ns= gs()-pf();
         return ns;
    }

}

public class Salary {
    public static void main(String[] args) {
      Employee ob=new Employee();
      ob.employee_detail();
        System.out.println();
      ob.display();
        System.out.println("House Rent Allowance: "+(ob.hra()));
        System.out.println("Dearness Allowance: "+(ob.da()));
        System.out.println(ob.ma());
        System.out.println("Provident Fund: "+(ob.pf()));
        System.out.println();
        System.out.println("Gross Salary: "+(ob.gs()));
        System.out.println("Net Salary: "+(ob.ns()));
    }
}
