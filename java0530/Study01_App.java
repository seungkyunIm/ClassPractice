package java0530;

public class Study01_App {
	
	private final static String URL = "jdbc:mariadb://localhost:3306/edu";
	private final static String USER ="root";
	private final static String PASSWORD ="1234";
	
	public static void main(String[] agrs) {
		new Study01_AppController().시작(URL, USER, PASSWORD);
	}

}
