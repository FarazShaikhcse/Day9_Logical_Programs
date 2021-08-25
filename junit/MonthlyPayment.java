package com.yml.junit;

public class MonthlyPayment {
	public static void monthpay(String args[]) {
		double p = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double r = Double.parseDouble(args[2]);
		
		double n = 12 * y;
		double rate = r / (12 * 100);
		double payment = p * rate / (1 - Math.pow(1 + rate, -n));
		System.out.println("Monthly payment="+payment);
		
		
	}

}
