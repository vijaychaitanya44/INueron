package com.day8;

public class SBIBanglore implements SBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI objR = new SBIBanglore();

		objR.deposit();
		objR.withdraw();

		System.out.println("***********************");

		SBI objS = new SBIBanglore();

		objS.deposit();
		objS.withdraw();
		objS.loan();
		
		System.out.println("***********************");
		
		SBIBanglore objSBI = new SBIBanglore();
		
		objSBI.deposit();
		objSBI.loan();
		objSBI.withdraw();
		objSBI.goldLoan();
	}

	public void loan() {
		System.out.println("SBIBanglore provides loan");
	}

	public void deposit() {
		System.out.println("SBI also provides this fac");
	}

	public void withdraw() {
		System.out.println("SBI also provides this fac");
	}

	public void goldLoan() {
		System.out.println("SBIBanglore only provides goldloan");
	}

}
