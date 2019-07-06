
public class Students {

	public static void main(String[] args) {

		String studentName1 = "Tom Sawyer";
		String studentName2 = "Jack Smith";
		String studentName3 = "Bill Turner";
		// privative data types are lower case, objects are capitalized
		// "new" keyword is used to create a new instance of the object
		System.out.println(studentName1);
		
		
		String[] students = new String[3];
		// any data type plus [] is an array
		// have to use the new keyword; is an object
		// then repeat same type with exact number
		
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";
		students[2] = "Bill Turner";
		
		System.out.println(students[0]);
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		System.out.println("Enhanced for loop:");
		
		for (String student : students) {
			System.out.println(student);
		}
		
		String[] products = new String[5];
		
		products[0] = "Carrots";
		products[1] = "Pineapple";
		products[2] = "Tomatoes";
		products[3] = "Potatoes";
		products[4] = "Cereal";
		
		for (String product : products) {
			System.out.println("Product: " + product);
		}
		
		int[] multiplesOf3 = new int[10];
		
		for (int i = 1; i <= multiplesOf3.length; i++) {
			multiplesOf3[i - 1] = i * 3;
			System.out.println("number: " + multiplesOf3[i - 1]);
		}
		
		int[] multiplesOf5 = new int[10];
		
		for (int i = 0; i < multiplesOf5.length; i++) {
			multiplesOf5[i] = (i + 1) * 5;
			System.out.println(multiplesOf5[i]);
		}
	}

}

		// rule of thumb to spell out identifiers all the way
		// method: subprogram that can be called over and over just by using its name
		// \n new line. (escape character) \t tab
		// parameters don't have values; they are place-holders (vending machine)
