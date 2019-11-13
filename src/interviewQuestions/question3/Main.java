package interviewQuestions.question3;

public class Main {

	//How do you find the largest and smallest number in an unsorted integer array?
	
	//[5,1,6,7,3,4,8,2,9]
	
	public static void main(String[] args) {
		
		int [] array = new int[] {5,1,6,7,3,4,8,2,9};
		
		//let's assume that the largest number can not be greater than 1000000000
		int min = 1000000000;
		
		//let's assume that the largest number can not be smaller than 0
		int max = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > max) {
				max = array[i];
			} else if (array[i] < min) {
				min = array[i];
			}
			
		}
		
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		
	}

}
