package week6.day3_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Select All
public class SelectRecords {

	final static String SERVER = "localhost";
	final static String USER = "root";
	final static String PASS = "pcps@123";
	final static Integer PORT = 3306;
	final static String DB_NAME = "MyDB";
	final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	final static String URL = "jdbc:mysql://" + SERVER + ":" + PORT + "/" + DB_NAME;

	public static void main(String[] args) {
		Connection conn;
		String sql="SELECT * FROM persons";
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);// connect with database server
			System.out.println("Connect database server successfully");
			PreparedStatement pStat = conn.prepareStatement(sql);
			ResultSet rs = pStat.executeQuery();//Run SQL Statement
			while(rs.next()) {
				System.out.println(rs.getInt("pid")+", "+rs.getString("full_name")+", "+rs.getString("email"));
			}
			conn.close();// close the connection
			System.out.println("Close database connection successfully");
		} catch (Exception ex) {
			System.out.println("Error : " + ex.getMessage());
		}

	}

}
