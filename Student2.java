package Java;

public class Student2 {
    public static void main(String[] args) {

        String name1[] = {"joy","Toy","Roy","Soy"};
        double salary1[] = {45000,78000,90000,125000};
        String designation1[] = {"ios","HR","Tech","CA"};
        float bonus1[]={2,3,4,5};


       Student emp1 = new Student(name1,salary1,designation1,bonus1);
        emp1.get_all_data();

    }
}
