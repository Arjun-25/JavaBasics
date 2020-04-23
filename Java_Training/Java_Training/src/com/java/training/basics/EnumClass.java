package com.java.training.basics;

public class EnumClass {

	enum AccountType {
		CHK, SAV, DPST, OTH
	}

	public static void main(String[] args) {
		AccountType acctType = AccountType.DPST;
		System.out.println(acctType);

		switch (acctType) {

		case CHK:
			System.out.println("Checking Account");
			break;
		case SAV:
			System.out.println("Savings Account");
			break;
		case DPST:
			System.out.println("Deposit Account");
			break;
		default:
			System.out.println("Not an account type");
			break;
		}

	}
}
