package Prac;
import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter number: ");
        a=sc.nextInt();
        if(a%2==0){
            System.out.println("Your number is even");
        }else{
            System.out.println("Your number is odd");
        }
    }
}
