package easy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strings Space Separated");
		List<String> input = Arrays.stream(sc.nextLine().split(" "))
				.collect(Collectors.toList());
		
		System.out.println("Strings starting with A: ");
		input.stream()
		.filter(str -> str.charAt(0) == 'A' || str.charAt(0) == 'a')
		.forEach(System.out::println);
	}

}
