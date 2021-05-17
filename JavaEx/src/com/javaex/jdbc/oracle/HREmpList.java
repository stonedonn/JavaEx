package com.javaex.jdbc.oracle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HREmpList {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBConfig.getConnection();
			
			String sql = "SELECT first_name || ' ' || last_name as name, manager_id " +
						"FROM employees ORDER BY name ASC";
			
			System.out.println("Query:" + sql);
			
			stmt = conn.createStatement();
			//쿼리 수행
			rs = stmt.executeQuery(sql);
			//LOOP
			while(rs.next()){
				String name = rs.getString(1);
				int managerId = rs.getInt(2);
				
				// 출력
				System.out.printf("%s %d%n",name, managerId);
			}
		} catch(SQLException e){
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch(Exception e) {
				
			}
		}
	}

}
