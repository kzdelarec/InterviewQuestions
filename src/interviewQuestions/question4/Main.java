package interviewQuestions.question4;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	//How do you find all pairs of an integer array whose sum is equal to a given number?

	public static void main(String[] args) {
		
		int[] array = new int[] {5,1,6,7,3,4,8,2,9};
		int sum = 14;
		
		  /*******************************************/
		 /************ 		O(n^2)		*************/
		/*******************************************/
		int[] pairs = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			pairs[i] = sum - array[i];
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[j] == pairs[i] && array[i] != pairs[i]) {
					//System.out.println( array[i] + " + " + array[j] + " = " + sum);
				}
			}
		}

		
		  /*******************************************/
		 /************ 		O(n)		*************/
		/*******************************************/
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			map.put(array[i], sum - array[i]);
		}
		
		for (int i = 0; i < map.size(); i++) {
			if(map.containsKey(map.get(array[i]))) {
				if(array[i] != map.get(array[i])) {
					System.out.println( array[i]+ " + " + map.get(array[i]) + " = " + sum);
				}
			}
		}
	}
}
