package Java;

import java.util.Scanner;

public class Student {
    String name[];
    double salary[];
    String designation[];
    float bonus[];

    Student(String[] Name, double[] Salary, String[] Designation,float[] Bonus) {
        name = Name;
        salary = Salary;
        designation = Designation;
        bonus = Bonus;

    }

    void get_all_data(){

        int size = name.length;
        System.out.println("Sn.no. | Name | Salary | Designation | Bonus");
        for (int i = 0; i < size; i++) {
            System.out.println(i+1+" | "+name[i]+" | "+salary[i]+" | "+designation[i]+" | "+(bonus[i]*salary[i]/100+salary[i]));
        }
    }



//    String get_name(){
//        return name;
//    }
//
//    int get_Roll_number(){
//        return roll_number;
//    }
//
//    void set_name(String Name1){
//         name=Name1;
//    }
//
//    void set_Roll_number(int roll_number1){
//       roll_number=roll_number1;
//    }

    public static void main(String[] args) {

    }
}
