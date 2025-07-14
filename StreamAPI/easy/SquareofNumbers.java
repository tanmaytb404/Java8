package easy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SquareofNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers Space Separated");
		
		List<Integer> input = Arrays.stream(sc.nextLine().split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		
		System.out.println("Numbers:: ");
		input.forEach(System.out::print);
		
		System.out.println("Squere:: ");
		input.stream().map(i -> i*i).forEach(System.out::println);
	}
}
