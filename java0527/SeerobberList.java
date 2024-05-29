package java0527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SeerobberList {
	
	String 드라이버 = "org.mariadb.jdbc.Driver";
	String 주소 = "jdbc:mariadb://localhost:3306/edu";
	String 사용자 = "root";
	String 비밀번호 = "1234";
	
	public void 명단() {
		System.out.println("\t\t\t  밀집모자 해적단 명단");
		
		try {
			Class.forName(드라이버);
			Connection conn = DriverManager.getConnection(주소, 사용자, 비밀번호);
			
			String cl = "create OR REPLACE table 해적단(번호 int, 이름 varchar(20),성별 varchar(3), 특징 varchar(10), 해적단 varchar(10), 역활 varchar(10))";
			
			PreparedStatement ps = conn.prepareStatement(cl);
			ps.execute();
			
			String il1 = "insert into 해적단 (번호, 이름, 성별, 특징, 해적단, 역활) value(1, '몽키 D루피','남자','고무고무 열매', '밀짚모자', '선장')";
			String il2 = "insert into 해적단 (번호, 이름, 성별, 특징, 해적단, 역활) value(2, '롤로노아 조로','남자','삼도류', '밀짚모자', '부선장')";
			String il3 = "insert into 해적단 (번호, 이름, 성별, 특징, 해적단, 역활) value(3, '상디','남자','요리사', '밀짚모자', '요리사')";
			String il4 = "insert into 해적단 (번호, 이름, 성별, 특징, 해적단, 역활) value(4, '나미','여자','항해사', '밀짚모자', '항해사')";
			String il5 = "insert into 해적단 (번호, 이름, 성별, 특징, 해적단, 역활) value(5, '우솝','남자','사격', '밀짚모자', '저격수')";
			String il6 = "insert into 해적단 (번호, 이름, 성별, 특징, 해적단, 역활) value(6, '토니토니 쵸파','미정','사람사람 열매', '밀짚모자', '의사')";
			String il7 = "insert into 해적단 (번호, 이름, 성별, 특징, 해적단, 역활) value(7, '니코 로빈','여자','꽃꽃 열매', '밀짚모자', '고고학자')";
			String il8 = "insert into 해적단 (번호, 이름, 성별, 특징, 해적단, 역활) value(8, '프랑키','남자','사이보그', '밀짚모자', '조선공')";
			String il9 = "insert into 해적단 (번호, 이름, 성별, 특징, 해적단, 역활) value(9, '브록','남자','연주자', '밀짚모자', '선원')";
			String il10 = "insert into 해적단 (번호, 이름, 성별, 특징, 해적단, 역활) value(10, '버기','남자','동강동강 열매', '버기', '선장')";
			boolean key = true;
			for(int i = 1; i < 11; i++)
			
				if(i==1) {
					ps = conn.prepareStatement(il1);
					int result = ps.executeUpdate();
				}else if(i==2) {
					ps = conn.prepareStatement(il2);
					int result = ps.executeUpdate();
				}else if(i==3) {
					ps = conn.prepareStatement(il3);
					int result = ps.executeUpdate();
				}else if(i==4) {
					ps = conn.prepareStatement(il4);
					int result = ps.executeUpdate();
				}else if(i==5) {
					ps = conn.prepareStatement(il5);
					int result = ps.executeUpdate();
				}else if(i==6) {
					ps = conn.prepareStatement(il6);
					int result = ps.executeUpdate();
				}else if(i==7) {
					ps = conn.prepareStatement(il7);
					int result = ps.executeUpdate();
				}else if(i==8) {
					ps = conn.prepareStatement(il8);
					int result = ps.executeUpdate();
				}else if(i==9) {
					ps = conn.prepareStatement(il9);
					int result = ps.executeUpdate();
				}else {
//					key = false;
				}
				
				String select = "select * from 해적단";
				ps = conn.prepareStatement(select);
				ResultSet rs = ps.executeQuery();
				//번호, 이름, 성별, 특징, 해적단, 역활
				while(rs.next()) {
					int 번호 = rs.getInt("번호");
					String 이름 = rs.getString("이름");
					String 성별 = rs.getString("성별");
					String 특징 = rs.getString("특징");
					String 해적단 = rs.getString("해적단");
					String 역활 = rs.getString("역활");
					SrDTO srDto = new SrDTO();
					srDto.set번호(번호);
					srDto.set이름(이름);
					srDto.set성별(성별);
					srDto.set특징(특징);
					srDto.set해적단(해적단);
					srDto.set역활(역활);
					System.out.println(srDto);
				}
//				i++;
				
					
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	
	}

}
