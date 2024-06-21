package Suman;
import java.util.Scanner;

public class Password_Checker1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String setPassword, enterPassword;
        System.out.println("Set your password: ");
        setPassword = sc.nextLine();
        System.out.println("Enter your password: ");
        enterPassword = sc.nextLine();

        if (setPassword.equals(enterPassword)) {
            System.out.println("correct");
        } else if (!setPassword.equals(enterPassword)) {
            System.out.println("wrong password ... try 2 more time out of 2");
            System.out.println("Enter your password: ");
            enterPassword = sc.nextLine();
            if (setPassword.equals(enterPassword)) {
                System.out.println("correct");
            } else {
                System.out.println("wrong password ... try 1 more time out of 1");
                System.out.println("Enter your password: ");
                enterPassword = sc.nextLine();
                if (setPassword.equals(enterPassword)) {
                    System.out.println("correct");
                } else {
                    System.out.println("wrong password ... try 0 more time out of 0");
                    System.out.println("Enter your password: ");
                    enterPassword = sc.nextLine();

                    if (setPassword.equals(enterPassword)) {
                        System.out.println("correct");
                    } else {
                        System.out.println("sorry your time is out \n");
                    }
                }
            }
        }
       }
    }
