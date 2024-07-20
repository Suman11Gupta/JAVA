package Suman;

import java.util.Scanner;

public class Product_Constructor {

    //Parameterized constructor
    Product_Constructor(String name, float price){
        System.out.println("..............Product Info...............");
        System.out.println("Product Name: "+name);
        System.out.println("Product price: "+price);

    }
    // Create Method
   int result(String name2,float price2){

       System.out.println("Gst- "+(price2*18)/100);
        return 0;
    }

    //Main Method
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter product name: ");
        String name1=sc.nextLine();
        System.out.println("Enter Price: ");
        float price1=sc.nextFloat();
        Product_Constructor obj=new Product_Constructor(name1,price1);
       obj.result(name1,price1);

    }
}
