package com.javaex.oop.summary;

public class Human extends Animal{
	public Human(String name,int age) {
		super(name,age); //부모 생성자가 있으니 super 이용
	}
	
	// 추상메서드는 반드시 오버라이드
	@Override
	public void say() {
		System.out.printf("안녕, 나는 %s%n",name);
	}
	
	
}
