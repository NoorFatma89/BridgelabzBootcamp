package com.bridgelabz.employeewage;
import java.util.Random;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation Program!");
		System.out.println();
		isEmployeePresentOrAbsent();
		dailyEmployeeWage();
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
			int wagePerHour=20, fullDayHour=8;
			double employeeWage=wagePerHour*fullDayHour;
			System.out.println("Daily Employee Wage is : " +employeeWage);
	}

//		public static void dailyEmployeeWage() {
//			Scanner scanner=new Scanner(System.in);
//			System.out.println("Enter Employee per Hour : ");
//			int wagePerHour=scanner.nextInt();
//			System.out.println("Daily Employee Wage is : ");
//			int fullDayHour=scanner.nextInt();
//			double employeeWage=wagePerHour*fullDayHour;
//		    System.out.println("Daily Employee Wage is : " +employeeWage);
//		}
}
