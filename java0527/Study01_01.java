package java0527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Study01_01 {

	String 드라이버 = "org.mariadb.jdbc.Driver";
	String 주소 = "jdbc:mariadb://localhost:3306/edu";
	String 사용자 = "root";
	String 비밀번호 = "1234";
	// 데이터베이스 접속
	// jdbc >> 데이터 베이스 타입 > 호스트(IP) > 포트 > 데이터 베이스 명
	// jdbc >> :oracle.thin: @//[HOST]   [:PORT] /SERVICE
	
	public void 시작() {
		System.out.println("접속 시작!");
		try {
			Class.forName(드라이버);
			Connection conn = DriverManager.getConnection(주소, 사용자, 비밀번호);
			
			String sql1 = "create OR REPLACE table test (no int, name varchar(50))";
			
			PreparedStatement ps = conn.prepareStatement(sql1);
			ps.execute();
			
			String sql2 = "insert into test (name, no) value ('하이' , 1)";
			
			ps = conn.prepareStatement(sql2);
			int result = ps.executeUpdate();
			System.out.println(result);
			
			// sql = select 문 실행해서 위의 insert 된 데이터를 출력하시오!
			
			String sql3 = "select * from test";
			
			ps = conn.prepareStatement(sql3);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				
				TestDTO testDto = new TestDTO();
				testDto.setNo(no);
				testDto.setName(name);
				System.out.println(testDto);
//				System.out.println(no + ", " + name);
			}
//			
//			
//			
//			
//			// 수정
//			String sql4 = "update test set name = '안녕' ";
//			ps = conn.prepareStatement(sql4);
//			result = ps.executeUpdate();
//			System.out.println(result);
//			
//			// 데이터 확인
//			ps = conn.prepareStatement(sql3);
//			rs = ps.executeQuery();
//			
//			while(rs.next()) {
//				int no = rs.getInt("no");
//				String name = rs.getString("name");
//				
//				TestDTO testDto = new TestDTO();
//				testDto.setNo(no);
//				testDto.setName(name);
//				System.out.println(testDto);
////				System.out.println(no + ", " + name);
//			}
//			
//			// 삭제
//			String sql5 = "delete from test";
//			ps = conn.prepareStatement(sql5);
//			result = ps.executeUpdate();
//			System.out.println(result);
//			
//			//데이터 확인
//			ps = conn.prepareStatement(sql3);
//			rs = ps.executeQuery();
//			int cnt = 0;
//			while(rs.next()) {
//				int no = rs.getInt("no");
//				String name = rs.getString("name");
//				TestDTO testDto = new TestDTO();
//				testDto.setNo(no);
//				testDto.setName(name);
//				System.out.println(testDto);
//				cnt++;
////				System.out.println(no + ", " + name);
//			}
//			System.out.println("행수 : " + cnt);
			
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
