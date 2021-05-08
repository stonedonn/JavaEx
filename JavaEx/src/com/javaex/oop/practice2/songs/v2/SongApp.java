package com.javaex.oop.practice2.songs.v2;

public class SongApp {

	public static void main(String[] args) {
		Song so1 = new Song("좋은날","아이유","Real","이민수",3,2010);
		
		Song so2 = new Song("거짓말","빅뱅","Always","G-DRAGON",2,2007);
		
		Song so3 = new Song("벚꽃엔딩","버스커브서크","버스커버스커 1집","장범준",4,2012);
		
		so1.showInfo();
		so2.showInfo();
		so3.showInfo();
	}

}
