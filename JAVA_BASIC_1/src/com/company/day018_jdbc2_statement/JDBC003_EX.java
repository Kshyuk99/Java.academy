package com.company.day018_jdbc2_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC003_EX {
	public static void main(String[] args) {
		//1. 드라이버연동  Class.froName()
		//2. 연결객체 conn = DriverManager.getConnection()
		//3. sql 사용 stmt = conn.createStatement()
		//4. 표 rset = stmt.exectuteQuery()
		//5. 줄 while(rset.next()){}
		//6. 칸 rset.getString("필드")
		Connection conn = null; Statement stmt = null; ResultSet rset = null;
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott", pass = "tiger";		
		String ODriver = "oracle.jdbc.driver.OracleDriver";
		try {
		Class.forName(ODriver);		
		conn = DriverManager.getConnection(url, user, pass);
		if(conn!=null) {System.out.println("");}
		
		stmt = conn.createStatement();
		rset = stmt.executeQuery("select * from dept");
		while(rset.next()) {
			int deptno = rset.getInt("deptno");
			String dname = rset.getString("dname");			
			System.out.println(deptno + "\t" + dname + "\t" + rset.getString("loc"));
		}
		} catch (Exception e) {  e.printStackTrace(); 
		}finally {
			if(conn!=null) {try { conn.close(); } catch (SQLException e) {  e.printStackTrace(); }}
			if(rset!=null) {try { rset.close(); } catch (SQLException e) {  e.printStackTrace(); }}
			if(stmt!=null) {try { stmt.close(); } catch (SQLException e) {  e.printStackTrace(); }}
		}
	}
}
