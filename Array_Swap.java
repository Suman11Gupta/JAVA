package Java;

public class Array_Swap {
    public static void main(String[] args) {
        int i[]={1,2,3,4,5,6,7,8,9,10,12,19,60,40,90,50};
        int n=i.length;
        for(int j=0;j<n;j++){
            System.out.print(" "+i[j]);
        }
        System.out.println();
        int c=i[0];
        for(int j=0;j<n;j++){
            i[0]=i[n-1];
            i[n-1]=c;
            System.out.print(" "+i[j]);
        }


    }
}
