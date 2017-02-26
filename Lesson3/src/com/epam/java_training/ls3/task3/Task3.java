/*
 * Задание 3.
 * Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли
она возрастающей.

Date: 17.02.2017
Author: Anastasiya Findziukevich
 */
package com.epam.java_training.ls3.task3;

import com.epam.java_training.ls3.util.Util;

public class Task3 {
	public static void doMain() {
		
		int n;
		int[] massive;
		boolean check;
		
		Util.printBegin(3);
	
		n = Util.enterValueWithRandom(8);
		
		System.out.println("Generate a massive, dimension = " + n);
		massive = new int[n];
		
		Util.enterArrayWithRandom(massive);
		Util.printArray(massive);
		
		check = checkMassive(massive);
		
		if (check){
			System.out.println("The sequence is increasing.");
		}
		else{
			System.out.println("The sequence is not increasing.");
		}
		
		Util.printEnd(3);
	}
	
	static boolean checkMassive(int[] massive){
		boolean result = true;
		
		for (int i = 0; i < massive.length - 1; i++) {
			
			if (massive[i] >= massive[i+1]){
				return false;
			}
		}
		
		return result;
		
	}


}
