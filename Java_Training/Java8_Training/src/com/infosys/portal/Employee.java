package com.infosys.portal;

import java.util.List;

abstract class Employee implements Remunerator{

	protected int empId;
	protected int empSalary;
	protected String empName;
	protected String country;
	
	abstract void calculateSalary();
	
	public void generateSalarySlip() {
		
	}
	
	public static int compareByCountry(Employee emp1, Employee emp2) {
		return emp1.country.compareTo(emp2.country);
	}

	protected static List<Employee> getEmpList() {
		// TODO Auto-generated method stub
		return null;
	}

	protected abstract int getYearsInOrg();
}
