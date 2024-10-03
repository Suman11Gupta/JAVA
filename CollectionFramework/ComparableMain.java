package CollectionFramework;
import java.util.*;
public class ComparableMain {
    public static void main(String[] args) {
        List<ComparableEx> obj=new ArrayList<ComparableEx>();
        obj.add(new ComparableEx(1,"s",2));
        obj.add(new ComparableEx(22,"d",8));
        obj.add(new ComparableEx(9,"r",86));
        Collections.sort(obj);
        for(ComparableEx c:obj){
            System.out.println(c);
        }
    }
}
