package com.striver.problems.arrays.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * CN : https://www.codingninjas.com/studio/problems/superior-elements_6783446?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0
 * Status : Done
 */
public class SuperiorElements_CN {
	public static List< Integer > superiorElements(int []a) {
        int maxSum = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for(int i=a.length-1;i>=0;i--){
            if(maxSum<a[i]){
                list.add(a[i]);
                maxSum = a[i];
            }
        }
        Collections.sort(list);
        return list;
    }
}
