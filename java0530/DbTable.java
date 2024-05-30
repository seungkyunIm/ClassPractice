package java0530;

public class DbTable {

	private int no;
	private String name;
	private String sex;
	private String sig;
	private String team;
	private String role;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSig() {
		return sig;
	}
	public void setSig(String sig) {
		this.sig = sig;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "DbTable [no=" + no + ", name=" + name + ", sex=" + sex + ", sig=" + sig + ", team=" + team + ", role="
				+ role + "]";
	}

	// 테이블 정의서를 보고 필드(변수)를 선언하시오.

}
