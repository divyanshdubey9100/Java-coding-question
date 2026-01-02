package in.problems.java8;

import java.util.List;

import in.problems.code.commons.UserInput;

public class FilterEvenNumber {
	
	public static List<Integer> filterEvenNumber(List<Integer> list){
		return list.stream().filter(n-> n % 2 ==0 ).toList();
	}
	
	public static void main(String[] args) {
		UserInput.traverseListOfIntegers(filterEvenNumber(UserInput.listUserInput()));
	}

}
