package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {
		
		
		
		int[][] twoDArray = { { 10, 20 }, 
				{ 1, 2, 3 }, 
				{ 100, 200, 300, 400 } 
				};

		int howManyArrays = twoDArray.length;
		System.out.println(howManyArrays);

		System.out.println(twoDArray[2].length);

		for (int r=0; r<twoDArray.length; r++) {
			
			for(int c=0; c<twoDArray[r].length; c++) {
				
				System.out.println(twoDArray [r] [c]+" ");
				
			}
		}
		
		System.out.println("----------------------------------------------------------");

		for (int[] arr : twoDArray) {

			for (int num : arr) {

				System.out.println(num + " ");
			}

			System.out.println();

		}

	}

}
