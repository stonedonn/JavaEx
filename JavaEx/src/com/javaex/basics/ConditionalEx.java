package com.javaex.basics;

import java.util.Scanner;
public class ConditionalEx {

	public static void main(String[] args) {
		//ifElseEx();
		ifElseEx2();
	}
	private static void ifElseEx2() {
		// 정수 입력
		// 양수 일때
		// 짝수, 홀수 출력
		// 음수 일 때 -> 음수, 0일 때 -> 0 출력
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		System.out.print("숫자:");
		int num = scanner.nextInt();
		if(num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		} else {
			if(num == 0) {
				System.out.println("0입니다.");
			} else {
				System.out.println("음수입니다.");
			}
		}
		
		scanner.close();
	}/*
	private static void ifElseEx() {
		// 정수를 입력 받아서 
		// 양수 -> 양수, 음수 -> 음수, 0을 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		
		int num = scanner.nextInt();
		if (num > 0) {
			System.out.println("양수입니다.");
		}
		else if(num < 0) {
			System.out.println("음수입니다");
		}
		else {
			System.out.println("0입니다");
		}
		
		//중첩if문
		if ( num == 0) {
			System.out.println("0입니다.");
		}else {
			if( num > 0 ) {
				//양수
				System.out.println("양수입니다.");
			}else {
				//음수
				System.out.println("음수입니다.");
			}
		}
		
		scanner.close();
	}*/
}
