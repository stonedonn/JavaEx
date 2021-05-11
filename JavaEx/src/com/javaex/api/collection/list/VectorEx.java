package com.javaex.api.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// 벡터의 선언 - 버퍼 기반의 연속 데이터 처리
		Vector v = new Vector();
		System.out.println("Size: " + v.size() + ", Capacity: " + v.capacity());
		
		
		// 1부터 10까지의 값을 담아봅시다.
		for(int i=1;i<=10;i++) {
			// 값의 추가
			v.addElement(i);
			// == v.addElement(Integer.valueof(i));
		}
		System.out.println("Size: " + v.size() + ", Capacity: " + v.capacity());
	
		v.addElement(11); // 허용량 자동 증가
		System.out.println("Size: " + v.size() + ", Capacity: " + v.capacity());
		
		System.out.println("v:" + v);
		
		v.insertElementAt(12, 5);
		System.out.println("v:" + v);
		
		// 객체 조회: 특정 인덱스의 객체 조회
		System.out.println("인덱스 5의 객체:" + v.elementAt(5));
		
		// 객체 인덱스 조회:
		System.out.println("객체 12의 인덱스:" + v.indexOf(12));
		// 없는 객체의 인덱스 조회:
		System.out.println("없는 객체의 인덱스:" + v.indexOf(0));
		
		// 포함 여부 확인
		System.out.println("v가 10을 포함? " + v.contains(10));
		// 내부 요소들을 루프로 접근
		for(int i=0;i<v.size();i++) {
			Integer item = (Integer)v.elementAt(i);
			System.out.print(item + " ");
		}
		System.out.println();
		
		System.out.println();
		// TODO LOOP 개선
		
		Enumeration e = v.elements(); // 각 요소에 접근하는 접근자를
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement() + " "); // 반복자 이용
		}System.out.println();
		// 버퍼 비우기
		v.clear();
		System.out.println("v:" + v);
		System.out.println("Size: " + v.size() + ", Capacity: " + v.capacity());
		
	}

}
