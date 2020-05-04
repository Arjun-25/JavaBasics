package com.infosys.portal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EmployeeServiceApplication {

	public static void main(String[] args) {

	}

	public void sortEmployeeByName(List<Employee> empList) {
		empList.sort(new NameComparator());
	}

//	public void sortEmployeeByCountry(List<Employee> empList) {
//		empList.sort(new Comparator<Employee>() {
//			
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.country.compareTo(o2.country);
//			}
//		});
//	}

//	public void sortEmployeeByCountry(List<Employee> empList) {
//		empList.sort(
//				
//				(o1, o2) -> 
//					 o1.country.compareTo(o2.country)
//		);
//	}

	public void sortEmployeeByCountry(List<Employee> empList) {
		empList.sort((o1, o2) -> Employee.compareByCountry(o1, o2));
		empList.sort(Employee::compareByCountry);
	}

	public void computeSalaryIncrement() {
		List<Employee> empList = new ArrayList<Employee>();
		for (Employee e : empList) {
			double sal = computeIncrement(e, e1 -> e1.empSalary * 1.10); // 10% salary increment
			System.out.println(e.empName + ": old salary: " + e.empSalary + ", new salary: " + sal);
		}
	}

	public void printReport() {
		List<Employee> lstEmp = new ArrayList<Employee>();

		System.out.println("***** Generating HR Report *****");
		generateReport(lstEmp, e -> System.out.println(e.empId + " : " + e.empName + " : " + e.empSalary));

		System.out.println("\n***** Generating Manager Report *****");
		generateReport(lstEmp, e -> System.out.println(e.empId + " : " + e.empName));
	}

	public void salarySlipGenerator() {
		List<? extends Employee> lstEmp = new ArrayList<Employee>();
		for (Employee e : lstEmp) {
			generate(() -> e);
		}
		 lstEmp.forEach(e -> generate(() -> e));
	}

	private double computeIncrement(Employee e, Function<Employee, Double> fn) {
		return fn.apply(e);
	}

	private void generateReport(List<Employee> lstEmp, Consumer<Employee> consumer) {
		for (Employee e : lstEmp) {
			consumer.accept(e);
		}
	}

	private static void generate(Supplier<? extends Employee> supplier) {
		supplier.get().generateSalarySlip();
	}
}