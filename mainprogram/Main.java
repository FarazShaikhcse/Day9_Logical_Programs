package com.yml.mainprogram;

import com.yml.junit.Binary;
import com.yml.junit.DayofWeek;
import com.yml.junit.MonthlyPayment;
import com.yml.junit.TemperatureConversion;
import com.yml.junit.ToBinary;
import com.yml.junit.VendingMachine;
import com.yml.logical.Fibonacci;
import com.yml.logical.PerfectNumber;
import com.yml.logical.PrimeNumber;
import com.yml.logical.ReverseNumber;

public class Main {
	
	public static void main(String[] args) {
		Fibonacci.fibonacci();
		PerfectNumber.perfectNumber();
		ReverseNumber.reverseNumber();
		PrimeNumber.primeNumber();
		VendingMachine.vendingMachine();
		DayofWeek.dayOfWeek(args);
		TemperatureConversion.tempConversion();
		MonthlyPayment.monthpay(args);
		ToBinary.toBinary();
		Binary.nibble();
	}

}
