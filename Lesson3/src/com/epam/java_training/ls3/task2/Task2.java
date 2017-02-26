/*
 * Задание 2.
 * В целочисленной последовательности есть нулевые элементы. Создать массив из
номеров этих элементов.

Date: 17.02.2017
Author: Anastasiya Findziukevich
 */
package com.epam.java_training.ls3.task2;

import com.epam.java_training.ls3.util.Util;

public class Task2 {
	public static void doMain() {
		
		int n;
		int nresult;
		int[] massive;
		int[] masresult;
		n = 7;
		massive = new int[n];
		massive[5] = 0;
		
		Util.printBegin(2);
		
		Util.enterArrayWithRandom(massive);
		System.out.println("Print a massive, dimension = " + n);
		Util.printArray(massive);
		
		nresult = checkMassive(massive);
		
		if (nresult ==0){
			System.out.println("The massive does not have 0 elements.");
		}
		else{
			System.out.println("The massive has 0 elements:");
			masresult =  generateMassive(massive, nresult);
			
			Util.printArray(masresult);
		}
		Util.printEnd(2);
	}
	
	static int checkMassive(int[] massive){
		int result = 0;
		
		for (int i = 0; i < massive.length; i++) {
			
			if (massive[i] == 0){
				result = result + 1;
			}
		}
		
		return result;
		
	}
	
	static int[]  generateMassive(int[] massive, int n){
		int[] massiveresult = new int[n];
		int j = 0;
		
		for (int i = 0; i < massive.length; i++) {
			
			if (massive[i] == 0){
				massiveresult[j] = i;
				j++;
			}
			}
		
		return massiveresult;
		
	}
}
