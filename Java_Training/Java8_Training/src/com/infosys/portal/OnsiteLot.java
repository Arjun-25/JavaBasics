package com.infosys.portal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OnsiteLot {

	public void getEmployees() {
		
		List<FullTimeEmployee> employeeList = new ArrayList<>();
		
		List<Integer> passportNumberList = new ArrayList<>();
		
		for(FullTimeEmployee employee : employeeList) {
			Optional<FullTimeEmployee> emp = Optional.of(employee);
			passportNumberList.add(emp.flatMap(FullTimeEmployee::getPassport).map(Passport::getPassportNumber).orElse(0));
		}
		
	}
}
