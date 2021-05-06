package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		// 자식 타입의 객체를 부모 타입 클래스로 참조 가능
		Dog dog1 = new Dog("Snoopy");
		
		dog1.eat();
		dog1.walk();
		dog1.bark();
		
		// 자식 객체를 부모 타입으로 참조하는 것 -> Upcasting 
		Animal dog2 = new Dog("Doogy");
		
		dog2.eat();
		dog2.walk();
//		dog2.bark();   ->Animal 설계도에 없기 때문에, 실행 불가
		
		// 원래대로 돌려놓기 -> Downcasting
		((Dog)dog2).bark();       // -> 가능
		
		Animal pet = new Dog("Azi");
		pet.eat();
		pet.walk();
		
		pet = new Cat("Yaong");
		pet.eat();
		pet.walk();
		
		// 다운캐스팅시, 실제 객체를 확인해야 할 필요가 있다.
		// instanceof 연산자 활용
		if(pet instanceof Dog) {  //pet이 Dog클래스의 인스턴스라면
			((Dog)pet).bark();
		} else if(pet instanceof Cat){ // pet이 Cat클래스의 인스턴스라면
			((Cat)pet).meow();
		}
	}

}
