package CollectionFramework;
import java.util.*;
public class StringEx {

    public static void main(String[] args) {
        List <String> course=new ArrayList<String>();
        course.add("Java");
        course.add("C++");
        String arr[]={"Csharp","English"};
        List<String> newCourse=Arrays.asList(arr);
        course.addAll(newCourse);
        Iterator<String> itr= course.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().toUpperCase());
        }
    }
}
