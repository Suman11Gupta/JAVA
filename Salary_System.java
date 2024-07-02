package Suman;
import java.util.Scanner;

public class Salary_System {
    public static void main(String[] args) {
          String employeeId,employeeName;
        int month,year,leaves,paidDays,totalWorkingDays;
        float salaryBasic,yearlySalary,conveyanceAllowance,medicalAllowance,otherAllowances,professionalTax,leaveAmount,CTC,totalAllowance,totalDeduction,
        totalAllowancesMonthly,netSalary;
        Scanner sc=new Scanner(System.in);

        System.out.println("Employee ID: ");
        employeeId=sc.nextLine();
        System.out.println("Employee Name: ");
        employeeName=sc.nextLine();
        System.out.println("Select Month: ");
        month=sc.nextInt();
        switch(month){
                case 1:
                System.out.println("January");
                break;
                case 2:
                System.out.println("February");
                break;
                case 3:
                System.out.println("March");
                break;
                case 4:
                System.out.println("April");
                break;
                case 5:
                System.out.println("May");
                break;
                case 6:
                System.out.println("June");
                break;
                case 7:
                System.out.println("July");
                break;
                case 8:
                System.out.println("August");
                break;
                case 9:
                System.out.println("September");
                break;
                case 10:
                System.out.println("October");
                break;
                case 11:
                System.out.println("November");
                break;
                case 12:
                System.out.println("December");
                break;
                default:
                System.out.println("Please select 1-12");
                break;
        }

        System.out.println("year: ");
        year=sc.nextInt();
        if(year%4==0){
            System.out.println("Leap Year");
        }else{
            System.out.println("not leap year");
        }
        System.out.println("Total Working Days: ");
        totalWorkingDays=sc.nextInt();
        System.out.println("Leaves: ");
        leaves=sc.nextInt();
        System.out.println("Conveyance Allowance: ");
        conveyanceAllowance=sc.nextFloat();
        System.out.println("Medical Allowance: ");
        medicalAllowance=sc.nextFloat();
        System.out.println("Other Allowances: ");
        otherAllowances=sc.nextFloat();
        System.out.println("Salary Basic: ");
        salaryBasic=sc.nextFloat();
        System.out.println("Professional Tax: ");
        professionalTax=sc.nextFloat();

        yearlySalary=salaryBasic*12;
        System.out.println("Paid Days: "+(totalWorkingDays-leaves));
        System.out.println("Basic Salary: "+salaryBasic);
        leaveAmount=(salaryBasic/totalWorkingDays)*leaves;
        System.out.println("Leaves Amount: "+leaveAmount);
        conveyanceAllowance=(yearlySalary*conveyanceAllowance)/100;
        System.out.println("Conveyance Allowance: "+conveyanceAllowance);
        medicalAllowance=(yearlySalary*medicalAllowance)/100;
        System.out.println("Medical Allowance: "+medicalAllowance);
        otherAllowances=(yearlySalary*otherAllowances)/100;
        System.out.println("Other Allowances: "+otherAllowances);
        CTC=(yearlySalary+conveyanceAllowance+medicalAllowance+otherAllowances);
        System.out.println("CTC: "+CTC);
        totalAllowance=(conveyanceAllowance+medicalAllowance+otherAllowances);
        System.out.println("Total Allowance: "+totalAllowance);
        professionalTax=(yearlySalary*professionalTax/100)-(salaryBasic-leaveAmount);
        System.out.println("Professional Tax: "+professionalTax);
        totalDeduction=(professionalTax+leaveAmount)-(salaryBasic);
        System.out.println("Total Deduction: "+totalDeduction);
        totalAllowancesMonthly=(conveyanceAllowance/12)+(medicalAllowance/12)+(otherAllowances/12);
        System.out.println("Total Allowance Monthly: "+totalAllowancesMonthly);
        netSalary=(totalAllowancesMonthly+salaryBasic)-totalDeduction;
        System.out.println("Net Salary: "+netSalary);
        
    }
}
