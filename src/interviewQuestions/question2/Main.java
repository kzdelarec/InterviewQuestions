package interviewQuestions.question2;

public class Main {
	
	//How do you find the duplicate number on a given integer array?
	
	//[1,2,3,4,4,5,6,7,8,8,9,10]

	public static void main(String[] args) {
		
		int [] array = new int[] {1,1,2,6,3,4,4,5,6,7,8,8,9,10,10};
		int [] array2 = new int[array.length];
				
		for (int i = 0; i < array.length; i++) {
			if (array2[array[i]]==0) {
				array2[array[i]] = array[i];
			} else {
				System.out.println(array[i] + " is duplicate.");
			}
		}
		

	}

}
