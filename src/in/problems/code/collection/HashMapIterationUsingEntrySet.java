package in.problems.code.collection;

import java.util.HashMap;
import java.util.Map;

import in.problems.code.commons.UserInput;

public class HashMapIterationUsingEntrySet {
	
	private static Map<Integer, Integer> doInsertElements() {
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		System.out.println("Enter Size of Your Choice :");
		int size=UserInput.getIntegerInput();
		for(int i=0;i<=size-1;i++) {
			System.out.println("Enter Key; ["+i+"]: ");
			int key=UserInput.getIntegerInput();
			System.out.println("Enter value; ["+i+"]: ");
			int value=UserInput.getIntegerInput();
			if(!map.containsKey(key)) {
				map.put(key, value);
			}else {
				System.out.println(key+" already exists");
			}
		}
		return map;
	}


	private static void doTraverseMap(Map<Integer, Integer> map) {
		if(!map.isEmpty()) {
			System.out.println("Map Traversal..");
			for(Map.Entry<Integer, Integer> m:map.entrySet()) {
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}else {
			System.out.println("Map is Empty..");
		}
	}
	

	public static void main(String[] args) {
		doTraverseMap(doInsertElements());
	}

	

}
