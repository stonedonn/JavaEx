package com.javaex.oop.diversityExample;

public class Tire {
	// 필드
	public int maxRotation; // 최대 회전수(타이어 수명)
	public int accmulatedRotation; // 누적 회전수
	public String location; // 타이어의 위치
	
	// 생성자
	public Tire(String location, int maxRotation) {
		// 필드 초기화
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 메서드
	public boolean roll() {
		
		++accmulatedRotation; // 누적 회전수를 증가시킨다.
		
		// 누적 회전수가 타이어의 최대 최전수보다 많아지는 경우 타이어는 펑크난다.
		if(accmulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 :" + (maxRotation - accmulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}
	}
	
}
