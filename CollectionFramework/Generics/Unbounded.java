package Generics;
import java.util.List;

class ListFunction  {
   void test(List<?> obj){
       for(Object ob:obj ){
           System.out.println(ob);
       }
   }

   static <T> void show(T a,T b){
       System.out.println(a+"+"+b);
   }
}
public class Unbounded {
    public static void main(String[] args) {
        ListFunction ob1=new ListFunction();
        ob1.show(1,5);
        ob1.show(1.5,"Suman");
        ob1.show(1,5.5);
    }
}
