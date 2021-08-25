package com.yml.logical;

import java.util.Scanner;

public class Fibonacci {
	
	public static void fibonacci() {
		Scanner r = new Scanner(System.in);
		System.out.println("enter thenvalue of n for fibonacci series");
		int n = r.nextInt();
		int n1=0, n2=1, n3;
		System.out.println("Fibanacci series upto"+n+"is");
		for(int i=1;i<=n;i++)
		{
			System.out.print(n1 + " ");
			n3 = n1+ n2;
			n1 = n2;
			n2 = n3;
		}
		
	}

}