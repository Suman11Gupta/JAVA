package Prac;
import java.util.Scanner;
public class Positive_Negative {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        a=sc.nextInt();
        if(0<a){
            System.out.println("Your number is positive");
        }else if(0==a){
            System.out.println("Your number is zero");
        }else{
            System.out.println("Your number is negative");
        }

    }
}
