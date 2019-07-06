import java.util.Arrays;

public class assignment3ArraysAndMethods {

	public static void main(String[] args) {

		// question 1
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93, 30 };
		double[] exactAges = { 3.25, 9.3, 23, 64.16, 2.5, 8.8, 28.75, 93.9, 30 };
		double[] exactAgesGroup2 = { 22.8, 25.6, 35.7, 34.2, 30.0 };

		int first = ages[0];
		int last = ages[ages.length - 1];

		System.out.println("First element subtracted from last: " + (last - first));

		System.out.println("Average age: " + calculateAverage(ages));

		// question 2
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

		double sum = 0;

		for (int i = 0; i < names.length; i++) {
			sum += names[i].length();
		}
		System.out.println("Average letters per name: " + sum / names.length);

		System.out.print("Names: ");

		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println("");

		// question 5
		int[] nameLengths = new int[names.length];
		
		System.out.print("Letters: ");

		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
			System.out.print(names[i].length() + "    ");
		}
		System.out.println("");
		
		// question 6
		int nameLengthSum = 0;
			
		for (int nameLength : nameLengths) {
			nameLengthSum += nameLength;
		}
			
		System.out.println("Their sum is: " + nameLengthSum);

		System.out.print(concatenateTimes("Hello", 3));

		String firstName = "Ricky";
		String lastName = "Rubio";
		String fullName = makeFullName(firstName, lastName);

		System.out.println(fullName);

		System.out.println("Greater than 100? " + (greaterThan100(ages) > 100));

		System.out.println("Exact average age: " + exactAverageAge(exactAges));

		System.out.println("Is average age of first group higher? " + compareAverageAges(exactAges, exactAgesGroup2));

		double[] concatenate = combine(exactAges, exactAgesGroup2);

		System.out.println("Combined groups: " + Arrays.toString(concatenate));

		System.out.println("Average of all ages: " + exactAverageAge(combine(exactAges, exactAgesGroup2)));

		int highTempToday = 105;
		boolean isHotToday = highTempToday > 90;
		double moneyInWallet = 95.40;

		System.out.println("Will I buy a drink today? " + willBuyDrink(isHotToday, moneyInWallet));
	}

	public static double calculateAverage(int[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}

	// question 7
	public static String concatenateTimes(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}

	// question 8
	public static String makeFullName(String firstName, String lastName) {
		return " " + firstName + " " + lastName;
	}

	// question 9
	public static int greaterThan100(int[] ages) {
		int sum = 0;
		for (int age : ages) {
			sum += age;
		}
		return sum;
	}

	// question 10
	public static double exactAverageAge(double[] decimalAges) {
		double sum = 0;
		for (double decimalAge : decimalAges) {
			sum += decimalAge;
		}
		return sum / decimalAges.length;
	}

	// question 11
	public static boolean compareAverageAges(double[] groupOne, double[] groupTwo) {
		double groupOneAverage = exactAverageAge(groupOne);
		double groupTwoAverage = exactAverageAge(groupTwo);
		return (groupOneAverage > groupTwoAverage);
	}

	// question 12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;

	}

	// question 13
	// method combines my arrays so I can get an average age between both groups
	public static double[] combine(double[] group1, double[] group2) {
		double length = group1.length + group2.length;
		double[] result = new double[(int) length];
		System.arraycopy(group1, 0, result, 0, group1.length);
		System.arraycopy(group2, 0, result, group1.length, group2.length);
		return result;
	}
}
