import java.util.Arrays;

public class arraysYTLesson {

	public static void main(String[] args) {
		// array is a box with little boxes in it
		// boxes are numbered with indexes
		
		int[] randomArray;
		//fixed size!!
		
		int[] numberArray = new int[10];
		
		randomArray = new int[20];
		randomArray[1] = 2;
		
		String[] stringArray = {"just", "random", "words"};
		
		for(int i = 0; i < numberArray.length; i++) {
			
			numberArray[i] = i;
		}
		
		int k = 1;
		while(k <= 41) {System.out.print('-'); k++; }
		System.out.println();
		
		for(int j = 0; j < numberArray.length; j++) {
			System.out.print("| " + j + " ");
		}
		System.out.println("|");
		
		String[][] multiArray = new String[10][10];
		
		for(int i = 0; i < multiArray.length; i++) {
			for(int j = 0; j < multiArray[i].length; j++) {
				multiArray[i][j] = i + " " + j;
			}
		}
		
		k = 1;
		while(k <= 61) { System.out.print('-'); k++; }
		System.out.println();
		
		for(int i = 0; i < multiArray.length; i++) {
			for(int j = 0; j < multiArray[i].length; j++) {
				System.out.print("| " + multiArray[i][j] + " ");
			}
			System.out.println("|");
		}
		
		k = 1;
		while(k <= 61) {System.out.print('-'); k++;}
		System.out.println();
		
		for(int row : numberArray) {
			System.out.print(row);
		}
		System.out.println("\n");
	}

}
