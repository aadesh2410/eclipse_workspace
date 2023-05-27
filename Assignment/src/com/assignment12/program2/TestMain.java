package com.assignment12.program2;

public class TestMain {
	
	public static void main(String[] args) {
		
		SBIBank sbi = new SBIBank();
		sbi.getSBIBankDetails();
		HDFCBank hdfc = new HDFCBank();
		hdfc.getSBIBankDetails();
		ICICIBank icici = new ICICIBank();
		icici.getSBIBankDetails();
		
	}

}
