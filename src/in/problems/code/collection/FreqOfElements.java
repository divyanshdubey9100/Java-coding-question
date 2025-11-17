package in.problems.code.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import in.problems.code.commons.UserInput;

public class FreqOfElements {
	
	public static int[] frequencyOfElements(int[] arr) {
		int n=arr.length;
		int[] freq = new int[n];
		boolean[] visited = new boolean[n];

		for (int i = 0; i < n; i++) {
			if (visited[i]) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}
			}
			freq[i] = count;
		}
		// Fill in frequencies for visited elements
		for (int i = 0; i < n; i++) {
			if (visited[i]) {
				freq[i] = 0; // or any other value indicating already counted
			}
		}

		return freq;
	}
	
	public static List<Integer> frequencyOfElementsJava8(int[] arr) {
		return  Arrays.stream(arr)
				.boxed()
				.collect(Collectors.groupingBy(e->e,Collectors.counting()))
				.values()
				.stream()
				.map(Long::intValue)
				.toList();
	}
	
	public static void main(String[] args) {
		UserInput.traverseListOfIntegers(frequencyOfElementsJava8(UserInput.getArrayInput()));
	}
}
