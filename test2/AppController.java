package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class AppController {
	
	private Scanner scan;
	private String name;
	private DBConnection db;
	private String sql;
	
	
	public AppController() {
		this.scan = new Scanner(System.in);
		this.db = new DBConnection();
	}

	/****************************************************************/
	// 1단계 테이블 생성하기
	private void 테이블생성(Connection conn) {
		sql = "create OR REPLACE table user(no int, name varchar(10),sex varchar(5), sig varchar(10),team varchar(10),role varchar(10))"; // DDL 추가
//		System.out.println("테이블 생성 SQL문 확인 : " + sql);
		// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.		
		db.테이블생성(conn, sql);
	}
	
	// 2단계 생성된 테이블에 데이터 입력하기
	private void 입력하기(Connection conn) {
		sql = "insert into user value(?,?,?,?,?,?)"; // DML 추가
//		System.out.println("SQL문 확인 : " + sql);
		
		DbTable data = new DbTable();
		/*****************************************
		 *  Scanner 사용시 추가
		 *****************************************/
		System.out.println("추가할 번호를 적어주세요.");
		data.setNo(scan.nextInt());
		scan.nextLine();
		System.out.println("당신의 이름을 적어주세요.");
		data.setName(scan.nextLine());
		System.out.println("당신의 성별을 적어주세요.");
		data.setSex(scan.nextLine());
		System.out.println("당신의 특징을 적어주세요.");
		data.setSig(scan.nextLine());
		System.out.println("당신의 해적단을 적어주세요.");
		data.setTeam(scan.nextLine());
		System.out.println("당신의 역활을 적어주세요.");
		data.setRole(scan.nextLine());
		System.out.println(data +"\n로 입력 되었습니다.");

		// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.
		db.데이터입력하기(conn, sql, data);
	}
	
	// 3단계 생성된 데이터 가져오기 >> 목록 출력 시 화면출력() 메소드를 사용하시오.
	private void 가져오기(Connection conn) {
		sql = "select * from user"; // DML 추가
//		System.out.println("SQL문 확인 : " + sql);
		화면출력(db.데이터가져오기(conn, sql));
		
	}
	
	// 4단계 생성된 데이터 수정하기
	private void 수정하기(Connection conn) {
		sql = "update user set "
				+ "no = ?,"
				+ "name = ?,"
				+ "sex = ?,"
				+ "sig = ?,"
				+ "team = ?,"
				+ "role = ? "
				+ "where no = ?"; // DML 추가
//		System.out.println("SQL문 확인 : " + sql);
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			DbTable data = new DbTable();
			/*****************************************
			 *  Scanner 사용시 추가
			 *****************************************/
			System.out.println("수정할 번호를 선택해 주세요.");
			int un = scan.nextInt();
			scan.nextLine();
			data.setNo(un);
			System.out.println(data.getNo() + "번을 변경합니다.");
			System.out.println("수정할 목록을 선택해 주세요. 1.번호 2.이름 3.성별 4.특징 5.해적단 6.역활");
			int uk = scan.nextInt();
			scan.nextLine();
			switch(uk) {
				case 1:
					System.out.println("수정할 번호를 입력해주세요");
					data.setNo(scan.nextInt());
					scan.nextLine();
					ps.setInt(1, data.getNo());
					ps.setInt(7, data.getNo());
					break;
				case 2:
					System.out.println("수정할 이름을 입력해주세요");
					data.setName(scan.nextLine());
					ps.setString(2, data.getName());
					ps.setInt(7, data.getNo());
					break;
				case 3:
					System.out.println("수정할 성별을 입력해주세요");
					data.setSex(scan.nextLine());
					ps.setString(3, data.getSex());
					ps.setInt(7, data.getNo());
					break;
				case 4:
					System.out.println("수정할 특징을 입력해주세요");
					data.setSig(scan.nextLine());
					ps.setString(4, data.getSig());
					ps.setInt(7, data.getNo());
					break;
				case 5:
					System.out.println("수정할 해적단을 입력해주세요");
					data.setTeam(scan.nextLine());
					ps.setString(5, data.getTeam());
					ps.setInt(7, data.getNo());
					break;
				case 6:
					System.out.println("수정할 역활을 입력해주세요");
					data.setRole(scan.nextLine());
					ps.setString(6, data.getRole());
					ps.setInt(7, data.getNo());
					break;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 기능을 입력해주세요.");
			}
			System.out.println(data);
			// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.
			db.데이터수정하기(conn, sql, data);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
		
	// 5단계 생성된 데이터 삭제하기
	private void 삭제하기(Connection conn) {
		sql = "delete from user where no = ?"; // DML 추가
//		System.out.println("SQL문 확인 : " + sql);
		DbTable data = new DbTable();

		/*****************************************
		 *  Scanner 사용시 추가
		 *****************************************/
		System.out.println("삭제할 번호를 입력해주세요.");
		data.setNo(scan.nextInt());
		scan.nextLine();
//		System.out.println(data);
		// 코드추가를 확인 후 아래의 주석을 풀고 실행하세요.
		db.데이터삭제하기(conn, sql, data);
	}
	/****************************************************************/
	
	private void 사용자() {
		System.out.println("당신은 누구인가요?");
		this.name = scan.nextLine();
		System.out.println(this.name + "님 환영합니다.");
	}
	
	private void 종료() {
		System.out.println(this.name + "님 다음에 또 찾아주세요.");
		scan.close();
	}
	
	private void 화면출력(List<DbTable> list) {
		for(int i = 0; i < list.size(); i++) {
			DbTable data = list.get(i);
			System.out.println(data);
		}
	}
	
	private boolean 디비접속() {
		boolean result = false;
		boolean key = true;
		System.out.println("데이터베이스에 연결하시겠습니까?(Y/N)");
		while(key) {
			switch (scan.nextLine()) {
				case "Y":
				case "y":
					result = true;
				case "N":
				case "n":
					key = false;
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
			}
		}
		return result;
	}
	
	public void 시작(String URL, String USER, String PASSWORD) {
		사용자();
		if(디비접속()) {
			try {
				Connection conn = db.openDB(URL, USER, PASSWORD);
				if(conn != null) {
					테이블생성(conn);		// 시험문제 나올 수 있음 주석처리하는거 create 뒤에 or replace			
					boolean key = true;
					while(key) {
						System.out.println("어떤 기능을 실행하시겠습니까?(C입력/R읽기/U수정/D삭제/E종료");
						switch (scan.nextLine()) {
							case "C": 
							case "c":
								입력하기(conn);
								break;
							case "R": 
							case "r":
								가져오기(conn);
								break;
							case "U": 
							case "u":
								수정하기(conn);
								break;
							case "D": 
							case "d":
								삭제하기(conn);
								break;
							case "E": 
							case "e":
								key = false;
								break;
							default:
								System.out.println("잘못된 입력입니다. 다시 기능을 입력해주세요.");
						}
					}
					conn.close();
					종료();
				} else {
					System.out.println("데이터 접속 정보를 확인해 주세요.");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			종료();
		}
	}

}