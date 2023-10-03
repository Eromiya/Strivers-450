package com.striver.problems.string.medium;

public class LongestPalindromicSubstring_5 {
//	 public String longestPalindrome(String s) {
//		 int len = s.length();
//		 int maxLen = 0;
//		 String out ="";
//		 for(int i=0;i<len;i++) {
//			 for(int j= len-1;j>=i;j--) {
//				 String subString = s.substring(i, j+1);
////				 int mid = subString.length()%2==0? (i + j)/2: ((i + j)/2
//				 if(subString.length()%2==0) {
//					 int mid = (i + j)/2;
//					 String tempFirst = subString.substring(i, mid+1);
//					 String tempSec = subString.substring(mid+1, j+1);
//					 StringBuilder sb = new StringBuilder(tempFirst);
//					 if(tempSec.equals(sb.reverse().toString())) {
//						 if(maxLen < subString.length()) {
//							 maxLen = subString.length();
//							 out = subString;
//						 }
//					 }
//				 }
//				 else {
//					 int mid = ((i + j)/2)+1;
//					 String tempFirst = subString.substring(i, mid+1);
//					 String tempSec = subString.substring(mid, j+1);
//					 StringBuilder sb = new StringBuilder(tempFirst);
//					 if(tempSec.equals(sb.reverse().toString())) {
//						 if(maxLen < subString.length()) {
//							 maxLen = subString.length();
//							 out = subString;
//						 }
//					 }
//				 }
//				 
//			 }
//		 }
//		 return out;
//	 }

	/**
	 * 
	 * @param s
	 * @return
	 */
	public String longestPalindrome(String s) {
		int maxLength = 0;
		String palStr = "";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++){
				String sub= s.substring(i, j+1);
				if(pal(sub)) {
					if(sub.length()> maxLength) {
						maxLength = sub.length();
						palStr = sub;
					}
				}
			}
		}
		return palStr;
	}
	
	public static boolean pal(String sub){

		for(int start=0, end = sub.length()-1; start<end;start++, end--) {
			if(sub.charAt(start) != sub.charAt(end))
				return false;
		}
		return true;
		
	}
	
	
	/**
	 * Approach 1 
	 * Getting TLE 
	 * 
	 * 
	 * 
	 * @param s
	 * @return
	 */
	public String longestPalindrome1(String s) {
		int len = s.length();
		int maxLen = 0;
		String out = "";
		for (int i = 0; i < len; i++) {
			for (int j = len - 1; j >= i ; j--) {
				String tempStr = s.substring(i, j + 1);
				int tempStrLen = tempStr.length();
				int mid = i + (j - i) / 2;
				boolean palFound = false;
				if (tempStrLen % 2 == 0) {
					String tempStr1 = s.substring(i, mid + 1);
					StringBuilder sb = new StringBuilder(tempStr1);
					if (s.substring(mid + 1, j + 1).equals(sb.reverse().toString())) {
						palFound = true;
					}
				} else {
					String tempStr1 = s.substring(i, mid);
					StringBuilder sb = new StringBuilder(tempStr1);
					if (s.substring(mid + 1, j + 1).equals(sb.reverse().toString())) {
						palFound = true;
					}
				}

				if (palFound) {
					if (maxLen < tempStr.length()) {
						maxLen = tempStr.length();
						out = tempStr;
					}
					if(maxLen == len-i) {
						return out;
					}
				}
			}
		}
		return out;
	}
	
	

}
