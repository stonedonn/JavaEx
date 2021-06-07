package com.javaex.oop.diversityExample;

public class CarApp {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1;i<=5;i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 HanKooKTire로 교체");
				car.frontLeftTire = new HanKooKTire("앞 왼쪽", 15);
				
				break;
			case 2:
				System.out.println("앞 오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞 오른쪽", 13);
				
				break;
			case 3:
				System.out.println("뒤 왼쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤 오른쪽", 17);
				
				break;
			default:
				break;
				
			}
			System.out.println("==================" + i + " 회전 =================");
		}
	}

}
