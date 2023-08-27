package com.syntax.class11;

public class Test21 {

	public static void main(String[] args) {
		
		 int[][] twoArray = {
				{10, 20},
				{1, 2, 3},
				{100, 200, 300, 400}
		};
		 
		 int howManyArrays = twoArray.length;
		 
		 System.out.println(howManyArrays);
		 
		 System.out.println(twoArray[2].length);
		 
		 for (int r = 0; r < twoArray.length; r++) {
			 
			 for(int t = 0; t < twoArray[r].length; t++) {
				 
				 System.out.print(twoArray[r][t] + " ");
			 }			 
		 }
		 
		 System.out.println("---------------------------------------------");
		 
		 for(int[] arr1 : twoArray) {
			 
			 for (int arr2 : arr1 ) {
				 
				 System.out.print(arr2 + " ");
			 }
		 }
		
	}

}
