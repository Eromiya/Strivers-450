package com.striver.problems.arrays.medium;

/**
 * Leet : https://leetcode.com/problems/rotate-image/description/
 * 
 * Difficulty : Medium
 * 
 * Status : Done 100 %
 */
public class RotateImageMatrix_48 {

	/**
	 * Final Solution - 100%
	 * 
	 * Hint : Find the difference with original index and modified index
	 * Learning : Brute Force saves
	 * 
	 * i, j = n-j-1, i (Right Rotation)
	 * i, j = j, n-i-1 (Left Rotation) 
	 * 
	 * @param matrix
	 */
	public void rotate(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int[][] matrix1 = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix1[i][j] = matrix[n - j - 1][i];
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = matrix1[i][j];
			}
		}
	}
}
