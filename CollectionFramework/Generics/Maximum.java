package Generics;

public class Maximum {
    public static <T extends Comparable<T>> T maximum(T x,T y,T z){
        T max=x;
        if(y.compareTo(max)>0);{
            max=y;
        }
        if(z.compareTo(max)>0){
            max=z;
        }
      return max;
    }

    public static void main(String[] args) {
        System.out.println("Max of "+maximum(3,8,5));
        System.out.println("Max of "+maximum(2.5,5.6,8.9));
        System.out.println("Max of "+maximum("Apple","Orange","Pear"));
//        System.out.println("Max of %.1f,%.1f is %.1f",0.5,2.5,5.6,maximum(1.5,2.5,5.6));
    }
}
