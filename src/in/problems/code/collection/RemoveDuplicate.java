package in.problems.code.collection;

import java.util.List;
import java.util.stream.Collectors;

import in.problems.code.commons.UserInput;

public class RemoveDuplicate {
	
	public static List<Integer> doRemoveDuplicate(List<Integer> list){
		return list.stream().distinct().collect(Collectors.toList());
	}

	public static void main(String[] args) {
		UserInput.traverseListOfIntegers(doRemoveDuplicate(UserInput.listUserInput()));
	}

}
