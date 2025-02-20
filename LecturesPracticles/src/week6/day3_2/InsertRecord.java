package week6.day3_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRecord {

	final static String SERVER = "localhost";
	final static String USER = "root";
	final static String PASS = "pcps@123";
	final static Integer PORT = 3306;
	final static String DB_NAME = "MyDB";
	final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	final static String URL = "jdbc:mysql://" + SERVER + ":" + PORT + "/" + DB_NAME;
	
	public static void main(String[] args) {
		Connection conn;
		String sql ="INSERT INTO persons VALUES(1, 'bhusan', 'bhusan@gmail.com')";
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);// connect with database server
			System.out.println("Connect database server successfully");
			PreparedStatement pStat = conn.prepareStatement(sql);
			pStat.executeUpdate(); //insert, update, delete
			System.out.println("Insert record successfully");
			conn.close();// close the connection
			System.out.println("Close database connection successfully");
		} catch (Exception ex) {

			System.out.println("Error : " + ex.getMessage());
		}
	}

}
