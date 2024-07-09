package Suman;
import java.util.Scanner;
public class Billing_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int size;
//        System.out.print("Enter Product List Size: ");
//        size=sc.nextInt();
//        sc.nextLine();
//        String[] product=new String[size];
//        for(int i=0;i<size;i++){
//            product[i]=sc.nextLine();
//            System.out.print("Enter Product "+(i+1)+":");
//
//        }


        int size;
        System.out.print("Enter Product List Size: ");
        size = sc.nextInt();
        sc.nextLine();

        String[] product = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Product " + (i + 1) + ": ");
            product[i] = sc.nextLine();
        }


        System.out.println("Product list:");
        for (String item : product) {
            System.out.println(item);
        }

    }
}
