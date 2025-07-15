package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
class Employee{
	String name;
	String dept;
	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
}
public class GroupByDept {
	public static void main(String[] args) {
		// Given a list of Employee objects, group them by department.
		//taking input using stream api
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees: ");
		int n = sc.nextInt();
		sc = new Scanner(System.in);
		List<Employee> inputs = new ArrayList<>();
		for(int  i =1; i<=n; i++) {
			System.out.println("Enter " + i +"th employee name and dept space separed");
			List<String> lst = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
			inputs.add(new Employee(lst.get(0), lst.get(1)));
		}
		System.out.println("------Employees-------\n");
		inputs.forEach(e -> System.out.println("name: "+e.name+" dept: "+e.dept));
		
		System.out.println("\n------Employees GroupBY-------");
		Map<String, List<Employee>> grouped = inputs.stream()
		.collect(Collectors.groupingBy(e -> e.dept));
		
		grouped.forEach((dept, empArr) -> {
			System.out.print("Dept: " + dept + " employees: ");
			empArr.forEach(e -> System.out.print(e.name+" "));
			System.out.println();
		});
	}
}
