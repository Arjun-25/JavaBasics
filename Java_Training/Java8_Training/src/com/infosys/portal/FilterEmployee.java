package com.infosys.portal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterEmployee {

	public static void main(String[] args) {

		List<Employee> lstEmp = Employee.getEmpList();
		List<Employee> listNewEmp = new ArrayList<>();

		for (Employee emp : lstEmp) {
			if (emp.getYearsInOrg() < 1) { // Filtering
				listNewEmp.add(emp);
			}
		}

		Collections.sort(listNewEmp, new Comparator<Employee>() { // logic for sorting
			public int compare(Employee employee1, Employee employee2) {
				return employee1.empId - employee2.empId;
			}
		});

		for (Employee newEmp : listNewEmp) {
			System.out.println(newEmp.empId + ":" + newEmp.empName); // content display
		}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		lstEmp.forEach((e) -> {
			if (e.getYearsInOrg() < 1) // Filtering
				listNewEmp.add(e);
	});

		listNewEmp.sort((employee1, employee2) -> employee1.empId - employee2.empId); // Sorting

		listNewEmp.forEach((e) -> System.out.println(e.empId + ":" + e.empName)); // Displaying

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
lstEmp.stream().filter(emp -> emp.getYearsInOrg() < 1)
				.sorted((e1, e2) -> e1.empId - e2.empId).forEach((e) -> System.out.println(e.empId + ":" + e.empName));;

		//map
		List<Employee> lstNewEmp = lstEmp.stream().filter(emp -> emp.getYearsInOrg() < 1)
	            .map(e -> { e.empSalary = e.empSalary + 5000; return e; })
	            .collect(Collectors.toList());
		
		//reduce
		  Optional<Integer> max = lstNewEmp.stream().map(e->e.empSalary)
		            .reduce(Integer::max);    // Finding the maximum salalry
		  
		        List<Employee> lstMaxEmp =  lstNewEmp.stream()
		            .filter(e -> e.empSalary == max.get())    // Finding employees with the maximum salary
		            .collect(Collectors.toList());
	}
}
