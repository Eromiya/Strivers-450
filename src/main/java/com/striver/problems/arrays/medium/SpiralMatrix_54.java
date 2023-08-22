package com.striver.problems.arrays.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Leet : https://leetcode.com/problems/spiral-matrix/description/
 * 
 * Difficulty : Medium
 * 
 * Status : Done 100 %
 */
public class SpiralMatrix_54 {

	 /**
	  * Final Solution 
	  * 
	  * 1. Determine the layers of matrix - m/2 + m%2 
	  * 2. Loop through the layers 
	  * 3. Call the method layersOfSpiral by passing matrix, list, length, size
	  * 4. Increment the count & Decrement the layercount i.e rotations
	  * 5. After loop breaks, return the list.
	  * 
	  * @param matrix
	  * @return
	  */
	public List<Integer> spiralOrder(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int size = m * n;
		List<Integer> list = new ArrayList<Integer>();
		int rotations = (m / 2) + (m % 2);
		int count = 0;
		while (rotations > 0) {
			layersOfSpiral(matrix, list, count, m, n, size);
			count++;
			rotations--;
		}

		return list;
	}

	/**
	 * Method called for each layers of Matrix
	 * 
	 * Hint : Be careful while assigning the values for iterators.
	 * 
	 * 1. Find the LB and UB using count and full size
	 * 2. Introduce 4 loops indicates 4 sides of matrix 
	 * 3. Don't complete the final egde as the element was visited already
	 * 
	 * @param matrix
	 * @param list
	 * @param count
	 * @param m
	 * @param n
	 * @param size
	 */
	public void layersOfSpiral(int[][] matrix, List<Integer> list, int count, int m, int n, int size) {

		int rowLB = 0 + count;
		int rowUB = m - count;
		int colLB = 0 + count;
		int colUB = n - count;

		for (int i = rowLB, j = colLB; j < colUB && list.size() < size; j++) {
			list.add(matrix[i][j]);
		}

		for (int i = rowLB + 1, j = colUB - 1; i < rowUB && list.size() < size; i++) {
			list.add(matrix[i][j]);
		}

		for (int i = rowUB - 1, j = colUB - 2; j >= colLB && list.size() < size; j--) {
			list.add(matrix[i][j]);
		}

		for (int i = rowUB - 2, j = colLB; i > rowLB && list.size() < size; i--) {
			list.add(matrix[i][j]);
		}

	}

}
