package org.bank;

public class BankInfo extends AxisBank {
	private void saving() {
		System.out.println("SB AC");
	}
	private void fixed() {
		System.out.println("Fixed");
	}
	
	public static void main(String[] args) {
		BankInfo bd = new BankInfo();
		
		bd.saving();
		bd.fixed();
		bd.deposit();
		bd.recurrringDeposit();
	}

}
