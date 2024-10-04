package CollectionFramework;
import java.util.*;
import java.util.TreeMap;

class AgeComparator implements Comparator<TreeMapEx>{
    public int compare(TreeMapEx o1,TreeMapEx o2){
        if(o1.age==o2.age) return 0;
        else if (o1.age>o2.age) return 1;
        else return -1;
    }
}

public class TreeMapExMain {
    public static void main(String[] args) {
        TreeMap<TreeMapEx,String> obj=new TreeMap<TreeMapEx,String>(new AgeComparator());

        obj.put(new TreeMapEx(1,"Suman",15),"From USA");
        obj.put(new TreeMapEx(2,"Sneha",18),"From India");

        System.out.println(obj.entrySet());
        System.out.println(obj.keySet());
        System.out.println(obj.values());

        for(TreeMapEx ob:obj.keySet()){
            System.out.println(ob.age);
            System.out.println(ob.name);
            System.out.println(ob.roll_no);
        }
    }
}
