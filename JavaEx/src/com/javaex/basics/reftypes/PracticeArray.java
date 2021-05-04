package com.javaex.basics.reftypes;

import java.util.Scanner;

public class PracticeArray {

	public static void main(String[] args) {
		//problemFirst();
		//problemSecond();
		//problemThird();
		//problemFourth();  //다른 방법이 있는지 한번 더 확인
		problemFifth();
	}
	private static void problemFirst() {
		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		int cnt=0, total=0;
		
		for(int value:data) {
			if(value % 3 == 0) {
				cnt++;
				total += value;
			}
		}System.out.println("주어진 배열에서 3의 배수의 개수=>"+cnt);
		System.out.println("주어진 배열에서 3의 배수의 합=>"+total);
	}
	private static void problemSecond() {
		int N[] = new int[5],total=0;
		float avg=0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<N.length;i++) {
			N[i] = scanner.nextInt();
			total += N[i];
		}
		avg = (float)(total / 5);
		System.out.printf("평균은 %.1f 입니다",avg);
		
		scanner.close();
	}
	private static void problemThird() {
		char c[] = {'T','H','I','S',' ',
				'I','S', ' ', 
				'A', ' ',
				'P','E','N','C','I','L'};
		
		for(int i=0; i<c.length;i++)
			System.out.print(c[i]);
		System.out.println();
		for(int i=0;i<c.length;i++) {
			if(c[i] == ' ')
				c[i] = ',';
		}
		for(int i=0; i<c.length;i++)
			System.out.print(c[i]);
		System.out.println();
	}
	private static void problemFourth() {
		int lotto[] = new int[6];
		int check = 0;
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			check = lotto[i];
			for(int j=0;j<=i;j++) {
				for(int k=0;k<=j;k++) {
					if(j != k) {
						if(lotto[j] == lotto[k]) {
							i -= 1;
							j -= 1;
							k -= 1;
							lotto[i] = (int)(Math.random()*45) +1;
						}
					}
				}
			}
			
		}
		for(int i=0;i<lotto.length;i++)
			System.out.print(lotto[i] + " ");
	}
	private static void problemFifth() {
		int scoreboard[][] = {
				{80, 75, 90, 95, 78},
				{92, 88, 89, 92, 70},
				{78, 80, 85, 86, 63},
				{83, 84, 89, 87, 75},
				{89, 83, 93, 94, 78}
				};
		int total=0,cnt=0;
		float avg=0;
		
		for(int i=0;i<scoreboard.length;i++) {
			for(int j=0;j<scoreboard.length;j++) {
				if(scoreboard[i][j] >= 85) {
					total += scoreboard[i][j];
					cnt++;
				}
			}
		}avg = (float)(total/cnt);
		System.out.printf("Total: %d Average: %.2f\n",total,avg);	
	}
}

