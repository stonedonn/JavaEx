package com.javaex.oop.practice2.songs;

public class SongApp {

	public static void main(String[] args) {
		Song so1 = new Song();
		
		so1.setAlbum("Real");
		so1.setArtist("아이유");
		so1.setComposer("이민수");
		so1.setTitle("좋은날");
		so1.setTrack(3);
		so1.setYear(2010);
		
		Song so2 = new Song();
		
		so2.setAlbum("Always");
		so2.setArtist("빅뱅");
		so2.setComposer("G-DRAGON");
		so2.setTitle("거짓말");
		so2.setTrack(2);
		so2.setYear(2007);
		
		Song so3 = new Song();
		
		so3.setAlbum("버스커버스커 1집");
		so3.setArtist("버스커버스커");
		so3.setComposer("장범준");
		so3.setTitle("벚꽃엔딩");
		so3.setTrack(4);
		so3.setYear(2012);
		
		so1.showInfo();
		so2.showInfo();
		so3.showInfo();
	}

}
