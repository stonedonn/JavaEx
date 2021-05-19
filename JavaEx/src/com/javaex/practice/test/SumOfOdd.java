package com.javaex.practice.test;

public class SumOfOdd {

	public static void main(String[] args) {
		int[][] scores = {
				{90, 70, 80, 75, 80},
				{ 77, 90, 65, 80, 90 },
				{ 80, 75, 95, 80, 75 },S
				{ 75, 80, 90, 85, 90 }
			};

		
		int total = 0;
		
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++){
				total += scores[i][j];
			}
		}
		
		System.out.println(total);
	}
}

