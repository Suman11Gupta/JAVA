package Prac;

import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        int age;

        System.out.println("Enter your name and age: ");
        name=sc.nextLine();
        age=sc.nextInt();
        System.out.println(name+" you are "+age+" years old!! ");
    }
}
