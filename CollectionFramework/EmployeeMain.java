package CollectionFramework;
import java.util.*;
import java.util.ArrayList;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> obj=new ArrayList<Employee>();
        Scanner sc=new Scanner(System.in);
        int answer;
        String name;
        int id;
        int salary;

        while(true){
            System.out.println("1.)Insert");
            System.out.println("2.)Update");
            System.out.println("3.)Delete");
            System.out.println("4.)Show");
            System.out.println("5.)Search");
            System.out.println("....................................");
            System.out.println("Select:");
            answer=sc.nextInt();
            switch(answer){
                case 1:
                    System.out.println("Enter Employee Name: ");
                    name=sc.next();
                    System.out.println("Enter Employee Id: ");
                    id=sc.nextInt();
                    System.out.println("Enter Employee Salary: ");
                    salary=sc.nextInt();
                    obj.add(new Employee(name,id,salary));
                    break;

                case 2:


                case 4:
                   for(Employee c:obj){
                       System.out.println(c);
                   }
                   break;

            }
        }

    }
}
