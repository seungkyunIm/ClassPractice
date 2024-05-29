package java0528;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Study01_con {

	private String 드라이버;
	private String 주소;
	private String 사용자;
	private String 비밀번호;

	public Study01_con(){
		this.드라이버 = 드라이버;
		this.주소 = 주소;
		this.사용자 = 사용자;
		this.비밀번호 = 비밀번호;
		
	}
	
	private void 시작() {
		try {
			Class.forName(드라이버);
			Connection conn = DriverManager.getConnection(주소, 사용자, 비밀번호);
			
			
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private controll() {
		
	}
	
	
	
	
}
