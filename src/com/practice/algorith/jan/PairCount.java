package com.practice.algorith.jan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PairCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 9;
		int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};

//		System.out.println(calculate(n, arr));
		
		
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> rotate = new ArrayList<Integer>();
		
		a.add(1);
		a.add(2);
		a.add(4);
		a.add(3);

		rotate.add(0);
		rotate.add(2);
		
		List<Integer> res = getMaxElementIndexes(a,rotate);
		
		for(Integer s : res) {
			System.out.println(s);
		}
		
	}

	private static int calculate(int n, int[] arr) {

		int pair = 0; 
		HashMap<Integer, Integer> pairMap = new HashMap<Integer, Integer>();

		for(int i =0; i<n; i++){
			if(pairMap.get(arr[i]) != null){
				int val = (int) pairMap.get(arr[i]);
				pairMap.put(arr[i], val+1 );
			}else{
				pairMap.put(arr[i],1);
			}
		}
		
		for(Integer key : pairMap.keySet()) {
			pair = pair + pairMap.get(key)/2;
		}

		return pair;

	}
	
	public static List<Integer> getMaxElementIndexes(List<Integer> a, List<Integer> rotate) {
	    // Write your code here
	    List<Integer> res = new ArrayList<Integer>();

	    int indice = 0;
	    for(int j=0; j< rotate.size(); j++){

	        int rotationVal = (int)rotate.get(j);
	        if(rotationVal == 0){
	            res.add(indice, getMaxValue(a));
	            indice++;
	        }else{

	            for(int k=0; k < rotationVal ; k++){
	                int temp = (int)a.get(0);
	                for(int z=1; z<a.size(); z++){
	                    a.set(z-1, a.get(z));
	                }
	                a.set(a.size()-1, temp);
	            }
	            res.add(indice, getMaxValue(a));
	            indice++;
	        }

	    }

	    return res;
	    }

	    public static int getMaxValue(List<Integer> listVal){
	        int maxVal = (int)listVal.get(0);
	        int maxIndx = 0;
	        for(int i=1; i<listVal.size(); i++){
	            if(maxVal < listVal.get(i)){
	                maxVal = listVal.get(i);
	                maxIndx = i;
	            }
	        }

	    return maxIndx;
	    }


}
