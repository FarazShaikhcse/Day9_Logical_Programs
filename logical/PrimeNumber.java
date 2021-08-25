package com.yml.logical;

import java.util.Scanner;

public class PrimeNumber {
	public static void primeNumber() {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n");
		n = scanner.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n % i == 0) {
				System.out.println(n+" is not a prime number");
				return;
			}
		}
		System.out.println(n+" is a prime number");
	}

}
