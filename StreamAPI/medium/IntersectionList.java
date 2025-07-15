package medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionList {
	/* Use streams to find the intersection of two lists of integers. */
	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1,2,3,4,5);
		List<Integer> l2 = Arrays.asList(2,4,6);
		
		List<Integer> l3 = l1.stream()
				.distinct()
				.filter(l2::contains)
				.collect(Collectors.toList());
		System.out.println("Common in both: ");
		l3.forEach(System.out::println);
	}	
}
