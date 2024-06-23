package Suman;
import java.util.Scanner;

public class Password_Checker1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String setPassword,enterPassword;
        System.out.println("Set Your Password: ");
        setPassword=sc.nextLine();
        System.out.println("Enter Your Password: ");
        enterPassword=sc.nextLine();
        int selectedAnswer;

        if(setPassword.equals(enterPassword)){
            System.out.println("Your password is correct...");

            System.out.println("1. Who invented Java Programming?");
            System.out.println("1. ) Guido van Rossum");
            System.out.println("2. ) James Gosling");
            System.out.println("3. ) Dennis Ritchie");
            System.out.println("4. ) Bjarne Stroustru");
            System.out.println("Select Answer: ");
            selectedAnswer=sc.nextInt();
            switch (selectedAnswer){
                case 2:
                    System.out.println("Your answer is correct...");
                    System.out.println("2. Which component is used to compile, debug and execute the java program?");
                    System.out.println("1. ) JRE");
                    System.out.println("2. ) JIT");
                    System.out.println("3. ) JDK");
                    System.out.println("4. ) JVM");
                    System.out.println("Select your answer: ");
                    selectedAnswer=sc.nextInt();
                    switch(selectedAnswer){
                        case 3:
                            System.out.println("your answer is correct");
                            break;
                        default:
                            System.out.println("Your answer is incorrect try next year...");
                            break;
                    }
                    break;

                default:
                    System.out.println("Your answer is incorrect try next year...");
                    break;
            }
        }else if(!setPassword.equals(enterPassword)){
            System.out.println("Password is in correct try 3 times");
            System.out.println("Enter Your Password: ");
            enterPassword=sc.nextLine();
            if(setPassword.equals(enterPassword)){
                System.out.println("Your password is correct...");

                System.out.println("1. Who invented Java Programming?");
                System.out.println("1. ) Guido van Rossum");
                System.out.println("2. ) James Gosling");
                System.out.println("3. ) Dennis Ritchie");
                System.out.println("4. ) Bjarne Stroustru");
                System.out.println("Select Answer: ");
                selectedAnswer=sc.nextInt();
                switch (selectedAnswer){
                    case 2:
                        System.out.println("Your answer is correct...");
                        System.out.println("2. Which component is used to compile, debug and execute the java program?");
                        System.out.println("1. ) JRE");
                        System.out.println("2. ) JIT");
                        System.out.println("3. ) JDK");
                        System.out.println("4. ) JVM");
                        System.out.println("Select your answer: ");
                        selectedAnswer=sc.nextInt();
                        switch(selectedAnswer){
                            case 3:
                                System.out.println("your answer is correct");
                                break;
                            default:
                                System.out.println("Your answer is incorrect try next year...");
                                break;
                        }
                        break;

                    default:
                        System.out.println("Your answer is incorrect try next year...");
                        break;
                }
            }else{
                System.out.println("Password is in correct try 2 times");
                System.out.println("Enter Your Password: ");
                enterPassword=sc.nextLine();
                if(setPassword.equals(enterPassword)){
                    System.out.println("Your password is correct...");

                    System.out.println("1. Who invented Java Programming?");
                    System.out.println("1. ) Guido van Rossum");
                    System.out.println("2. ) James Gosling");
                    System.out.println("3. ) Dennis Ritchie");
                    System.out.println("4. ) Bjarne Stroustru");
                    System.out.println("Select Answer: ");
                    selectedAnswer=sc.nextInt();
                    switch (selectedAnswer){
                        case 3:
                            System.out.println("Your answer is correct...");
                            System.out.println("2. Which component is used to compile, debug and execute the java program?");
                            System.out.println("1. ) JRE");
                            System.out.println("2. ) JIT");
                            System.out.println("3. ) JDK");
                            System.out.println("4. ) JVM");
                            System.out.println("Select your answer: ");
                            selectedAnswer=sc.nextInt();
                            switch(selectedAnswer){
                                case 3:
                                    System.out.println("your answer is correct");
                                    break;
                                default:
                                    System.out.println("Your answer is incorrect try next year...");
                                    break;
                            }
                            break;

                        default:
                            System.out.println("Your answer is incorrect try next year...");
                            break;
                    }
                }else{
                    System.out.println("Password is in correct try 1 times");
                    System.out.println("Enter Your Password: ");
                    enterPassword=sc.nextLine();
                    if(setPassword.equals(enterPassword)){
                        System.out.println("Your password is correct...");

                        System.out.println("1. Who invented Java Programming?");
                        System.out.println("1. ) Guido van Rossum");
                        System.out.println("2. ) James Gosling");
                        System.out.println("3. ) Dennis Ritchie");
                        System.out.println("4. ) Bjarne Stroustru");
                        System.out.println("Select Answer: ");
                        selectedAnswer=sc.nextInt();
                        switch (selectedAnswer){
                            case 3:
                                System.out.println("Your answer is correct...");
                                System.out.println("2. Which component is used to compile, debug and execute the java program?");
                                System.out.println("1. ) JRE");
                                System.out.println("2. ) JIT");
                                System.out.println("3. ) JDK");
                                System.out.println("4. ) JVM");
                                System.out.println("Select your answer: ");
                                selectedAnswer=sc.nextInt();
                                switch(selectedAnswer){
                                    case 3:
                                        System.out.println("your answer is correct");
                                        break;
                                    default:
                                        System.out.println("Your answer is incorrect try next year...");
                                        break;
                                }
                                break;

                            default:
                                System.out.println("Your answer is incorrect try next year...");
                                break;
                        }
                    }else{
                        System.out.println("Time out...");
                    }
                }
            }
        }

       }
    }
