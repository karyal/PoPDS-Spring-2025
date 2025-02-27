package week7.day2_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnectDatabase {

	final static String HOST = "localhost";
	final static String USER = "root";
	final static String PASS = "pcps@123";
	final static int PORT = 3306;
	final static String DBNAME = "mydb";
	final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	final static String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DBNAME;

	public static void main(String[] args) {
		// Declare
		Connection conn;
		try {
			// input, process, output
			conn = DriverManager.getConnection(URL, USER, PASS);// Connect with db server
			System.out.println("Connected!"); // message to user
			conn.close(); // Close Connection
			System.out.println("Connection Closed!");// message to user
		} catch (Exception ex) {
			// error message
			System.out.println("Error : " + ex.getMessage());
		}

	}

}
