package com.bridgelabz.employeewage;
import java.util.Random;
import java.util.Scanner;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation Program!");
		System.out.println();
		isEmployeePresentOrAbsent();
		System.out.println();
		dailyEmployeeWage();
		System.out.println();
		partTimeEmployeeWage();
		System.out.println();
		switchCase();
		System.out.println();
		calculatingWageWithCondition();
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
	
	public static void switchCase() {
		System.out.println("What do you want to know ?");
		System.out.println("To check Employee is Present or Absent Press 1: ");
		System.out.println("To Calculate Full-Time Employee's Daily Wage Press 2: ");
		System.out.println("To Calculate Part-Time Employee's Daily Wage Press 3: ");
		
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		 
		switch(choice){
		case 1:
			isEmployeePresentOrAbsent();
			break;
		case 2:
			dailyEmployeeWage();
			break;
		case 3:
			partTimeEmployeeWage();
			break;
		default:
			System.out.println("Incorrect Choice! ");
		}
	}
	
	public static void monthlyWage() {
		int workingDay=20, wagePerHour=20,fullDayHour=8,partTimeHour=4;
	    System.out.println("Enter Employee's daily Hour : ");
	    Scanner scanner=new Scanner(System.in);
		int hour=scanner.nextInt();
	    if(hour==fullDayHour) {
		    double employeeWage=workingDay*wagePerHour*fullDayHour;
		    System.out.println("It's a Full Time Employee and Daily Employee Wage is : " +employeeWage);
	    }
	    else if(hour==partTimeHour) {
			double employeeWage=workingDay*wagePerHour*partTimeHour;
			System.out.println("It's a Part Time Employee and Daily Employee Wage is : " +employeeWage);
		}	
	}
//	public static void monthlyWage() {
//		int workingDay=20,wagePerHour=20,fullDayHour=8;
//		double monthlyWage=workingDay*wagePerHour*fullDayHour;
//		System.out.println("Employee Monthly Wage is :" +monthlyWage);
//	}
	
	public static void calculatingWageWithCondition() {
		int wagePerHour=20, totalHours=0,totalDays=0;
		while(totalHours<100 && totalDays<20) {
		    System.out.println("Enter Employee's daily Hour : ");
		    Scanner scanner=new Scanner(System.in);
			int hour=scanner.nextInt();
			totalHours+=hour;
			System.out.println("Enter Days : ");
			int days=scanner.nextInt();
			totalDays+=days;    
		}
		double employeeWage=wagePerHour*totalHours*totalDays;
		System.out.println("Total Working Hour or day is reached for a Month!");
		System.out.println("Your Wage is :" +employeeWage);
	    
	}
}
