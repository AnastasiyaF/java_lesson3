/*
 * Задание 6.
 * Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):
 * 1 1 1 .... 1
 * 1 0  ....0 1
 * 1 0 0 .....1
 * ............
 * 1 0  ....0 1
 * 1 1 1 .... 1
 * 
 * 
Date: 17.02.2017
Author: Anastasiya Findziukevich
 */

package com.epam.java_training.ls3.task6;

import com.epam.java_training.ls3.util.Util;

public class Task6 {
	public static void doMain() {
		
		int n;
		n = 10;
		
		int[][] matrix = new int[n][n];
			
		Util.printBegin(6);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i == 0) || (i == n-1)||(j == 0) || (j == n-1)){
					matrix[i][j] = 1;
				}
				else{
					matrix[i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		
		Util.printEnd(6);

	}
}
