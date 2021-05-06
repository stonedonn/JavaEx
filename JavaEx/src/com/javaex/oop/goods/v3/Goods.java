package com.javaex.oop.goods.v3;

// v3. 생성자 : 객체를 인스턴스화 할 때 초기화를 담당
//		      리턴 타입은 없으며, 클래스 명과 같아야 한다.
public class Goods {
	//  필드
	private String name;
	private int price;
	
	// 생성자
	// 1. 사용자가 정의한 생성자가 하나도 없을 경우, 자바 컴파일러가 기본 생성자를 자동으로 추가한다.
	// 2. 사용자가 생성자를 선언했을 경우, 컴파일러는 기본 생성자를 추가하지 않는다.
	public Goods(String name, int price) {
		// 객체 생성에서의 초기화 코드
		this.name = name;
		this.price = price;
	}
	// Getter/Setter
	// Setter가 없을 경우, 읽기 전용이 된다.
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name; // 두 개의 name 값이 혼란을 일으키기 때문에 this를 써준다
//	}
	public int getPrice() {
		return price;
	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	// 메서드
	public void showInfo() {
		System.out.println("상품명: " + name);
		System.out.println("가격: " + price);
	}
}
