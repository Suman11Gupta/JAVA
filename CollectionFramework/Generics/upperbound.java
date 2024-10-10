package Generics;

class FunctionUpperBound{
    static<T extends Number> void show(T a, T b){
        System.out.println(a+"+"+b);
    }
}
public class upperbound {
    public static void main(String[] args) {
        FunctionUpperBound obj=new FunctionUpperBound();
        obj.show(1,2);
    }
}
