package CollectionFramework;

public class GenericsMain {
    public static void main(String[] args) {
        Generics<Integer> obj1=new Generics<Integer>(5000);
        System.out.println(obj1.getValue());

        Generics<String> obj2=new Generics<String>("Sonal");
        System.out.println(obj2.getValue());

        Generics<Double> obj3=new Generics<Double>(4.5);
        System.out.println(obj3.getValue());
        
    }
}
