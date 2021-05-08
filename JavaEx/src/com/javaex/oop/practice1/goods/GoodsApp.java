package com.javaex.oop.practice1.goods;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		
		camera.setName("Nikon");
		camera.setPrice(400000);
		
		Goods pc = new Goods();
		
		pc.setName("LG그램");
		pc.setPrice(900000);
		
		Goods cup = new Goods();
		
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		camera.showInfo();
		pc.showInfo();
		cup.showInfo();

	}

}
