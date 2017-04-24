package com.emp;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private double bonus;

	public Employee(int id, String name, double salary, double bonus) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", bonus=" + bonus + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
			this.bonus = this.salary * 0.2;
		}
	}

	public double getBonus() {
		return bonus;
	}

}
