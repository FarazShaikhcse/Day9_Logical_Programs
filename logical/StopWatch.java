package com.yml.logical;

import java.util.Scanner;

public class StopWatch {

	static double start = 0, stop = 0;

	static void startTime() {
		start = System.currentTimeMillis();
		System.out.println("Started at " + start);
	}


	static void stopTime() {
		stop = System.currentTimeMillis();
		System.out.println("Stopped at " + stop);
		elapsedTime();
	}

	
	static void elapsedTime() {
		System.out.println("Elapsed time is " + (stop - start) / 1000);
	}

	public static void stopWatch() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1 to start");
		int startkey=s.nextInt();
		if(startkey==1)
			startTime();
		System.out.println("Enter 2 to stop");
		int stopkey=s.nextInt();
		if(stopkey==2)
			stopTime();
		
		
	}
