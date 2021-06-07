package com.javaex.interfaceExample.bank;
/*
 대한민국에서 은행 사업을 하려면, 금융결제원에서 정의한 어떠한 가이드를 따라야한다고
 치고, Bank라는 이름으로 인터페이스를 만들었다.
 이제 어느 은행이든 은행 시스템은 운영하려면 Bank라는 인터페이스 가이드에 맞게 구현해야 한다.
 인출메서드, 입금메서드는 각 은행에서 오버라이딩해서 재구현을 해야하며 블록체인 인증 메서드는 무조건
 금융결제원에서 제공해주는 메서드를 사용해야 한다. 따라사 정적메서드로 구현하여 오버라이딩 할 수 없게
 만들었다.(그냥 가져다 쓰라는 소리)
 */
public interface Bank {
	// 상수 ( 최대 고객에게 인출해 줄 수 있는 금액 명시)
	public int MAX_INTEGER = 100000000;
	
	// 추상메서드(인출하는 메서드)
	void withDraw(int price);
	
	// 추상메서드(입금하는 메서드)
	void deposit(int price);
	
	// JAVA8에서 가능한 defualt 메서드(고객의 휴면계좌 찾아주는 메서드: 필수 구현은 선택사항)
	default String findDormancyAccount(String custId) {
		System.out.println("**금융개정법안 00 이후 고객의 휴면계좌 찾아주기 운동**");
		System.out.println("**금융결제원에서 제공하는 로직**");
		return "00은행 000-000-0000-00";
	}
	
	// JAVA8에서 가능한 정적 메서드(블록체인 인증을 요청하는 메서드)
	static void BCAuth(String bankName) {
		System.out.println(bankName+" 에서 블록체인 인증을 요청합니다.");
		System.out.println("전 금융사 공통 블록체인 로직 수행");
	}
	
	
}
