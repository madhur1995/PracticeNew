package NewPackege;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamUser {

	public static void main(String[] args) {

		List<User> userList = List.of(new User(155, "Nima Roi", 27, "Femail", "HR", 2013, 22700),
				new User(123, "Ankit Tiwari", 28, "Mail", "Security", 2010, 10500),
				new User(125, "Aman Tiwari", 29, "Mail", "Developer", 2015, 21000),
				new User(129, "Chaman Tiwari", 25, "Mail", "HR", 2015, 16000),
				new User(135, "Yogi Tiwari", 23, "Mail", "IT Support", 2017, 19000),
				new User(160, "Chandni Tiwari", 28, "Femail", "Developer", 2019, 14000),
				new User(150, "Ritika Tiwari", 31, "Femail", "Security", 2017, 250000),
				new User(158, "Richa Tiwari", 24, "Femail", "IT Support", 2012, 13500),
				new User(162, "Atal Tiwari", 28, "Mail", "HR", 2013, 12500),
				new User(165, "Vikas Tiwari", 28, "Mail", "Security", 2014, 16500),
				new User(167, "Rachna Tiwari", 28, "Femail", "Developer", 2010, 19500),
				new User(169, "Poonam Tiwari", 28, "Femail", "IT Support", 2016, 15500));

		// System.out.println(userList);

		System.out.println("How many Male and Female members are there in the organization?");

		long mailCount = userList.stream().filter(x -> x.getGender().equals("Mail")).count();

		System.out.println("Total Males :" + mailCount);

		long femailCount = userList.stream().filter(x -> x.getGender().equals("Femail")).count();

		System.out.println("Total Females :" + femailCount);

		Map<String, Long> mailfemailcount = userList.stream()
				.collect(Collectors.groupingBy(User::getGender, Collectors.counting()));

		System.out.println(mailfemailcount);

		System.out.println("*************************************************************");

		System.out.println("Print the name of all departments in the organization?");

		// userList.stream().map(User::getDeaprtment).distinct().forEach(System.out::println);

		userList.stream().map(x -> x.getDeaprtment()).distinct().forEach(System.out::println);

		System.out.println("*************************************************************");

		System.out.println("Average age of Male & Femail? ");

		double maleAverage = userList.stream().filter(x -> x.getGender().equals("Mail")).mapToInt(x -> x.getAge())
				.summaryStatistics().getAverage();

		System.out.println("Male Average :" + maleAverage);

		double femailAverage = userList.stream().filter(x -> x.getGender().equals("Femail")).mapToInt(x -> x.getAge())
				.summaryStatistics().getAverage();

		System.out.println("Female Average :" + femailAverage);

		Map<String, Double> avgAgeMaleFemale = userList.stream()
				.collect(Collectors.groupingBy(User::getGender, Collectors.averagingInt(User::getAge)));

		/*
		 * Map<String, Double> avgAgeMaleFemale = userList.stream()
		 * .collect(Collectors.groupingBy(User::getGender,
		 * Collectors.averagingInt(x->x.getAge())));
		 */

		System.out.println(avgAgeMaleFemale);

		System.out.println("*************************************************************");

		System.out.println("Details of Highest paid employees in the Organization");

		Optional<User> usr = userList.stream().max(Comparator.comparing(User::getSalary));

		System.out.println(usr);
		System.out.println(usr.get().getName());

		System.out.println("*************************************************************");

		System.out.println("Name of User who joined after 2015");

		List<User> user1 = userList.stream().filter(x -> x.getYoj() > 2015).collect(Collectors.toList());
		System.out.println(user1);

		userList.stream().filter(x -> x.getYoj() > 2015).map(x -> x.getName()).forEach(System.out::println);

		System.out.println("*************************************************************");

		System.out.println("Count the no of Users in each department");

		Map<String, Long> userInEachDep = userList.stream()
				.collect(Collectors.groupingBy(User::getDeaprtment, Collectors.counting()));

		System.out.println(userInEachDep);

		userInEachDep.entrySet().forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));

		System.out.println("*************************************************************");

		System.out.println("Average salary of each Department");

		Map<String, Double> avgOfEachDep = userList.stream()
				.collect(Collectors.groupingBy(User::getDeaprtment, Collectors.averagingDouble(User::getSalary)));

		avgOfEachDep.entrySet().forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));

		System.out.println("*************************************************************");

		System.out.println("Youngest mail in HR Department");

		System.out.println("BEST");

		Optional<User> youngestInHr = userList.stream()
				.filter(x -> x.getGender().equals("Mail") && x.getDeaprtment().equals("HR"))
				.min(Comparator.comparing(User::getAge));

		System.out.println(youngestInHr);

		System.out.println("*************************************************************");

		System.out.println("Most Working Exp in the Organization");

		Optional<User> user2 = userList.stream().sorted(Comparator.comparing(User::getYoj)).findFirst();

		System.out.println(user2);

		System.out.println("*************************************************************");

		System.out.println("Names of Users in Each Department");

		Map<String, List<User>> listOfUserInEachDept = userList.stream()
				.collect(Collectors.groupingBy(User::getDeaprtment));

		listOfUserInEachDept.entrySet().forEach(i -> System.out.println(i.getKey() + " " + i.getValue()));

		System.out.println("*************************************************************");

		List<Integer> intList = Arrays.asList(1, 5, 8, 4, 2, 7);

		int max1 = intList.stream().max((x1, x2) -> x1 - x2).get();

		System.out.println("Max is :" + max1);

		int min1 = intList.stream().min((x1, x2) -> x1 - x2).get();

		System.out.println("Min is :" + min1);

		int sum = intList.stream().filter(i -> i % 2 != 0).map(i -> i * i).reduce(0, (x, y) -> x + y);

		System.out.println(sum);

		System.out.println("*************************************************************");

		System.out.println("Sort based on FirstName if same the LastNme of Employees");

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Amit", "Bansal", "IT"));
		empList.add(new Employee("KP", "Acharya", "Sales"));
		empList.add(new Employee("Amit", "Tiwari", "HR"));
		empList.add(new Employee("Aman", "Bansal", "Sales"));
		empList.add(new Employee("KP", "Singh", "Sales"));
		empList.add(new Employee("Yogi", "Kawad", "Marketing"));
		empList.add(new Employee("Madhur", "Patel", "IT"));
		empList.add(new Employee("Ritika", "Patel", "HR"));

		empList.sort(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName));

		System.out.println(empList);

		Map<String, Long> empMap = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		System.out.println(empMap);

	}
}
