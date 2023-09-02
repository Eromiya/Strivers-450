package com.striver.problems.string.medium;

/**
* Leet : https://leetcode.com/problems/string-to-integer-atoi/
* 
* Difficulty : Medium
* 
* Status : Done 
*/
public class StringToIntegerAtoi_8 {
	
	public int myAtoi(String s) {
		int num = 0;
		char[] charArr = s.toCharArray();
		boolean digitFound = false;
		boolean neg = false;
		boolean signFound = false;
		int start = 0 , end =0, i =0;
		for(;i<charArr.length;i++) {
			char c = charArr[i];
			if(!digitFound && !signFound && c==' '){
				continue;
			}
			else if(!digitFound && !signFound && (c=='+' || c=='-') ) {
				signFound = true;
				if(c=='-') {
					neg = true;
				}
			}
			else if(!digitFound && signFound && (c=='+' || c=='-') ) {
				break;
			}
			else if(!Character.isDigit(c)) {
				break;
			}
			else {
				if(!digitFound) {
					start = i;
					digitFound = true;
				}	
			}
		}
		if(digitFound) {
		end =i;
		String str = s.substring(start, end);
		if(str.isEmpty()){
			return 0;
		}
		try {
			num = Integer.parseInt(s.substring(start, end));
		}
		catch(NumberFormatException e) {
			if(neg) {
				return Integer.MIN_VALUE;
			}
			else {
				return Integer.MAX_VALUE;
			}
		}
		if(neg) {
			num = -num;
		}
		}
		return num;
    }
	
	public int myAtoi2(String s) {
	    int num = 0;
	    int sign = 1;
	    int i = 0;

	    // Skip leading whitespaces
	    while (i < s.length() && s.charAt(i) == ' ') {
	        i++;
	    }

	    // Check for sign
	    if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
	        sign = (s.charAt(i) == '-') ? -1 : 1;
	        i++;
	    }

	    while (i < s.length() && Character.isDigit(s.charAt(i))) {
	        int digit = s.charAt(i) - '0';

	        // Check for overflow
	        if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > 7)) {
	            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
	        }

	        num = num * 10 + digit;
	        i++;
	    }

	    return num * sign;
	}


}
