package Generics;

public class ArrayMaximum {

    public static <T extends Comparable<T>> T maximum(T[] x){
       T max=x[0];
       for(Object o:x){
           if(x[0].compareTo(max)>0){
               max=x[0];
           }
           if(x[1].compareTo(max)>0){
               max=x[1];
           }
           if(x[2].compareTo(max)>0){
               max=x[2];
           }
       }
     return max;
    }

    public static void main(String[] args) {
       Integer x[]={2,8,5};
        System.out.println("max of "+maximum(x));

    }
}
