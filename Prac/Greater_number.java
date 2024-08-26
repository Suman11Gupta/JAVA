package Prac;
import java.util.Scanner;
public class Greater_number {
 public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        a=sc.nextInt();
        System.out.println("Enter second number: ");
        b=sc.nextInt();
        System.out.println("Enter third number: ");
        c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("First number is greater");
        }else if(b>a && b>c){
            System.out.println("Second number is greater");
        }else{
            System.out.println("Third number is greater");
        }
    }
}
