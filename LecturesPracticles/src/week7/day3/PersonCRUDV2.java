package week7.day3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

//All methods in one class
public class PersonCRUDV2 {

	// Connect with database server
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

	public void insert() {
		final String HOST = "localhost";
		final String USER = "root";
		final String PASS = "pcps@123";
		final int PORT = 3306;
		final String DBNAME = "mydb";
		final String DRIVER = "com.mysql.cj.jdbc.Driver";
		final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DBNAME;
		// persons (pid:int*, full_name varchar(50), email:varchar(50))

		// Declare
		Connection conn;
		
		System.out.println("Enter PID : ");
		int tmpPID = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.println("Enter NAME : ");
		String tmpName = new Scanner(System.in).nextLine();
		System.out.println("Enter EMAIL : ");
		String tmpEmail = new Scanner(System.in).nextLine();
		
		String sql = "INSERT INTO persons(pid, full_name, email) VALUES(" + tmpPID + ", '" + tmpName + "', '" + tmpEmail + "')";
		PreparedStatement pStat;
		try {
			// input, process, output
			conn = DriverManager.getConnection(URL, USER, PASS);// Connect with db server
			System.out.println("Connected!"); // message to user
			pStat = conn.prepareStatement(sql);// Assign sql statement to PreparedStatement
			pStat.executeUpdate(); // insert, update, delete
			pStat.close();// Close Statement
			System.out.println("Record Inserted!");
			conn.close(); // Close Connection
			System.out.println("Connection Closed!");// message to user
		} catch (Exception ex) {
			// error message
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public void all() {
		final String DRIVER = "com.mysql.cj.jdbc.Driver";
		final String HOST = "127.0.0.1"; // localhost //10.10.8.140
		final int PORT = 3306;
		final String USER = "root";
		final String PASS = "pcps@123";
		final String DBNAME = "mydb";
		final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DBNAME;
		// persons(pid:int*, full_name varchar(50), email varchar(50))
		// Declare
		Connection conn;
		String sql = "SELECT * FROM persons";
		PreparedStatement pStat;// Execute SQL Statement (DDL/DML)
		ResultSet rs;
		try {
			// input, process, output
			Class.forName(DRIVER); // Load Driver Class
			// 1. Connect
			conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Connected!");
			// 2. SQL Statement Execute
			pStat = conn.prepareStatement(sql);// Set sql to PreparedStatement
			rs = pStat.executeQuery(); // execute sql statement
			// 3. Display Records
			System.out.println("PID\t\tNAME\t\t\tEMAIL");// tab space
			while (rs.next()) { // rs.next() returns true if rs have record
				System.out.println(
						rs.getInt("pid") + "\t\t" + rs.getString("full_name") + "\t\t" + rs.getString("email"));
			}
			// 4. Close Connection
			conn.close();
			System.out.println("Connection Closed!");
		} catch (Exception ex) {
			// Error message
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public void searchPID() {
		final String DRIVER = "com.mysql.cj.jdbc.Driver";
		final String HOST = "127.0.0.1"; // localhost //10.10.8.140
		final int PORT = 3306;
		final String USER = "root";
		final String PASS = "pcps@123";
		final String DBNAME = "mydb";
		final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DBNAME;

		// persons(pid:int*, full_name varchar(50), email varchar(50))
		// Declare
		Connection conn;
		int pid = 2;
		String sql = "SELECT * FROM persons WHERE pid=" + pid;
		PreparedStatement pStat;// Execute SQL Statement (DDL/DML)
		ResultSet rs;
		try {
			// input, process, output
			Class.forName(DRIVER); // Load Driver Class
			// 1. Connect
			conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Connected!");
			// 2. SQL Statement Execute
			pStat = conn.prepareStatement(sql);// Set sql to PreparedStatement
			rs = pStat.executeQuery(); // execute sql statement
			// 3. Display Records
			while (rs.next()) { // rs.next() returns true if rs have record
				System.out.println(rs.getInt("pid") + ", " + rs.getString("full_name") + ", " + rs.getString("email"));
			}
			// 4. Close Connection
			conn.close();
			System.out.println("Connection Closed!");
		} catch (Exception ex) {
			// Error message
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public void update() {
		final String HOST = "localhost";
		final String USER = "root";
		final String PASS = "pcps@123";
		final int PORT = 3306;
		final String DBNAME = "mydb";
		final String DRIVER = "com.mysql.cj.jdbc.Driver";
		final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DBNAME;
		// persons (pid:int*, full_name varchar(50), email:varchar(50))

		// Declare
		Connection conn;
		int tmpPID = 2;
		String tmpFullName = "Ujjwal Sharma";
		String sql = "UPDATE persons SET full_name='" + tmpFullName + "' WHERE pid=" + tmpPID;
		PreparedStatement pStat;

		try {
			// input, process, output
			conn = DriverManager.getConnection(URL, USER, PASS);// Connect with db server
			System.out.println("Connected!"); // message to user
			pStat = conn.prepareStatement(sql);// Assign sql statement to PreparedStatement
			pStat.executeUpdate(); // insert, update, delete
			pStat.close();// Close Statement
			System.out.println("Record Updated!");
			conn.close(); // Close Connection
			System.out.println("Connection Closed!");// message to user
		} catch (Exception ex) {
			// error message
			System.out.println("Error : " + ex.getMessage());
		}
	}

	public void delete() {
		final String HOST = "localhost";
		final String USER = "root";
		final String PASS = "pcps@123";
		final int PORT = 3306;
		final String DBNAME = "mydb";
		final String DRIVER = "com.mysql.cj.jdbc.Driver";
		final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DBNAME;
		// persons (pid:int*, full_name varchar(50), email:varchar(50))
		// Declare
		Connection conn;
		int tmpPID = 1;
		String sql = "DELETE FROM persons WHERE pid=" + tmpPID;
		PreparedStatement pStat;

		try {
			// input, process, output
			conn = DriverManager.getConnection(URL, USER, PASS);// Connect with db server
			System.out.println("Connected!"); // message to user
			pStat = conn.prepareStatement(sql);// Assign sql statement to PreparedStatement
			pStat.executeUpdate(); // insert, update, delete
			pStat.close();// Close Statement
			System.out.println("Record Deleted!");
			conn.close(); // Close Connection
			System.out.println("Connection Closed!");// message to user
		} catch (Exception ex) {
			// error message
			System.out.println("Error : " + ex.getMessage());
		}
	}
}
