package easy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Strings2Uppercase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strings Space Separated");
		List<String> input = Arrays.stream(sc.nextLine().split(" "))
				.collect(Collectors.toList());
		
		System.out.println("Result:: ");
		input.stream().map(String::toUpperCase).forEach(System.out::println);
	}
}
