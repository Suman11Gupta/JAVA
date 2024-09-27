package CollectionFramework;
import java.util.*;
public class Collection {
    public static void main(String[] args) {
        List<Student> obj=new ArrayList<Student>();
        obj.add(new Student(1,"Suman",3));
        obj.add(new Student(2,"Suman",4));
        obj.remove(1);
        obj.add(new Student(3,"Suman",5));
        obj.set(1,new Student(6,"Sunita",7));
       for(Student s:obj){
           System.out.println(s);
       }
    }
}
