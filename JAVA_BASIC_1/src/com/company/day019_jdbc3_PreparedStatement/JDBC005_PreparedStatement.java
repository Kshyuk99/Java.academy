package com.company.day019_jdbc3_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC005_PreparedStatement {
	public static void main(String[] args) {
		//1. Oracle 드라이버연동
		//2. DriverManager.getConnection();
		
		Connection conn = null; 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";		
		String user = "scott", pw="tiger";
		
		String sql1 = "select *from emp where ename='"+ "SCOTT" +"'"; //Statement(sql 구문)
		
		
		//3 Statement
		 Statement stmt=null; ResultSet rset= null;  // 결과표(표)
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("연동");
			
			stmt = conn.createStatement(); // sql구문
			rset= stmt.executeQuery(sql1); //4표 - 5줄 - 6칸
			while(rset.next()) {
				System.out.println(rset.getInt("empno") + "\t" + rset.getString("ename"));
			}
		} catch (Exception e) {  e.printStackTrace(); 
		}finally {
			if(conn!=null) {try { conn.close(); } catch (SQLException e) {  e.printStackTrace(); }}
			if(stmt!=null) {try { stmt.close(); } catch (SQLException e) {  e.printStackTrace(); }}
			if(rset!=null) {try { rset.close(); } catch (SQLException e) {  e.printStackTrace(); }}
		}
		//4 PreparedStatement
		 PreparedStatement pstmt=null; ResultSet rset2= null;  // 결과표(표)
		 String sql2 = "select * from emp where empno=? and ename=?";  //PreparedStatement
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("연동");
			
			pstmt = conn.prepareStatement(sql2);  // sql 사용
			pstmt.setInt(1, 7788); //? 1번   7788
			pstmt.setString(2, "SCOTT");  //? 2번   SCOTT
			
			rset2 = pstmt.executeQuery();  // 표-줄-칸
			while(rset2.next()) { System.out.println(rset2.getInt("empno") + "\t" + rset2.getString("ename")); } 
			//         줄                                             칸       
			
		} catch (Exception e) {  e.printStackTrace(); 
		}finally {
			if(conn!=null) {try { conn.close(); } catch (SQLException e) {  e.printStackTrace(); }}
			if(stmt!=null) {try { stmt.close(); } catch (SQLException e) {  e.printStackTrace(); }}
			if(rset2!=null) {try { rset2.close(); } catch (SQLException e) {  e.printStackTrace(); }}
		}
	}//end main
}// end class
