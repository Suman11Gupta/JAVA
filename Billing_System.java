package Suman;
import java.util.Scanner;
public class Billing_System {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);

        int size;
        System.out.print("Enter Product List Size: ");
        size = sc.nextInt();

        String[] product = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Product " + (i + 1) + ": ");
            product[i] = sc.next();
        }

        float price[]=new float[size];
        float total;
        total=0;
        for(int i=0;i<size;i++){
            System.out.println("Enter "+product[i]+" Price:");
            price[i]=sc.nextInt();
            total=total+price[i];

        }

        char select;
        System.out.println("Do You Want to add GST [Y/N]");
        select=sc.next().charAt(0);
        switch(select){
            case 'Y':
                System.out.println("...........Output.............");
                for(int i=0;i<size;i++){
                    System.out.println((i+1)+". "+product[i]+"= "+price[i]+"/-");
                }
                float gst=0;
                System.out.println("..............................");
                System.out.println("Total ="+total);
                gst=(18*total)/100;
                System.out.println("18% GST ="+gst);

                System.out.println("..........................");
                System.out.println("Final Total ="+(total+gst)+"/-");
                System.out.println("..........................");
                break;

            case 'N':
                System.out.println("...........Output.............");
                for(int i=0;i<size;i++){
                    System.out.println((i+1)+". "+product[i]+"= "+price[i]+"/-");
                }
                System.out.println("..............................");
                System.out.println("Total ="+total);
                break;
            default:
                System.out.println("Please select Y/N");
                break;
        }

//        System.out.println("...........Output.............");
//        for(int i=0;i<size;i++){
//            System.out.println((i+1)+". "+product[i]+"= "+price[i]+"/-");
//        }
//
//        System.out.println("..............................");
//        System.out.println("Total ="+total);


//        for (int i = 0; i < size; i++) {
//            System.out.println("Product List: " + (i + 1) + ": "+product[i]);
//
//        }

    }
}
