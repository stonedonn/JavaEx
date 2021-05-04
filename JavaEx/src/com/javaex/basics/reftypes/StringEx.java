package com.javaex.basics.reftypes;

public class StringEx {
	public static void main(String[] args) {
		stringBasic();
	}
	
	private static void stringBasic() {
		// 문자열 선언
		String str;  //선언
		str = "Java"; //할당 -> Literal (코드에 직접 입력한 값)
		String str2 = "Java"; // 선언 + 할당 -> Literal
		String str3 = new String("Java"); // 새 객체 선언

		// 참조 변수는 객체의 주소를 가지고 있다
		// 참조 변수의 ==, !=은 주소를 비교하는 것이다
		
		// Literal vs Literal
		System.out.println("str == str2 ? " + (str == str2)); //True
		// Literal vs new String
		System.out.println("str == str3 ? " + (str == str3)); //False
		
		// 참조 변수의 값이 같은지를 비교 -> equals
		System.out.println("str과 str2가 내용이 같은가 ? " + str.equals(str2)); //True
		System.out.println("str과 str3가 내용이 같은가 ? " + str.equals(str3)); //True
	}
}
