package in.problems.code.corejava;

import java.util.HashMap;
import java.util.Map;

import in.problems.code.commons.UserInput;

public class FindTheTwoSum {
	
	public static int[] doSumOfTwoIntegers(int[] arr,int sum) {
		int diff=0;
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			diff=sum - arr[i];
			if(map.containsKey(diff)) 
				return new int[] {map.get(diff),i};
			map.put(arr[i], i);
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		int[] res=doSumOfTwoIntegers(UserInput.getArrayInput(), UserInput.getIntegerInput());
		UserInput.traverseArrayOfInt(res);

	}

}
