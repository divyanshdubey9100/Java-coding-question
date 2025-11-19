package in.problems.code.collection;

import in.problems.code.commons.UserInput;

public class SubArrayOfSumK {
	
	public static int subArraySum(int[] nums, int k) {
		int count =0;
		for(int start=0;start < nums.length;start ++) {
			int sum =0;
			for(int end=start;end < nums.length;end ++) {
				sum +=nums[end];
				if(sum == k) {
					count ++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(subArraySum(UserInput.getArrayInput(),UserInput.getIntegerInput()));

	}

}
