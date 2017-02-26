package com.epam.java_training.ls3.util;

import java.util.Random;


public class Util {
	public static void enterArrayWithRandom(int[] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);
		}
	}
	
	public static void printArray(int[] mas) {
		System.out.println("The massive has the following items:");
		for (int i = 0; i < mas.length; i++) {
		System.out.print("mas[" + i + "]=" + mas[i] + "; ");
		}
		System.out.println();
	}
	
	public static int enterValueWithRandom(int limit) {
		int a;
		Random rand = new Random();
		a = rand.nextInt(limit) + 1;
		
		return a;
	}
	
	public static void printBegin(int tasknumber){
		
		System.out.println("Task" + tasknumber +" is in progress...");
	}
	
	public static void printEnd(int tasknumber){
		
		System.out.println("Task" + tasknumber +" is completed." + "\n");
	}
}
