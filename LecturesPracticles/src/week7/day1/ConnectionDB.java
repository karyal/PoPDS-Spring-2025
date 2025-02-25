package week7.day1;
import java.sql.Connection;//Interface
import java.sql.DriverManager;//Class
public class ConnectionDB {
	final static String HOST="localhost";
	final static String USER="root";
	final static String PASS="pcps@123";
	final static int PORT = 3306;
	final static String DBNAME="mydb";
	final static String DRIVER="com.mysql.cj.jdbc.Driver";
	final static String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
	
	public static void main(String[] args) {
		//Declare
		Connection conn;
		try {
			//input, process, output
			conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Connected!");
			conn.close();
			System.out.println("Connection Closed!");
		}
		catch(Exception ex) {
			//error message
			System.out.println("Error : "+ex.getMessage());
		}
	}
}
