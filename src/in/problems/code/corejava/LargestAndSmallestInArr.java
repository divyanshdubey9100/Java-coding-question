package in.problems.code.corejava;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import in.problems.code.commons.UserInput;

public class LargestAndSmallestInArr {
	
	public static void findLargestAndSmallest(int[] arr) {
		int smallest=arr[0],largest=arr[0];
		for(int num:arr) {
			if(num < smallest) {
				smallest=num;
			}else if(num > largest) {
				largest=num;
			}
		}
		System.out.println("Smallest: "+smallest+" Larest: "+largest);
	}
	
	public static void findLargestAndSmallestyCollecion(int[] arr) {
		int smallest=arr[0],largest=arr[0];
		List<Integer> list=Arrays.stream(arr).boxed().toList();
		smallest = Collections.min(list);
		largest = Collections.max(list);
		System.out.println("Smallest: "+smallest+" Larest: "+largest);
	}

	public static void main(String[] args) {		
		findLargestAndSmallest(UserInput.getArrayInput());
		

	}

}
