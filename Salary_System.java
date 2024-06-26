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
        System.out.println("Month: ");
        month=sc.nextInt();
        System.out.println("year: ");
        year=sc.nextInt();
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
        totalDeduction=(salaryBasic)-(professionalTax+leaveAmount);
        System.out.println("Total Deduction: "+totalDeduction);
        totalAllowancesMonthly=((salaryBasic*conveyanceAllowance)/100)+((salaryBasic*medicalAllowance)/100)+((salaryBasic*otherAllowances)/100);
        System.out.println("Total Allowance Monthly: "+totalAllowancesMonthly);
        netSalary=(totalAllowancesMonthly+salaryBasic)-totalDeduction;
        System.out.println("Net Salary: "+netSalary);
        
    }
}
