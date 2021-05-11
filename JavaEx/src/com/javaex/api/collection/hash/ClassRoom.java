package com.javaex.api.collection.hash;

public class ClassRoom {
	private String subject;
	private String roomName;
	
	// 생성자 ( 서브젝트 정보만 받을 수 있는 생성자)
	public ClassRoom(String subject) {
		this.subject = subject;
	}
	
	// 생성자
	public ClassRoom(String subject, String roomName) {
		this(subject); // 위 생성자 불러오는거
		this.roomName = roomName;
	}
	
	// ContainValue
	// 객체의 동등성 비교
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ClassRoom) {
			ClassRoom other = (ClassRoom)obj;
			return subject.equals(other.subject) &&
					roomName.equals(other.roomName);
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return subject.hashCode();
	}

	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
	}
	
	
}
