package Suman;

import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[][]=new int[3][3];
        System.out.println("Enter data [0][0]");
        data[0][0]=sc.nextInt();
        System.out.println("Enter data [0][1]");
        data[0][1]=sc.nextInt();
        System.out.println("Enter data [0][2]");
        data[0][2]=sc.nextInt();
        System.out.println("Enter data [1][0]");
        data[1][0]=sc.nextInt();
        System.out.println("Enter data [1][1]");
        data[1][1]=sc.nextInt();
        System.out.println("Enter data [1][2]");
        data[1][2]=sc.nextInt();
        System.out.println("Enter data [2][0]");
        data[2][0]=sc.nextInt();
        System.out.println("Enter data [2][1]");
        data[2][1]=sc.nextInt();
        System.out.println("Enter data [2][2]");
        data[2][2]=sc.nextInt();

        System.out.println("Your data: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+data[i][j]);
            }
            System.out.println(" ");
        }

    }
}
