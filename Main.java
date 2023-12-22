package com.bridgelabz.employeewage;

public class Main {

		public static void main(String[] args) {
			System.out.println("Welcome To Employee Wage Computation Program!");
			System.out.println();
			EmployeeWage employeeWage=new EmployeeWage();
			employeeWage.isEmployeePresentOrAbsent();
			System.out.println();
			employeeWage.dailyEmployeeWage();
			System.out.println();
			employeeWage.partTimeEmployeeWage();
			System.out.println();
			employeeWage.switchCase();
			System.out.println();
			employeeWage.calculatingWageWithCondition();
			System.out.println();
			employeeWage.wageForMultipleCompanies();
		}
}
