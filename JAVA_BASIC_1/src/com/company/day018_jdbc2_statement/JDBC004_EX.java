package com.company.day018_jdbc2_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC004_EX {
	public static void main(String[] args) {
		Connection conn = null; Statement stmt = null; ResultSet rset = null;
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String ODriver = "oracle.jdbc.driver.OracleDriver";
		String user = "scott", pass = "tiger";
		
		try {
		Class.forName(ODriver);		
		conn = DriverManager.getConnection(url, user, pass);
		if(conn!=null) {System.out.println("");}
		
		stmt = conn.createStatement();
		rset = stmt.executeQuery("select deptno, dname from dept");
		while(rset.next()) {
			int deptno = rset.getInt("deptno");
			String dname = rset.getString("dname");			
			System.out.println(deptno + "\t" + dname);
		}
		} catch (Exception e) {  e.printStackTrace(); 
		}finally { 
			if(conn!=null) {try { conn.close(); } catch (SQLException e) {  e.printStackTrace(); }}
			if(rset!=null) {try { rset.close(); } catch (SQLException e) {  e.printStackTrace(); }}
			if(stmt!=null) {try { stmt.close(); } catch (SQLException e) {  e.printStackTrace(); }}
		}
	}

}
