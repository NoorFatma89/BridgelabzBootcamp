package com.bridgelabz.employeewage;
import java.util.Random;
import java.util.Scanner;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation Program!");
		System.out.println();
		isEmployeePresentOrAbsent();
		dailyEmployeeWage();
		partTimeEmployeeWage();
	}
	
	public static void isEmployeePresentOrAbsent() {
		int isAbsent=0;
		Random random=new Random();
		int randomNumber=random.nextInt(2);
		if(randomNumber==isAbsent) {
			System.out.println("Employee is Absent");
		}
		else {
			System.out.println("Employee is Present");
		}	
	}

	public static void dailyEmployeeWage() {
	    int wagePerHour=20,fullDayHour=8;
	    System.out.println("Enter Employee's daily Hour : ");
	    Scanner scanner=new Scanner(System.in);
		int hour=scanner.nextInt();
	    if(hour==fullDayHour) {
		    double employeeWage=wagePerHour*fullDayHour;
		    System.out.println("It's a Full Time Employee and Daily Employee Wage is : " +employeeWage);
	    }
	}
	
//	public static void dailyEmployeeWage() {
//		int wagePerHour=20, fullDayHour=8;
//		double employeeWage=wagePerHour*fullDayHour;
//		System.out.println("Daily Employee Wage is : " +employeeWage);
//	}
	
	public static void partTimeEmployeeWage() {
		int wagePerHour=20, partTimeHour=4; 
		System.out.println("Enter Employee's daily hour: ");
		Scanner scanner=new Scanner(System.in);
		int hour=scanner.nextInt();
		if(hour==partTimeHour) {
			double employeeWage=wagePerHour*partTimeHour;
			System.out.println("It's a Part Time Employee and Daily Employee Wage is : " +employeeWage);
		}
	}
}
