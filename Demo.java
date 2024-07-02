package firstpackagedemo;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args){
        int age;
        String name;
        float height;
        char ltr;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        name =sc.nextLine();
        System.out.println("Enter your age: ");
        age =sc.nextInt();
        System.out.println("Enter your height: ");
        height =sc.nextFloat();
        System.out.println("Enter your character: ");
        ltr =sc.next().charAt(0);

        System.out.println("Your name is "+name);
        System.out.println("Your age is "+age);
        System.out.println("Your height is "+height);
        System.out.println("Your character is "+ltr);

    }
}
