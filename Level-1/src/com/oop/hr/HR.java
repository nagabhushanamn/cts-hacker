package com.oop.hr;

import com.oop.emp.Employee;

public class HR {

	public static void manageEmployees() {

		// create couple of employee instances

		Employee.tnrName = "Nag";

		Employee employee1 = new Employee();
		employee1.name = "A";

		Employee employee2 = new Employee();
		employee2.name = "B";

		Employee.doTraining();

		// Provide training and get work

		employee1.doWork();
		employee2.doWork();

	}

}
