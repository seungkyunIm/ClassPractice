package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBConnection {

	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private int no;
	private String name;
	private String sex;
	private String sig;
	private String team;
	private String role;

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

	public List<DbTable> 데이터가져오기(Connection conn, String sql) {
		List<DbTable> list = new ArrayList<DbTable>();
		DbTable data;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				data = new DbTable();
				
				// 데이터를 매핑하시오.
				data.setNo(no);
				data.setName(name);
				data.setSex(sex);
				data.setSig(sig);
				data.setTeam(team);
				data.setRole(role);
				list.add(data);
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public boolean 데이터입력하기(Connection conn, String sql, DbTable data) {
		try {
			pstmt = conn.prepareStatement(sql);

			// 데이터를 매핑하시오.
			pstmt.setInt(1, data.getNo());
			pstmt.setString(2, data.getName());
			pstmt.setString(3, data.getSex());
			pstmt.setString(4, data.getSig());
			pstmt.setString(5, data.getTeam());
			pstmt.setString(6, data.getRole());

			int state = pstmt.executeUpdate();
			pstmt.close();
			conn.commit();
			if(state == 1) return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean 데이터수정하기(Connection conn, String sql, DbTable data) {
		try {
			pstmt = conn.prepareStatement(sql);

			// 데이터를 매핑하시오.
			System.out.println(data.getNo() + "번을 변경합니다.");
			pstmt.setString(1, data.getRole());
			pstmt.setInt(2, data.getNo());

			int state = pstmt.executeUpdate();
			pstmt.close();
			conn.commit();
			if(state == 1) return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	public boolean 데이터삭제하기(Connection conn, String sql, DbTable data) {
		try {
			pstmt = conn.prepareStatement(sql);

			// 데이터를 매핑하시오.
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
