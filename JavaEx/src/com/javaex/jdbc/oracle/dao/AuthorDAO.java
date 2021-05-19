package com.javaex.jdbc.oracle.dao;

import java.util.List;

// 인터페이스 -> 설계도 작성

public interface AuthorDAO {
	public List<AuthorVO> getList(); // 단순 SELECT
	public List<AuthorVO> search(String keyword); //LIKE
	public AuthorVO get(Long id); // PK로 가져오기
	public boolean insert(AuthorVO vo); //INSERT
	public boolean delete(Long id); // PK로 삭제
	public boolean update(AuthorVO vo); //UPDATE
	
}
