package com.javaex.oop.goods.v3;

public class GoodsApp {
	//에러
	public static void main(String[] args) {
		// 생성자를 이용한 객체의 초기화
		Goods notebook = new Goods("LG Gram",1500000);  // 임으로 생성자를 추가했기 때문에 컴파일러가 기본 생성자를 만들지 않았다
		
		Goods smartphone = new Goods("iPhone",1000000);
		
		System.out.printf("%s, %d원%n",
				notebook.getName(),
				notebook.getPrice());
		System.out.printf("%s, %d원\n",
				smartphone.getName(),
				smartphone.getPrice());
		
		// price, name 필드는 읽기 전용이기 때문에 필드 데이터를 변경할 수 없다
//		notebook.setPrice(15000);
//		smartphone.setPrice(10000);
		
		// 내장 메서드 호출
		notebook.showInfo();
		smartphone.showInfo();
	}

}
