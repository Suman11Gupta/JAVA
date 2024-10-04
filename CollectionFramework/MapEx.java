package CollectionFramework;
import java.util.*;
public class MapEx {
    public static void main(String[] args) {
        Map<Integer,String> obj=new HashMap<Integer,String>();
        obj.put(1,"S");
        obj.put(2,"U");
        obj.put(3,"M");
        obj.put(4,"A");
        obj.put(5,"N");
        System.out.println(obj.keySet());
        System.out.println(obj.values());
        System.out.println(obj.entrySet());
        for(Map.Entry<Integer,String> ob: obj.entrySet()){
            if(ob.getKey()%2==0){
                System.out.println(ob.getValue()+" Your assignment is in Complete");
            }

        }
    }
}
