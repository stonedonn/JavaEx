package com.javaex.api.objectclass.example1;

public class RectangleApp {

	public static void main(String[] args) {
		Rectangle a = new Rectangle(6,4); // 24
		Rectangle b = new Rectangle(12,2); // 24
		Rectangle c = new Rectangle(6,6); // 36
		
		//Rectangle 클래스에서 오버라이딩!!!!!!!!!!!!!!!!!!!
		System.out.println("a.equals(b)" + a.equals(b)); //-> true 이어야 하고
		System.out.println("a.equals(c)" + a.equals(c)); //-> false 이어야 하고
	}

}
