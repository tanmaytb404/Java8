package medium;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LongestString {

	public static void main(String[] args) {
		// taking input using stream api
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter input strings:: ");
			List<String> input = Arrays.stream(sc.nextLine().split(" ")).peek(System.out::println)
					.collect(Collectors.toList());
			
			System.out.println("Longest:");
			input.stream().sorted((a, b) -> b.length() - a.length()).limit(1).forEach(System.out::println);
			System.out.println("Type Yes to test again: ");
			String flag = sc.nextLine();
			if (!flag.equalsIgnoreCase("yes"))
				break;
		}
	}

}
