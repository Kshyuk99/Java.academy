package com.company.day017_Test_Oracle;

import java.sql.Connection;
import java.sql.DriverManager;

//1.RDB
//2. 테이블 간 관계
//3. Entity,테이블 - R(관계) - Attribute:필드(속성)

// sqlplus  system/1234   conn SCOTT/TIGER
public class JDBC001_oracle {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			//1 jdbc 드라이버로드
			Class.forName("oracle.jdbc.driver.OracleDriver"); // →
			//2. 데이터베이스 접속 (system/1234)
			conn  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
												"SCOTT",
												"TIGER"); // ←
			if(conn != null) {System.out.println("DB연동성공");}
		} catch(Exception e) {e.printStackTrace();}
		
		
	}//end main
}//end class


//1. https://www.oracle.com/database/technologies/appdev/jdbc-downloads.html
//2. ojdbc17.jar 다운
//3. build path

// sid		: select name from v$database;
// port		: select dbms_xdb.gethttpport() from dual;