package Generics;
class GenericsFunction{
    <T> void  show(T a,T b){
        System.out.println(a+"+"+b);
    }
}

public class GenericsFunctionOverloading {
    public static void main(String[] args) {
       GenericsFunction obj=new GenericsFunction();
       obj.show(4,5);
       obj.show("Suman","Sonal");
       obj.show(1.2,5.6);
    }
}
