package com.javaex.basics;

public class Types {

	public static void main(String[] args) {
		integerTypes();
		floatTypes();
		booleanEx();
		charEx();
		constantEx();
	}
	
	private static void constantEx() {
		float PI = 3.141519F;
		final int SPEED_LIMIT = 110;
		
		System.out.println("PI:" + PI);
		System.out.println("SPEED_LIMIT: " + SPEED_LIMIT);
	
		int speed = 105;
		
		//과속 단속
		boolean overspeed = speed > SPEED_LIMIT;
		
		System.out.println("과속 ? " + overspeed);
		
		//SPEED_LIMIT = 80; //내부에서 고의로든 실수로든 변경되면 안되는 값 -> 상수
		
		overspeed = speed > SPEED_LIMIT;
		
		System.out.println("과속 ? " + overspeed);
	}
	// char형 자료 예제
	// -> 내부에 문자에 해당하는 부호 없는 정수 코드 저장(2byte)
	private static void charEx() {
		char ch1 = 'A'; // -> 내부에는 정수형 코드 저장
		char ch2 = '한';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println((int)ch1);
		System.out.println((int)ch2);
		
		String str = "Java";
		System.out.println(str);
	}
	private static void booleanEx() {
		boolean b1 = true; //참
		boolean b2 = false; //거짓
		
		System.out.println("b1 -> " + b1);
		System.out.println("b2 -> " + b2);
		
		// 비교 연산, 논리 연산의 결과를 담을 수 있는 자료형
		int var1= 7;
		int var2 = 5;
		
		boolean result = var1 > var2;
		System.out.println("result: " + result);
	}
	// 실수형 자료 예제
	private static void floatTypes() {
		float floatVar = 3.12345f; //float 형 표시를 위해 f or F 붙여줌
		double doubleVar = 3.12345;
		
		System.out.println("floatVar:" + floatVar);
		System.out.println("doubleVar:" + doubleVar);
		
		// 지수 표기법  ex) m * 10의 n승
		int intVar = 3000000;
		floatVar = 3E6F; // 3.0 * 10 ^ 6
		doubleVar = 3E-6; // 3.0 * 10 ^ -6
		
		// 주의: float, double -> 정밀도를 포기하고 표현 범위를 넓혔다.
		System.out.println(0.1 * 3);
	} 
	// 정수형 자료 예제
	private static void integerTypes() {
		// byte(1) < short(2) < int(4) < long(8)
		// 선언
		int intVar1;
		int intVar2;
		// 초기화
		intVar1 = 2021;
		// intVar2 = 12345678901234; -> Error 범위초과
	
		System.out.println(intVar1);
		long longVar1;
		long longVar2;
		
		// 정수형 데이터의 기본은 int
		longVar1 = 1;
		longVar2 = 12345678901234L; // 뒤에 L or l을 붙혀서 long 형임을 알림
		
		System.out.println("longVar1:" + longVar1);
		System.out.println("longVar2:" + longVar2);
		
		// 2진수, 8진수, 16진수 형태로 입력 가능
		int bin = 0b1101; // 0b는 2진수 표현이라는 뜻
		int oct = 072; // 0은 8진수라는 뜻
		int hex = 0xFF; // 0x는 16진수라는 뜻
	
		System.out.println("0b1101 -> " + bin);
		System.out.println("072 -> " + oct);
		System.out.println("0xFF -> " + hex);
	}
}
