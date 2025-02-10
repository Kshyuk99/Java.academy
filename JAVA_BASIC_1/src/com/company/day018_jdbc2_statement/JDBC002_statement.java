package com.company.day018_jdbc2_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC002_statement {
	public static void main(String[] args) {
		//1. 드라이버연동 Class.forName()
		//2. DriverManager.getConnection(url, id, pass)
		Connection conn = null;  Statement stmt = null; ResultSet rset = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String pass = "tiger";
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");		
			conn = DriverManager.getConnection(url, user, pass);
			if(conn != null) {System.out.println("연동완료");}
			
			stmt = conn.createStatement(); //3. db연동시 conn Statement 구문사용
			rset = stmt.executeQuery("select * from emp"); //4. 표(#)-줄-칸
			while(rset.next()) {//표-줄(#)-칸
				//int empno = rset.getInt(1);//칸
				int empno = rset.getInt("empno");
				String ename = rset.getString("ename");
				String job = rset.getString("job");
				System.out.println(empno + "\t" + ename + "\t" + job);
			}
			
		} catch (Exception e) {  e.printStackTrace(); 
		}finally {
			if(rset!=null) {try { rset.close(); } catch (SQLException e) {  e.printStackTrace(); }}
			if(stmt!=null) {try { stmt.close(); } catch (SQLException e) {  e.printStackTrace(); }}
			if(conn!=null) {try { conn.close(); } catch (SQLException e) {  e.printStackTrace(); }}
		}
	}

}
//1. Statement / PreparedStatement
// SELECT * FROM EMP;
// 표-줄-칸