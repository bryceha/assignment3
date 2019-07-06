
public class Methods {
		// when calling a method have to have parenthesis! 
	public static void main(String[] args) {

		int[] myArray = new int[3];
		myArray[0] = 7;
		myArray[1] = 10;
		myArray[2] = 8;
		
		System.out.println(sumArray(myArray));
		
		double[] grades = new double[5];
		grades[0] = 88.7;
		grades[1] = 92.5;
		grades[2] = 100;
		grades[3] = 67.3;
		grades[4] = 78.9;
		
		System.out.println(calculateAverage(grades));
		
		System.out.println(multiplyString("Hello", 3));
		
		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName(firstName, lastName);
		// argument in parameter. args = car parameter = parking spot
		String fullName2 = createFullName("Sam", lastName);
		
		System.out.println(fullName);
		System.out.println(fullName2);

	}

	public static String createFullName(String x, String y) { //this is the method signature; rest is method body
		// use public static for all methods for now
		// give method name that is a verb, action, and makes sense. Descriptive!
		return x + " " + y;
		// when write a method nothing happens
		// declaring a method is like writing instructions
		// methods can be used over and over; are generic
		// methods should have ONE job!
		// reads like a recipe
		// different jobs require different methods
		// when coding SAY IT IN ENGLISH!!! Verbalize to know what to do
		// understand, then practice practice practice
		// first write method, then it needs to be called, invoked. It has to be actually done
		// methods can be like building blocks
		// detach yourself from your code. 
		// can't refer to variable names until they've been declared 
		// you have the power to do almost anything, but it won't be easy
		
		
	}
	
	/* 
	 *  Takes an array of ints and returns the sum of all
	 */
	public static int sumArray(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	/* 
	 *  Takes an array of double and returns the average of all
	 */
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}
	
	
	/* 
	 *  Takes a String and an int and returns the String concatenated
	 *  with itself int number of times
	 */
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}

}
