package com.striver.problems.string.medium;

/**
 * Leet : https://leetcode.com/problems/reverse-words-in-a-string/description/
 * 
 * Difficulty : Medium
 * 
 * Status : Done
 */
public class ReverseWordsInString_151 {
	public String reverseWords(String s) {
        String[] strArr = s.split("\\s+");
        StringBuilder sb = new StringBuilder("");
        int n = strArr.length;
        for(int i=n-1;i>=0;i--){
        	if(strArr[i].matches("\\s+") || strArr[i].isBlank())
        		continue;
        	if(i!=n-1){
                sb.append(" ");
            }
            sb.append(strArr[i]);
        }
        return sb.toString();
    }

}
