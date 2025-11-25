package in.sp.program.java8;

import java.util.Arrays;
import java.util.List;

public class FunctionalInterafaceEx {
	public static void main(String[] args)
	    {
	        List<Integer> numbers
	            = Arrays.asList(11, 22, 33, 44,
	                            55, 66, 77, 88,
	                            99, 100);
	        numbers.forEach(System.out::println);

	        // External iterator
	      //  for (int i = 0; i < numbers.size(); i++) {
	        //    System.out.print(numbers.get(i) + " ");
	        //}
	    }
}
