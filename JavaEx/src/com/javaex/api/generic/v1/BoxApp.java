package com.javaex.api.generic.v1;

public class BoxApp {

	public static void main(String[] args) {
		// Box 생성 int 값을 설정
		Box intBox = new Box();
		intBox.setContent(2021); // intBox.setContent(Integer.valueOf(2021));
		
		// 내용물을 꺼내 봅시다
		int retVal = (int)intBox.getContent(); // getContent의 리턴 타입은 Object이기 때문에 에러
											// -> Integer로 다운 캐스팅
		System.out.println("내용물:" + retVal);
		
		// Bow 생성 String 값을 설정
		Box strBox = new Box();
		strBox.setContent("Java");
		
		String strVal = (String)strBox.getContent();
		System.out.println("strBox 내용물:" + strVal);
		
		// 만약에 캐스팅 잘못 했다면
//		strVal = (String)intBox.getContent();
		
		
		// 1. Object를 다룰 수 있는 클래스를 생성하면
		//	  캐스팅을 해야 하는 불편함
		// 2. 캐스팅 오류를 컴파일 타임에서 체크할 수 있다.
	}

}
