package Generics;
import java.util.List;
import java.util.*;

class ListFunction  {
   void test(List<? super Integer> obj){
       for(Object ob:obj ){
           System.out.println(ob);
       }
   }

   static <T> void show(T a,T b){
       System.out.println(a+"+"+b);
   }
}
public class ListGenericsOverloading {
    public static void main(String[] args) {
        ListFunction ob1=new ListFunction();
        ob1.show(1,5);
        ob1.show(1.5,"Suman");
        ob1.show(1,5.5);
    }
}
