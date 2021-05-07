package com.javaex.oop.summary;

public class Panda extends Animal{
	public Panda(String name, int age) {
		super(name, age);
	}
	
	
	//추상 메서드는 반드시 오버라이드!!!!
	@Override
	public void say() {
		System.out.printf("%s: zzz~~~~~~%n",name);
	}
	
}
