package com.bridgelabz.employeewage;
import java.util.Random;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation Program!");
		System.out.println();
		isEmployeePresentOrAbsent();
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
}
