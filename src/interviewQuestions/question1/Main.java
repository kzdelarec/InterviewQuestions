package interviewQuestions.question1;

public class Main {
	
	
	
	//How do you find the missing number in a given integer array of 1 to n?

	//[1,2,3,4,5,6,8,...,n]
	
	public static void main(String[] args) {
		
		int[] array = new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,17,18,19,20,22,23,24,25,26,28,29,30};
		
		for (int i = 0; i < array.length; i++) {
			int current = array[i];
			int next = 0;
			if( i != array.length-1) {
				next = array[i+1];
			}
			if (next != 0 && (next - current) > 1 ) {
				System.out.println("Number " + (current + 1) + " is mssing from array");
			} 
		}
	}
}
