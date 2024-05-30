package java0530;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Study01_DBController {

	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private int no;
	private String email;
	private String password;
	private boolean delYn;
	
	public Connection openDB(String URL, String USER, String PASSWORD) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("JDBC Connection Open!");
			return DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean 테이블생성(Connection conn, String sql) {
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.execute();
			pstmt.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public List<Study01_DbTable> 데이터가져오기(Connection conn, String sql) {
		List<Study01_DbTable> list = new ArrayList<Study01_DbTable>();
		Study01_DbTable data;
		String del;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				data = new Study01_DbTable();
				data.setNo(rs.getInt("no"));
				data.setEmail(rs.getString("email"));
				data.setPassword(rs.getString("password"));
				data.setDelYn(rs.getBoolean("delYn"));
				list.add(data);
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public boolean 데이터입력하기(Connection conn, String sql, Study01_DbTable data) {
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, data.getNo());
			pstmt.setString(2, data.getEmail());
			pstmt.setString(3, data.getPassword());
			pstmt.setBoolean(4, data.getDelYn());
			int state = pstmt.executeUpdate();
			pstmt.close();
			conn.commit();
			if(state == 1) return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean 데이터수정하기(Connection conn, String sql, Study01_DbTable data) {
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, data.getEmail());
			pstmt.setString(2, data.getPassword());
			pstmt.setInt(3, data.getNo());
			int state = pstmt.executeUpdate();
			pstmt.close();
			conn.commit();
			if(state == 1) return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}
	public boolean 데이터삭제하기(Connection conn, String sql, Study01_DbTable data) {
		try {
			pstmt = conn.prepareStatement(sql);
			
			System.out.println(data.getNo() + "번을 삭제합니다.");
			pstmt.setInt(1, data.getNo());
			
			int state = pstmt.executeUpdate();
			pstmt.close();
			conn.commit();
			if(state == 1) return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}
	
	
	
	
	
	
}
