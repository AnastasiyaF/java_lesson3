/*
 * Задание 1.
 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые
кратны данному К

Date: 17.02.2017
Author: Anastasiya Findziukevich
*/
package com.epam.java_training.ls3.task1;
import com.epam.java_training.ls3.util.Util;

public class Task1 {
	
	public static void doMain() {
		
		int n;
		int k;
		int[] massive;
		
		Util.printBegin(1);
		n = Util.enterValueWithRandom(10);
		System.out.println("Generate value for n:" + n);
		
		k = 3;
		System.out.println("Generate value for k:" + k);
		
		massive = new int[n];
		
		Util.enterArrayWithRandom(massive);
		Util.printArray(massive);
		
		System.out.println("Calculate values maltiple " + k);
		calculateSumValue(massive, k);
		Util.printEnd(1);
		
	}
	
	private static void calculateSumValue(int[] mas, int k){
		int sumValues = 0;
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i]%k == 0) {
				sumValues = sumValues + mas[i];
			}
		}
		
		System.out.println("The sum of values maltiple " + k + " is " + sumValues );
		
		return;
	}
	}
