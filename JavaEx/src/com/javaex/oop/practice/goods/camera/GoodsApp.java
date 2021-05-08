package com.javaex.oop.practice.goods.camera;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.name = "nikon";
		camera.price = 400000;
		
		System.out.println("브랜드: " + camera.name);
		System.out.println("가격: " + camera.price);

	}

}
