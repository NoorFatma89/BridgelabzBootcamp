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
		monthlyWage();
		System.out.println();
		calculateWageWithCondition();
	}
	
//	Calculating weather Employee is Present or Absent
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
	
//	Calculating Employee's Daily Wage
	public static void dailyEmployeeWage() {
	    int wagePerHour=20,fullDayHour=8;
	    System.out.print("To calculate Wage Enter Full Time Employee's daily Hour : ");
	    Scanner scanner=new Scanner(System.in);
		int hour=scanner.nextInt();
	    if(hour==fullDayHour) {
		    double employeeWage=wagePerHour*fullDayHour;
		    System.out.println("It's a Full Time Employee and Daily Employee Wage is : " +employeeWage);
	    }
	    else {
	        System.out.println("Enter correct value");
	    }
		scanner.close();
	}

//	Calculating Part-Time Employee's Daily Wage
	public static void partTimeEmployeeWage() {
	    int wagePerHour=20, partTimeHour=4; 
	    System.out.print("To calculate Wage Enter Part Time Employee's daily hour: ");
	    Scanner scanner=new Scanner(System.in);
            int hour=scanner.nextInt();
	    if(hour==partTimeHour) {
		double employeeWage=wagePerHour*partTimeHour;
		System.out.println("It's a Part Time Employee and Daily Employee Wage is : " +employeeWage);
	    }
	    else {
	    	System.out.println("Enter correct value");
	    }
	    scanner.close();
	}
	
//	Solving above problem from Switch Case
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
		scanner.close();
	}

//	Calculating Monthly Wage
	public static void monthlyWage() {
	    int workingDay=20, wagePerHour=20,fullDayHour=8,partTimeHour=4;
	    System.out.print("To calculate Wage Enter Employee's daily Hour : ");
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
	    else {
	    	System.out.println("Enter correct value");
	    }
		scanner.close();
	}

//	Calculating Wage with some Condition
	public static void calculateWageWithCondition() {
		int wagePerHour=20, totalHours=0,totalDays=0;
		while(totalHours<100 && totalDays<20) {
		    System.out.print("To calculate Wage Enter Employee's daily Hour : ");
		    Scanner scanner=new Scanner(System.in);
		    int hour=scanner.nextInt();
		    totalHours+=hour;
		    System.out.println("Enter Days : ");
	            int days=scanner.nextInt();
		    totalDays+=days;
		    scanner.close();
		}
		double employeeWage=wagePerHour*totalHours*totalDays;
		System.out.println("Total Working Hour or day is reached for a Month!");
		System.out.println("Your Wage is :" +employeeWage);  
	}
}
