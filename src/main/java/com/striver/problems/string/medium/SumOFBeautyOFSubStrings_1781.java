package com.striver.problems.string.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Leet : https://leetcode.com/problems/sum-of-beauty-of-all-substrings/description/
 * 
 * Status : TLE (Inconsistent Result)
 * 
 * Diff : Medium
 */
public class SumOFBeautyOFSubStrings_1781 {
	
	/**
	 * Store each subString freq in map and fetch max & min
	 * 
	 * Expl for TLE : Checked optimal solution, 
	 * but they have user arr[] of size 26 instead of HashMap
	 * 
	 * @param s
	 * @return
	 */
	public int beautySum(String s) {
		int n = s.length();
		int beauty = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				Map<Character, Integer> map = new HashMap<Character, Integer>();

				String str = s.substring(i, j + 1);
				if (str.length() == 1 || str.length() == 2)
					continue;
				char[] charArr = str.toCharArray();
				for (char ch : charArr) {
					map.put(ch, map.getOrDefault(ch, 0) + 1);
				}
				// Find the min
				int[] minMax = findMinMax(map);
				beauty += (minMax[1] - minMax[0]);
			}
		}
		return beauty;
	}
    	   
//    	   Integer min = Integer.MAX_VALUE;
//    	   char minChar;
//           Integer max = Integer.MIN_VALUE;
//           String str = s.substring(i, j+1);
//           for(char ch: str.toCharArray()) {
//               
//               map.put(ch, map.getOrDefault(ch, 0) + 1); // a=2, b=2,c=1 = 2-1 = 1
////               max = Math.max(max, map.get(ch));
////               min = Math.min(min, map.get(ch));
//                if(Math.max(max, map.get(ch)) == max) {
//                    min = Math.min(min, map.get(ch));
//                }
//                else if(Math.min(min, map.get(ch)) == min) {
//                    max = Math.max(max, map.get(ch)); // 2
//                }
//           }
//           // Find the min
//           // int[] minMax = findMinMax(map);
//           // max = Math.max(max, map.get(ch));
//           // min = Math.min(min, map.get(ch));
//           if(min != Integer.MAX_VALUE &&  max != Integer.MIN_VALUE)
//        	   beauty += (max-min); // 1
//       }
//   }
//   return beauty;
//}

private int[] findMinMax(Map<Character, Integer> map) {
   Integer min = Integer.MAX_VALUE;
   Integer max = -1;
   for(Integer value: map.values()) {
       min = Math.min(min, value);
       max = Math.max(max, value);
   }
   return new int[] {min, max};
}
}
