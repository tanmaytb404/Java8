package easy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*Given a list of integers, return a list containing only even numbers.*/
public class FilterEvenNumbers {
	public static void main(String[] args) {
		//taking input using stream api
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers: space-separated");
		List<Integer> input = Arrays.stream(sc.nextLine().split(" "))
							.map(Integer::parseInt)
							.collect(Collectors.toList());
		List<Integer> res = input.stream()
							.filter(e -> e % 2 == 0)
								.collect(Collectors.toList());
		res.forEach(System.out::println);
	}
}
