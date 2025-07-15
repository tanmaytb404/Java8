package medium;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class CalculateAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> input = Arrays.stream(sc.nextLine().split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		
		System.out.println("Average:: \n");
		double avg = input.stream().mapToInt(e -> e)
		.average().orElse(0);
		
		System.out.println(avg);
	}
}
