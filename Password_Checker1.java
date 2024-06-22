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

         int selectedAnswer;
        System.out.println("1. Who invented Java Programming?");
        System.out.println(" 1. ) Guido van Rossum");
        System.out.println(" 2. ) James Gosling");
        System.out.println(" 3. ) Dennis Ritchie");
        System.out.println(" 4. ) Bjarne Stroustrup");
        System.out.println("Select your answer: ");

        selectedAnswer=sc.nextInt();

        switch(selectedAnswer){
            case 2:
                System.out.println(" select Right Answer ");
                System.out.println(" 2. Which component is used to compile, debug and execute the java programs?");
                System.out.println(" 1. ) JRE");
                System.out.println(" 2. ) JIT");
                System.out.println(" 3. ) JDK");
                System.out.println(" 4. ) JVM");
                System.out.println("Select your answer: ");
                selectedAnswer=sc.nextInt();

                switch(selectedAnswer){
                    case 3:
                        System.out.println(" select Right Answer ");
                        break;

                    default:
                        System.out.println(" Try next year... ");
                        break;
                }
                break;



            default:
                System.out.println("Try next year...");
                break;
            }

       }
    }
