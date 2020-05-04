package com.infosys.portal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class InfosysRewardBonus {

	public static void main(String[] args) {

		List<Employee> empIdList = new ArrayList<>();
//		printEvenId(empIdList);
//		printOddId(empIdList);
//		printIdsForStock(empIdList);
		evaluate(empIdList, n -> n % 2 == 0);
		evaluate(empIdList, n -> n % 2 != 0);
		evaluate(empIdList, n -> n <= 1500);
	}

//	private static void printIdsForStock(List<Employee> empIdList) {
//
//		for (Employee emp : empIdList) {
//			if (emp.empId <= 1500) {
//				System.out.println("Employee ids selected for stock option :" + emp.empId);
//			}
//		}
//	}
//
//	private static void printOddId(List<Employee> empIdList) {
//
//		for (Employee emp : empIdList) {
//			if (emp.empId % 2 != 0) {
//				System.out.println("Even Employee ids :" + emp.empId);
//			}
//		}
//	}
//
//	private static void printEvenId(List<Employee> empIdList) {
//		for (Employee emp : empIdList) {
//			if (emp.empId % 2 == 0) {
//				System.out.println("Even Employee ids :" + emp.empId);
//			}
//		}
//
//	}

	private static void evaluate(List<Employee> empList, Predicate<Integer> predicateArg) {

		for (Employee emp : empList) {
			if (predicateArg.test(emp.empId)) {
				System.out.println(emp.empId);
			}
		}

	}
}
