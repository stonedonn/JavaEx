package com.javaex.basics;

public class ConsoleEx {

	public static void main(String[] args) {
		consoleOutputEx();

	}
	
	private static void consoleOutputEx() {
		// 콘솔 출력
		// System.out -> 표준 출력
		// System.err -> 표준 에러
		
		// print메서드 -> 출력 후 개행 안함
		// println 메서드 -> 출력 후 개행 함
		System.out.print("Hello, ");
		System.out.println("Java:)");
		
		// 이스케이프 문자: 특수한 의미를 가진 문자
		System.out.println("Hello\nJava"); // \n -> 강제 개행
		System.out.println("Hello\tJava"); // \t -> 탭문자
		System.out.println("Hello, \"Java\""); // \" -> "
		// \ 자체를 표기하고자 할 때
		String dir = "C:\\Windows\\Systems"; // \\ -> \
		System.out.println(dir);
		
		System.err.println("표준 에러 출력!");
	}
}
