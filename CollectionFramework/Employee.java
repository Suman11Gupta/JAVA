package CollectionFramework;
import java.util.Comparator;

public class Employee {
    String name;
    int id;
    int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

class emp_Id implements Comparator<Employee> {
        public int compare(Employee arg1,Employee arg2){
            return (int) arg1.id-arg2.id;
    }
}

class emp_Name implements Comparator<Employee>{
    public int compare(Employee arg1,Employee arg2){
        return (int) arg1.name.compareTo(arg2.name);
    }
}

class emp_Salary implements Comparator<Employee> {
    public int compare(Employee arg1,Employee arg2){
        return (int) arg1.salary-arg2.salary;
    }
}
