package com.striver.problems.arrays.medium;


/**
 * Leet : https://leetcode.com/problems/plus-one/description/
 * 
 * Difficulty : Easy
 * 
 * Status : Done
 */
public class PlusOne_66 {
	public int[] plusOne(int[] digits) {
		/**
         * Approach 1
       
        int number = 0;
        for(int i=0;i<digits.length;i++){
            number = (int) ( number + (digits[i]*Math.pow(10, digits.length-i-1)) );
        }
        number = number +1;
        return String.valueOf(number).chars().map(c -> c-'0').toArray();
          */
		int n = digits.length;
		if (digits[n - 1] != 9) {
			digits[n - 1] = digits[n - 1] + 1;
			return digits;
		} else {
			int rem = 1;
			int num = 0;
			for (int i = n - 1; i >= 0 && rem != 0; i--) {
				if (i == n - 1) {

					num = digits[i] + rem;
					digits[i] = 0;

				} else {
					num = digits[i] + rem;
					digits[i] = num % 10;
				}
				rem = num / 10;
			}
			if (rem != 0) {
				int[] newArr = new int[n + 1];
				newArr[0] = 1;
				for (int i = 1; i <= n; i++) {
					newArr[i] = digits[i - 1];
				}
				return newArr;
			}
		}
		return digits;

	}

}
