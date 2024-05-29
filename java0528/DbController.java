package java0528;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DbController {
	
	private String 드라이버;
	private String 주소;
	private String 사용자;
	private String 비밀번호;
	
	private String 테이블 = "create OR REPLACE table "
			+ "명단("
			+ "번호 int," 
			+ "이름 varchar(10)," 
			+ "성별 varchar(3)," 
			+ "특징 varchar(10),"
			+ "해적단 varchar(10)," 
			+ "역활 varchar(10)" 
			+ ")";
	private String 입력 = "insert into 명단 value (?,?,?,?,?,?)";
	private String 읽기 = "select * from 명단";
	private	String 수정 = "update 명단 set 역활 = ? where 번호 = ?";
	private String 삭제 = "delete from 명단 where 번호 = ?";
	
	public DbController(String 드라이버, String 주소, String 사용자, String 비밀번호) {
		this.드라이버 = 드라이버;
		this.주소 = 주소;
		this.사용자 = 사용자;
		this.비밀번호 = 비밀번호;
		시작();
	}
	
	private void 시작() {
		try {
			Class.forName(드라이버);
			Connection conn = DriverManager.getConnection(주소, 사용자, 비밀번호);
			기능제어(conn);
			
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	private void 기능제어(Connection conn) {
		System.out.println("테이블 생성 합니다.");
		if(테이블생성(테이블, conn)) {
			// DML >> CRUD
			// 1단계 데이터 넣기 (insert)
			//sql = 데이터생성();
			//cud기능(sql, conn);
			List<DataDto> list = 데이터생성();

			for(int i = 0; i < list.size(); i++) {
				cud기능(입력, conn, (DataDto) list.get(i), "I");
				}
			//읽기
			데이터읽기(읽기, conn);
			
			//수정
			DataDto data = new DataDto();
			data.set번호(10);
			data.set역활("광대");
			cud기능(수정, conn, data, "U");
			데이터읽기(읽기, conn);
			
			//삭제
			data = new DataDto();
			data.set번호(10);
			cud기능(삭제, conn, data, "D");
			데이터읽기(읽기, conn);
		} else {
			System.out.println("테이블 생성 실패!!");
		}
	
	}
	
	
	private boolean 테이블생성(String sql, Connection conn) {
		System.out.println(sql);  //create OR REPLACE table 명단(번호 int,이름 varchar(10),성별 varchar(3),특징 varchar(10),해적단 varchar(10),역활 varchar(10)) 보여주는 print문
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute();
			ps.close();
			return true;       // 테이블 생성 성공 했을 시
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;          // 테이블 생성 실패 했을 시
	}

	private List 데이터생성() {
//		DataDto data = new DataDto();
//		data.set번호(1);
//		data.set이름("몽키 D 루피");
//		data.set성별("남자");
//		data.set특징("고무고무 열매");
//		data.set해적단("밀짚모자");
//		data.set역활("선장");
		
		
//		sql += data.get번호();
//		sql += ",'" +data.get이름()+ "'";
//		sql += ",'" +data.get성별()+ "'";
//		sql += ",'" +data.get특징()+ "'";
//		sql += ",'" +data.get해적단()+ "'";
//		sql += ",'" +data.get역활()+ "'";
//		sql += ")";
		
//		System.out.println(sql);
		List list = new ArrayList<DataDto>();
		
		DataDto data = new DataDto();
		data.set번호(1);
		data.set이름("몽키 D 루피");
		data.set성별("남자");
		data.set특징("고무고무 열매");
		data.set해적단("밀짚모자");
		data.set역활("선장");
		list.add(data);
		
		data = new DataDto();
		data.set번호(2);
		data.set이름("롤로노아 조로");
		data.set성별("남자");
		data.set특징("삼도류");
		data.set해적단("밀짚모자");
		data.set역활("부선장");
		list.add(data);
		
		data = new DataDto();
		data.set번호(3);
		data.set이름("상디");
		data.set성별("남자");
		data.set특징("요리사");
		data.set해적단("밀짚모자");
		data.set역활("요리사");
		list.add(data);
		
		data = new DataDto();
		data.set번호(4);
		data.set이름("나미");
		data.set성별("여자");
		data.set특징("항해사");
		data.set해적단("밀짚모자");
		data.set역활("항해사");
		list.add(data);
		
		data = new DataDto();
		data.set번호(5);
		data.set이름("우솝");
		data.set성별("남자");
		data.set특징("사격");
		data.set해적단("밀짚모자");
		data.set역활("저격수");
		list.add(data);
		
		data = new DataDto();
		data.set번호(6);
		data.set이름("토니토니 쵸파");
		data.set성별("미정");
		data.set특징("사람사람 열매");
		data.set해적단("밀짚모자");
		data.set역활("의사");
		list.add(data);
		
		data = new DataDto();
		data.set번호(7);
		data.set이름("니코 로빈");
		data.set성별("여자");
		data.set특징("꽃꽃 열매");
		data.set해적단("밀짚모자");
		data.set역활("고고학자");
		list.add(data);
		
		data = new DataDto();
		data.set번호(8);
		data.set이름("프랑키");
		data.set성별("남자");
		data.set특징("사이보그");
		data.set해적단("밀짚모자");
		data.set역활("조선공");
		list.add(data);
		
		data = new DataDto();
		data.set번호(9);
		data.set이름("브록");
		data.set성별("남자");
		data.set특징("연주자");
		data.set해적단("밀짚모자");
		data.set역활("선원");
		list.add(data);
		
		data = new DataDto();
		data.set번호(10);
		data.set이름("버기");
		data.set성별("남자");
		data.set특징("동강동강 열매");
		data.set해적단("버기");
		data.set역활("선장");
		list.add(data);
		
		return list;
	}
	
	private void 데이터읽기(String sql,Connection conn) {
		System.out.println(sql); // select * from 명단을 보여주는 print문
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			//번호, 이름, 성별, 특징, 해적단, 역활
			while(rs.next()) {
				DataDto data = new DataDto();
				data.set번호(rs.getInt("번호"));
				data.set이름(rs.getString("이름"));
				data.set성별(rs.getString("성별"));
				data.set특징(rs.getString("특징"));
				data.set해적단(rs.getString("해적단"));
				data.set역활(rs.getString("역활"));
				System.out.println(data);
			}
				rs.close();
				ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void cud기능(String sql, Connection conn, DataDto data, String type) {
		System.out.println(sql);
		try {
		PreparedStatement ps = conn.prepareStatement(sql);
		
			if("I".equals(type)) {
				ps.setInt(1, data.get번호());
				ps.setString(2, data.get이름());
				ps.setString(3, data.get성별());
				ps.setString(4, data.get특징());
				ps.setString(5, data.get해적단());
				ps.setString(6, data.get역활());
			} else if("U".equals(type)){
				System.out.println(data.get번호() + "번을 변경합니다.");
				ps.setString(1, data.get역활());
				ps.setInt(2, data.get번호());
			} else if("D".equals(type)) {
				System.out.println(data.get번호() + "번을 삭제합니다.");
				ps.setInt(1, data.get번호());
			}
			
			int result = ps.executeUpdate();
	//		System.out.println(result);
			ps.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
