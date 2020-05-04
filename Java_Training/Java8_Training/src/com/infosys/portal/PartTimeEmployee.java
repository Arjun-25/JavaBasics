package com.infosys.portal;

public class PartTimeEmployee extends Employee{

	@Override
	public void calculateSalary() {
		deductFoodFee();
		//Remunerator.deductForPension();
	}

	@Override
	public double deductFoodFee() {
		return 0;
	}

	@Override
	protected int getYearsInOrg() {
		// TODO Auto-generated method stub
		return 0;
	}

}
