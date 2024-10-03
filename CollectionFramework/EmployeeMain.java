package CollectionFramework;
import java.util.*;
import java.util.ArrayList;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> obj=new ArrayList<Employee>();
        Scanner sc=new Scanner(System.in);
        int answer;
        String name,nname;
        int id=0,sid,did,uid,size=obj.size(),a = 0;
        int nid,nsalary;
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
                    System.out.println("Enter Employee Id: ");
                    uid=sc.nextInt();
                    Iterator<Employee> itr1= obj.iterator();
                    while(itr1.hasNext()){
                        Employee ob=itr1.next();
                        if(ob.getId()==uid)
                        {
                            System.out.println("Enter Employee Name: ");
                            nname=sc.next();
                            System.out.println("Enter Employee ID: ");
                            nid=sc.nextInt();
                            System.out.println("Enter Employee Salary: ");
                            nsalary=sc.nextInt();
                            ob.setName(nname);
                            ob.setId(nid);
                            ob.setSalary(nsalary);
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter Employee ID: ");
                    did=sc.nextInt();
                    Iterator<Employee> itr= obj.iterator();
                    while(itr.hasNext()){
                        Employee ob=itr.next();
                        if(ob.getId()==did)
                        {
                            obj.remove(ob);
                            break;
                        }
                    }
                    break;

//                    for(int i=0;i<size;i++){
//                        if(did==id){
//                            break;
//                        }
//                        ++a;
//                    }
//                    obj.remove(a);


                case 4:
                    for(Employee c:obj){
                        System.out.println(c);
                    }
                    break;

                case 5:
                    System.out.println("Enter Employee Id: ");
                    sid=sc.nextInt();
                    Iterator<Employee> itr2= obj.iterator();
                    while(itr2.hasNext()){
                        Employee ob=itr2.next();
                        if(ob.getId()==sid)
                        {
                            System.out.println(ob);
//                            System.out.println(ob.getName());
//                            System.out.println(ob.getId());
//                            System.out.println(ob.getSalary());
                            break;
                        }

                    }
                    break;

//                    for(int i=0;i<size;i++){
//                        if(sid==id){
//                            break;
//                        }
//                        a++;
//                    }
//                    System.out.println(obj.get(a+1));

            }
        }

    }
}
