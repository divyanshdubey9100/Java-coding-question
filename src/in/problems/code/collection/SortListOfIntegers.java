package in.problems.code.collection;

import java.util.List;

import in.problems.code.commons.UserInput;

public class SortListOfIntegers {

	public static List<Integer> sortList(List<Integer> list){
		return list.stream().sorted().toList();
	}
	
	public static void main(String[] args) {
		System.out.println(sortList(UserInput.listUserInput()));
		
	}

}
