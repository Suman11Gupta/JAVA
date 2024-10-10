package Generics;

class ArrayAvg<T>{
    T i[];
    int b=i.length;
    int sum=0;

    public ArrayAvg(T i[]) {
        this.i = i;
    }

    public void average(){
       for(int i=0;i<b;i++){
            sum=sum+i;
       }
        System.out.println("Average: "+sum/4);
    }
}

public class ArrayAvgMain {
    public static void main(String[] args) {
        Integer i[]={7,8,4,16};
        ArrayAvg<Integer> ob=new ArrayAvg(i);
       ob.average();
    }
}
