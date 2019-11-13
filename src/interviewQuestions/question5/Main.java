package interviewQuestions.question5;

public class Main {
	
	//How do you reverse an array in place in Java?
	
	//[1,2,3,4,5,6,7,8,9,10]

	public static void main(String[] args) {
		
		int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < array.length/2; i++) {
			int front = array[i];
			int back = array[array.length-i-1];
			array[i] = back;
			array[array.length-i-1] = front;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}

	}

}
