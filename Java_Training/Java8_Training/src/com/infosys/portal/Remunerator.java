package com.infosys.portal;

interface Remunerator {

	double HEALTH_INSURANCE_PERCENTAGE = 5.0;
	double PENSION_PERCENTAGE = 5.0;
	
	double deductFoodFee();
	
	//double deductHealthInsurancePremium();

	public default double deductHealthInsurancePremium() {
		return (HEALTH_INSURANCE_PERCENTAGE * 30000)/100;
		
	}
	
	public static double deductForPension() {
		return (PENSION_PERCENTAGE * 30000)/100;
	}
}
