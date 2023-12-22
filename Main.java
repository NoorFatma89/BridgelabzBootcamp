package com.bridgelabz.employeewage;

public class Main {

		public static void main(String[] args) {
			System.out.println("Welcome To Employee Wage Computation Program!");
			EmployeeWage employeeWage=new EmployeeWage();
			System.out.println();
			employeeWage.isEmployeePresentOrAbsent();
			System.out.println();
			employeeWage.dailyEmployeeWage();
			System.out.println();
			employeeWage.partTimeEmployeeWage();
			System.out.println();
			employeeWage.switchCase();
			System.out.println();
			employeeWage.calculateWageWithCondition();
		}
}
