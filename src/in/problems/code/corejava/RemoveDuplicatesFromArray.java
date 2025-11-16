package in.problems.code.corejava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import in.problems.code.commons.UserInput;

public class RemoveDuplicatesFromArray {

	public static void removeDuplicates(int[] arr) {
		Arrays.sort(arr);
		int[] temp = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[arr.length - 1];
		System.out.print("Array without duplicates: ");
		for (int i = 0; i < j; i++) {
			System.out.print(temp[i] + " ");
		}
	}

	public static void removeDuplicatesJava8(int[] arr) {
		List<Integer> list = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
		System.out.println("Array without duplicates: " + list);
	}

	public static void main(String[] args) {
		removeDuplicates(UserInput.getArrayInput());

	}

}
