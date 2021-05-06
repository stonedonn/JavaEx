package com.javaex.oop.point.v3;
// 볼륨이 트루면 올려주고 아니면 내려주고

// v2. 생성자
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Getter/Setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// 메서드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n",x,y);
	}
	// 메서드 오버로딩
	// 다형성의 일부: 다른 메서드와 같은 이름이지만 매개변수의 타입, 개수, 순서만 다른 메서드를 생성할 수 있다
	public void draw(boolean show) {
		String message = String.format("점[x=%d , y=%d]을 ",x,y);
		if(show) {
			message += "그렸습니다.";
		}else
			message += "지웠습니다.";
		System.out.println(message);
	}
	
}
