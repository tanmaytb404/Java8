package medium;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortByLength {

	public static void main(String[] args) {
		// Given a list of strings, sort them based on their length.
		//taking input using stream api
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input strings:: ");
		List<String> input = Arrays.stream(sc.nextLine().split(" "))
				.peek(System.out::println)
				.collect(Collectors.toList());
		
		System.out.println("Sorting..... ");
		input.stream().sorted((a,b) -> a.length() - b.length())
			.forEach(str -> System.out.println(str + ", lenght: "+ str.length()));
	}

}
