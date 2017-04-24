package com;

import com.emp.Employee;

public class App {

	public static void main(String[] args) {

		Employee employee = new Employee(12424, "Nag", 1000.00, 1000 * 0.2);

		employee.setSalary(2000);

		System.out.println(employee);

	}

}
