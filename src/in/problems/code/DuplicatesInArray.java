package in.problems.code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import in.problems.code.commons.UserInput;

public class DuplicatesInArray {
	
	public static void findDuplicates(int[] arr) {
		System.out.println("Duplicate elements:");
	    boolean found = false;

	    for (int i = 0; i < arr.length; i++) {
	        for (int j = i + 1; j < arr.length; j++) { 
	            if (arr[i] == arr[j]) {
	                System.out.println(arr[i]);
	                found = true;
	                break; 
	            }
	        }
	    }
	    }
	
	public static void findDuplicatesUsingStream(int[] arr) {
		List<Integer> list = Arrays.stream(arr).boxed().toList();

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = list.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toSet());
        System.out.println("Duplicate elements: " + duplicates);
	}

	public static void main(String[] args) {
		findDuplicates(UserInput.getArrayInput());
//		findDuplicatesUsingStream(UserInput.getArrayInput());
	}

}
