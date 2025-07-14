package easy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		System.out.println("Enter numbers space separed:: ");
		Scanner sc = new Scanner(System.in);
		List<Integer> input = Arrays.stream(sc.nextLine().split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		System.out.println("Numbers:: ");
		input.forEach(i -> System.out.print(i+ " "));
		
		System.out.println("Removing dups");
		List<Integer> uniqueInput = input.stream().distinct().toList();
		uniqueInput.forEach(i -> System.out.print(i+ " "));
		
	}
}
