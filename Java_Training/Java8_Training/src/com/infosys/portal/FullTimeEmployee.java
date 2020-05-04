package com.infosys.portal;

import java.util.Optional;

public class FullTimeEmployee extends Employee {

	private Optional<Passport> passport = Optional.empty();
	
	public Optional<Passport> getPassport() {
		return passport;
	}

	public void setPassport(Optional<Passport> passport) {
		this.passport = passport;
	}

	@Override
	public void calculateSalary() {
		deductFoodFee();
		deductHealthInsurancePremium();
		Remunerator.deductForPension();
	}

	@Override
	public double deductFoodFee() {
		return 0;
	}
	
	public double deductHealthInsurancePremium() {
		return (HEALTH_INSURANCE_PERCENTAGE * 30000)/100;
		
	}

	@Override
	protected int getYearsInOrg() {
		// TODO Auto-generated method stub
		return 0;
	}

}
