package Generics;

public class SimpleArray {
    static <T> void showarray(T[] arr){
        for (Object o:arr){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        Integer arint[]={2,5,6};
        showarray(arint);
    }
}
