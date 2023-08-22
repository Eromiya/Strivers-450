package com.striver.problems.arrays.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Leet : https://leetcode.com/problems/set-matrix-zeroes/
 * 
 * Difficulty : Medium
 * 
 * Status : Done
 */
public class SetMatrixZeroes_73 {

	/**
	 * Final Solution 
	 * 
	 * Hint : 
	 * 1. Find the indices 0 valued element. 
	 * 2. Add it in map and replace the values to 0 in original matrix
	 * 
	 * Learning : Brute Force saves
	 * 
	 * @param matrix
	 */
	public void setZeroes(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int zeroRow = -1, zeroCol = -1;
		Map<Integer, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0) {
					zeroRow = i;
					zeroCol = j;
					if(map.containsKey(zeroRow)) {
						map.get(zeroRow).add(zeroCol);
					}
					else {
						List<Integer> list = new ArrayList<Integer>();
						list.add(zeroCol);
						map.put(zeroRow, list);
					}

				}
			}
		}
		
		for(Map.Entry<Integer, List<Integer>> entry: map.entrySet()) {
			int row = entry.getKey();
			List<Integer> cols = entry.getValue();
			for(Integer col : cols) {
				for(int i=0;i<m;i++) {
					matrix[i][col] = 0;
				}
				for(int j=0;j<n;j++) {
					matrix[row][j] = 0;
				}
			}
			
		}
		
	}
}
