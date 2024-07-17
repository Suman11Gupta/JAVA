package Suman;
import java.util.Scanner;
public class Matrix_UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row and Column");
        int row=sc.nextInt();
        int column=sc.nextInt();
        System.out.println("Enter data: ");
        int data[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                int a=sc.nextInt();
                data[i][j]=a;
            }
        }

        System.out.println("Your Matrix: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(" "+data[i][j]);
            }
            System.out.println(" ");
        }
    }
}
