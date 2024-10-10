package Generics;
class Function{
    void show(int a,int b){
        System.out.println(a+"+"+b);
    }
    void show(double a,double b){
        System.out.println(a+"+"+b);
    }
    void show(String a,String b){
        System.out.println(a+"+"+b);
    }
}
public class FunctionOverloading {
    public static void main(String[] args) {
        Function obj=new Function();
        obj.show(2,8);
        obj.show(2.3,6.8);
        obj.show("Suman","Sonal");
    }
}
