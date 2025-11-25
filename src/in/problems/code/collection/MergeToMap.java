package in.problems.code.collection;

import java.util.HashMap;
import java.util.Map;

import in.problems.code.commons.UserInput;

public class MergeToMap {


	private static Map<Integer, Integer> doMergeTwoMapsJava8(Map<Integer, Integer> map1,
			Map<Integer, Integer> map2) {
		Map<Integer, Integer> map=new HashMap<Integer, Integer>(map1);
		map2.forEach((k,v)-> map.merge(k, v, Integer::sum));
		return map;
	}
	
	private static Map<Integer, Integer> doMergeTwoMaps(Map<Integer, Integer> map1,
		Map<Integer, Integer> map2) {
		Map<Integer, Integer> map=new HashMap<Integer, Integer>(map1);
		map.putAll(map2);
	return map;
}


	public static void main(String[] args) {
		Map<Integer, Integer> map1=UserInput.mapUserInput();
		Map<Integer, Integer> map2=UserInput.mapUserInput();
		
		UserInput.traverseMapOfIntegers(doMergeTwoMaps(map1,map2));
		UserInput.traverseMapOfIntegers(doMergeTwoMapsJava8(map1,map2));
	}
}
