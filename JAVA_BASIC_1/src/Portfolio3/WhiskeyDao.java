package Portfolio3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class WhiskeyDao {
	public static Connection conn;
	
	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe",
				user="scott", pw ="tiger";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);
			System.out.println("연동");
		} catch (Exception e) { e.printStackTrace(); }
		return conn;
	}
	// insert
	public int insert(Whiskey user) {
		PreparedStatement pstmt = null;
		String sql = "insert into whiskey (no,type,name,flavors) values (seq_whiskey.nextval,?,?,?)";
		int result=-1;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getType());
			pstmt.setString(2, user.getName());
//			String flavor = user.getFlavors().stream().collect();
			pstmt.setString(3,  "test");
			result = pstmt.executeUpdate();
		} catch (SQLException e) {  e.printStackTrace(); 
		}finally {
			if(pstmt!=null) {try { pstmt.close(); } catch (SQLException e) {  e.printStackTrace(); }}
			if(conn!=null) {try { conn.close(); } catch (SQLException e) {  e.printStackTrace(); }}
		}
		return result;
	}
	//readAll
	public ArrayList<Whiskey> readAll(){
		PreparedStatement pstmt = null;  ResultSet rset = null;
		String sql = "select * from whiskey";
		ArrayList<Whiskey> list = new ArrayList<Whiskey>();
		List<String>flavors = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			while(rset.next()) {
				flavors.add("fruit2");
				list.add(
					new Whiskey(rset.getInt("no"), rset.getString("type"), rset.getString("name"), rset.getString("flavors"))
						);
			}
		} catch (SQLException e) {  e.printStackTrace(); 
		}finally {
			if(rset !=null) { try { rset.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(pstmt!=null) { try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(conn !=null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}//System.out.println(list);
		return list;
	}
	//read
	public Whiskey read(int no) {
		PreparedStatement pstmt = null;  ResultSet rset = null;
		String sql = "select * from whiskey where no=?";
		List<String> flavors = new ArrayList<>();
		Whiskey result = null;
		try {
			pstmt = conn.prepareStatement(sql);  
			pstmt.setInt(1, no) ;  
			rset  = pstmt.executeQuery(); 
			while(rset.next()) { flavors.add("abc");
				result = new Whiskey( rset.getInt("no") , rset.getString("type") , rset.getString("name") ,rset.getString("flavors")); 
			}
		} catch (SQLException e) { 
			e.printStackTrace();
		}finally {
			if(rset !=null) { try { rset.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(pstmt!=null) { try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(conn !=null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}
		return result;
	}
	
	//update	
	public int update(Whiskey user) {
		PreparedStatement pstmt = null;
		String sql = "update whiskey set name=?, flavors=? where no=?";
		int result=-1;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getName()); 
			
			//pstmt.setString(2, flavor.toString());
			pstmt.setString(2,"test");
			pstmt.setInt(   3, user.getNo());     
			
			result = pstmt.executeUpdate();  
		} catch (SQLException e) { e.printStackTrace();
		} finally {
			if(pstmt != null) {  try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(conn  != null) {  try {  conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}  
		return result;
	}
	
	//delete
	public int delete(int no) {
		PreparedStatement pstmt =null;
		String sql = "delete from whiskey where no=?";
		int result=-1;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {  e.printStackTrace(); 
		}finally {
			if(pstmt != null) {  try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); } }
			if(conn  != null) {  try {  conn.close(); } catch (SQLException e) { e.printStackTrace(); } }
		}
		return result;
	}
	////////////
	public static void main(String[] args) {
		WhiskeyDao dao = new WhiskeyDao();
//		//insert
		dao.getConnection();
		Whiskey user = new Whiskey();
		user.setName("위스키"); 
		user.setType("WHITE");		
		List<String>flavor = new ArrayList<>();
		flavor.add("fruit");
		user.setFlavors(flavor);
		if(dao.insert(user) > 0) {System.out.println("위스키 추가");}
		
		
		//readAll
		dao.getConnection();
		System.out.println(dao.readAll());
//		//read
//		dao.getConnection();
//		System.out.println(dao.read(18));
//		//update
//		dao.getConnection();
//		Whiskey user2 = new Whiskey(); 
//		user2.setNo(4);		
//		List<String>flavor2 = new ArrayList<>();
//		flavor2.add("fruit2");
//		user2.setFlavors(flavor2);
//		if(dao.update(user2) > 0) {System.out.println("수정");}
//		//delete
//		dao.getConnection();
//		if(dao.delete(4) > 0) {System.out.println("삭제");}
	}
	

}

/*
 * 34줄, 95줄
create table whiskey(
	no number not null primary key,
	type varchar2(20) not null,
	name varchar2(20) not null,
	flavors varchar2(20) not null
); 

create sequence seq_whiskey;

insert into whiskey (no,type,name,flavors) values (seq_whiskey.nextval, 'aaa', 'whiskey','fruit');

update whiskey set name = 'bbb' where no=1;

desc whiskey;

select * from whiskey;

delete from whiskey where no=1;
 */
