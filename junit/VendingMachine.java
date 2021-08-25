package com.yml.junit;

import java.util.Scanner;

public class VendingMachine {
	
	public static void vendingMachine() {
		int[] cash= {1000,500,100,50,10,5,2,1};
		int[] count= {0,0,0,0,0,0,0,0,0};
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount=scanner.nextInt();
		int change=amount;
		
			for(int i=0;i<cash.length;i++)
			{
				int q=change/cash[i];
				count[i]+=q;
				change=change % cash[i];
				
				
			}
		
			
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0) {
			System.out.println("cash\tcount");
			System.out.println( cash[i] + "\t" + count[i]);
			}
		}
		
	}

}
