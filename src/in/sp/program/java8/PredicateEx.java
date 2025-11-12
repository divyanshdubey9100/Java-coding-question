package in.sp.program.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(11,22,7,66,1,5,99,10,22);
//		list.sort((a,b)-> a.compareTo(b));//or
//		list.sort(Integer::compareTo);
//		list.forEach(System.out::println);
		
		
//		list.sort((a,b)-> b.compareTo(a));//or
//		list.sort(Integer::compare);
//		list.forEach(System.out::println);
		
		Predicate<Integer> isEven=n -> n % 2== 0;
//		list.stream().mapToInt(i -> i).filter(i-> isEven.test(i)).forEach(System.out::println);
//		List<Integer> integers=list.stream().filter(isEven).collect(Collectors.toList());
		
		Function<Integer, Integer> square= n->n*n;
		
		Function<Integer, Integer> doubleNum= n-> n*2;
		
		Integer  doubleAndApply=doubleNum.andThen(square).apply(10);
		System.out.println(doubleAndApply);
	}

}
