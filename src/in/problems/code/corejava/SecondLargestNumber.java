package in.problems.code.corejava;

import java.util.Arrays;
import java.util.Comparator;

import in.problems.code.commons.UserInput;

public class SecondLargestNumber {
	
	public static int findSecondLargest(int[] arr) {
		int largest=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int num:arr) {
			if(num > largest) {
				second=largest;
				largest=num;
			}else if(num > second && num != largest) {
				second=num;
			}
		}
		return second;
	}
	
	public static int findSecondLargestJava8(int[] arr) {
		return  Arrays.stream(arr)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.distinct()
				.skip(1)
				.findFirst()
				.orElseThrow(()-> new RuntimeException("Second Largest Element Not found"));
	}

	public static void main(String[] args) {
//		System.out.println(findSecondLargest(UserInput.getArrayInput()));
		System.out.println(findSecondLargestJava8(UserInput.getArrayInput()));

	}

}
