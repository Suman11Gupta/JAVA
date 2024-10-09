package CollectionFramework;

public class GenericsKVMain {
    public static void main(String[] args) {
        GenericsKV<Integer,String> obj1=new GenericsKV<>(101,"SV");
        System.out.println(obj1.getKTest());
        System.out.println(obj1.getK());
        System.out.println(obj1);
    }
}
