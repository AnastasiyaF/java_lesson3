/*
 * «адание 4.
 * ƒана последовательность натуральных чисел а1 , а2 ,..., ап. —оздать массив из
четных чисел этой последовательности. ≈сли таких чисел нет, то вывести
сообщение об этом факте.

Date: 17.02.2017
Author: Anastasiya Findziukevich
 */
package com.epam.java_training.ls3.task4;

import com.epam.java_training.ls3.util.Util;

public class Task4 {

	static int checkMassive(int[] massive){
		int result = 0;
		
		for (int i = 0; i < massive.length; i++) {
			
			if (massive[i]%2 == 0){
				result = result + 1;
			}
		}
		return result;
	}

	static int[]  generateMassive(int[] massive, int n){
		int[] massiveresult = new int[n];
		int j = 0;
		
		for (int i = 0; i < massive.length; i++) {
			
			if (massive[i]%2 == 0){
				massiveresult[j] = massive[i];
				j++;
			}
			}
		
		return massiveresult;
		
	}

	public static void doMain() {
		
		int n;
		int nresult;
		int[] massive;
		int[] masresult;
		n = 7;
		massive = new int[n];
		massive[5] = 0;
		
		Util.printBegin(4);
		
		Util.enterArrayWithRandom(massive);
		System.out.println("Print a massive, dimension = " + n);
		Util.printArray(massive);
		
		nresult = checkMassive(massive);
		
		if (nresult ==0){
			System.out.println("The massive does not have even elements.");
		}
		else{
			System.out.println("The massive has even elements.");
			masresult =  generateMassive(massive, nresult);
			
			Util.printArray(masresult);
		}
		Util.printEnd(4);
	}

}
