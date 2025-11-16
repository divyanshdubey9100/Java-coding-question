package in.problems.code;

import in.problems.code.commons.UserInput;

public class FindMissingNumFromArray {
	public static int missingNum(int[] arr) {
		int n=arr.length+1;
		int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i=0;i<arr.length;i++) {
            actualSum += arr[i];
        }

        return expectedSum - actualSum;
	}

	public static void main(String[] args) {
		System.out.println("missing num : "+missingNum(UserInput.getArrayInput()));
	}

}
