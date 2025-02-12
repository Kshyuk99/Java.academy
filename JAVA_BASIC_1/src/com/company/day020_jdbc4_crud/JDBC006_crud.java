package com.company.day020_jdbc4_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC006_crud {
	public static void main(String[] args) {
		Connection conn = null;  PreparedStatement pstmt = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";		
		String user = "scott", pw="tiger";
		
		
		 ResultSet rset = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("연동");			 
			pstmt = conn.prepareStatement("select * from fruit where fno=?");
			pstmt.setInt(1, 3); // setInt(1 ?의순서, 해당값)
			rset = pstmt.executeQuery(); // 표
			while(rset.next()) { //줄
				System.out.println(rset.getInt("fno") + "\t" + rset.getString("fname") + "\t" + rset.getString("fdate"));
			}
			}catch (Exception e) {  e.printStackTrace();  
			}finally {
				if(rset!=null) {try { rset.close(); } catch (SQLException e) {  e.printStackTrace(); }}
				if(pstmt!=null) {try { pstmt.close(); } catch (SQLException e) {  e.printStackTrace(); }}
				if(conn!=null) {try { conn.close(); } catch (SQLException e) {  e.printStackTrace(); }}
				
			}
}
}
/*
1. scott/tiger 계정확인
2. dml : insert(create) fruit 테이블에 sequence 이용해서 데이터 삽입
			insert into fruit(fno,fname,fdate) values (seq_fruit.nextval, 'apple', sysdate)
3. dml : insert(read)   fruit 테이블에 전체데이터 출력   //fno가 5번인데이터 출력
				select * from fruit where fno=5
4. dml : insert(update) fno가 5번인 데이터 fname을 melon으로 수정
			update fruit set fname='melon' where fno=5 
5. dml : insert(delete) fno가 5번인 데이터 삭제
			delete fruit where fno=5
 */