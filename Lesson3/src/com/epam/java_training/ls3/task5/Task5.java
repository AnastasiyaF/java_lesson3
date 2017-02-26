/*
 * Задание 5.
 * Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):
 * 1 2 3 .... n
 * n n-1 .....1
 * 1 2 3 .....n
 * ............
 * ............
 * n n-1 .....1
 * 
 * 
Date: 17.02.2017
Author: Anastasiya Findziukevich
 */

package com.epam.java_training.ls3.task5;

import com.epam.java_training.ls3.util.Util;

public class Task5 {

	public static void doMain() {
			
		int n;
		n = 10;
		
		int[][] matrix = new int[n][n];
			
		Util.printBegin(5);
		
		for (int i = 0; i < n/2; i++) {
			for (int j = 0; j < n; j++) {
				if (i%2 == 0){
					matrix[i][j] = j + 1;
					matrix[n/2 + i][j] = j + 1;
				}
				else{
					matrix[i][j] = n - j;
					matrix[n/2 + i][j] = n - j;
				}	
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		
		Util.printEnd(5);

	}
}
