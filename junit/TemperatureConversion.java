package com.yml.junit;

import java.util.Scanner;

public class TemperatureConversion {
	public static void tempConversion() {

		System.out.println("Select the scale\n1 for fahrenheit\n2 for Celcius");
		Scanner scanner = new Scanner(System.in);
		int unit = scanner.nextInt();
		System.out.println("Enter the temperature:");
		double temp = scanner.nextDouble();
		if (unit == 1) {
			printCelcius(temp);
		} else {
			printFahrenheit(temp);
		}

	}

	private static void printFahrenheit(double c) {
		double res = (c * 9 / 5) + 32;
		System.out.println("Temprature in degree fahrenheit is " + String.format("%.2f", res));
		return;

	}

	private static void printCelcius(double f) {

		double res = (f - 32) * 5 / 9;
		System.out.println("Temprature in degree Celcius is " + String.format("%.2f", res));
		return;
	}
}
