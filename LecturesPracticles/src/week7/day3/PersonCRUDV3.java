package week7.day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//persons(pid:int, full_name varchar(50), email varcahr(50))

public class PersonCRUDV3 {
	public void connect() {
		final String HOST = "localhost";
		final String USER = "root";
		final String PASS = "pcps@123";
		final int PORT = 3306;
		final String DBNAME = "mydb";
		final String DRIVER = "com.mysql.cj.jdbc.Driver";
		final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DBNAME;
		
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
	
	public void insert(int pid, String fullName, String email) {
		//Insert Record (values from parameter)
		final String HOST = "localhost";
		final String USER = "root";
		final String PASS = "pcps@123";
		final int PORT = 3306;
		final String DBNAME = "mydb";
		final String DRIVER = "com.mysql.cj.jdbc.Driver";
		final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DBNAME;
		// Declare
		Connection conn;
		String sql="INSERT INTO persons(pid, full_name, email) VALUES(?, ?, ?)";
		PreparedStatement pStat;
		try {
			// input, process, output
			conn = DriverManager.getConnection(URL, USER, PASS);// Connect with db server
			System.out.println("Connected!"); // message to user
			pStat = conn.prepareStatement(sql);
			pStat.setInt(1, pid); //Set value
			pStat.setString(2, fullName); //Set value
			pStat.setString(3, email); //Set value
			pStat.executeUpdate(); //Run Query
			pStat.close();
			System.out.println("Insert record successfully");
			conn.close(); // Close Connection
			System.out.println("Connection Closed!");// message to user
		} catch (Exception ex) {
			// error message
			System.out.println("Error : " + ex.getMessage());
		}
	}
}















