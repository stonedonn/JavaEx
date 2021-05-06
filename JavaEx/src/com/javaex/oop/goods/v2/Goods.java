package com.javaex.oop.goods.v2;

// v2. 정보 은닉
// 정보에 접근할 수 있는 getter/setter 
public class Goods {
	//  필드
	
	
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; // 두 개의 name 값이 혼란을 일으키기 때문에 this를 써준다
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 메서드
	public void showInfo() {
		System.out.println("상품명: " + name);
		System.out.println("가격: " + price);
	}
}
