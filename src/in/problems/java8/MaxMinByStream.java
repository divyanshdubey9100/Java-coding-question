package in.problems.java8;

import java.util.Arrays;

import in.problems.code.commons.UserInput;

public class MaxMinByStream {

	public static int doFindMax(int[] arr) {
		System.out.println("min: "+ doFindMin(arr));
		return Arrays.stream(arr).max().orElseThrow();
	}

	public static int doFindMin(int[] arr) {
		return Arrays.stream(arr).min().orElseThrow();
	}

	public static void main(String[] args) {
		System.out.println("max: "+doFindMax(UserInput.getArrayInput()));
	}
}
