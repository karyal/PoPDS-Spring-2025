package week7.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	public void update(int pid, String fullName, String email) {
		//Update Record (values from parameter)
		final String HOST = "localhost";
		final String USER = "root";
		final String PASS = "pcps@123";
		final int PORT = 3306;
		final String DBNAME = "mydb";
		final String DRIVER = "com.mysql.cj.jdbc.Driver";
		final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DBNAME;
		// Declare
		Connection conn;
		String sql="UPDATE persons SET full_name=?, email=? WHERE pid=?";
		PreparedStatement pStat;
		try {
			// input, process, output
			conn = DriverManager.getConnection(URL, USER, PASS);// Connect with db server
			System.out.println("Connected!"); // message to user
			pStat = conn.prepareStatement(sql);
			pStat.setString(1, fullName); //Set value
			pStat.setString(2, email); //Set value
			pStat.setInt(3, pid); //Set value
			pStat.executeUpdate(); //Run Query
			pStat.close();
			System.out.println("Update record successfully");
			conn.close(); // Close Connection
			System.out.println("Connection Closed!");// message to user
		} catch (Exception ex) {
			// error message
			System.out.println("Error : " + ex.getMessage());
		}
	}
	
	public void delete(int pid) {
		//Delete Record (values from parameter)
		final String HOST = "localhost";
		final String USER = "root";
		final String PASS = "pcps@123";
		final int PORT = 3306;
		final String DBNAME = "mydb";
		final String DRIVER = "com.mysql.cj.jdbc.Driver";
		final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DBNAME;
		// Declare
		Connection conn;
		String sql="DELETE FROM persons WHERE pid=?";
		PreparedStatement pStat;
		try {
			// input, process, output
			conn = DriverManager.getConnection(URL, USER, PASS);// Connect with db server
			System.out.println("Connected!"); // message to user
			pStat = conn.prepareStatement(sql);
			pStat.setInt(1, pid); //Set value
			pStat.executeUpdate(); //Run Query
			pStat.close();
			System.out.println("Delete record successfully");
			conn.close(); // Close Connection
			System.out.println("Connection Closed!");// message to user
		} catch (Exception ex) {
			// error message
			System.out.println("Error : " + ex.getMessage());
		}
	}
	
	public Person searchPID(int pid) {
		final String HOST = "localhost";
		final String USER = "root";
		final String PASS = "pcps@123";
		final int PORT = 3306;
		final String DBNAME = "mydb";
		final String DRIVER = "com.mysql.cj.jdbc.Driver";
		final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DBNAME;
		
		// Declare
		Connection conn;
		String sql="SELECT * FROM persons WHERE pid=?";
		PreparedStatement pStat;
		ResultSet rs;
		Person person=new Person();
		
		try {
			// input, process, output
			conn = DriverManager.getConnection(URL, USER, PASS);// Connect with db server
			System.out.println("Connected!"); // message to user
			pStat=conn.prepareStatement(sql);
			pStat.setInt(1,pid);
			rs=pStat.executeQuery();//Select, & Search
			while(rs.next()) {
				person.setPID(rs.getInt("pid"));
				person.setFullName(rs.getString("full_name"));
				person.setEmail(rs.getString("email"));
			}
			rs.close();
			pStat.close();
			conn.close(); // Close Connection
			System.out.println("Connection Closed!");// message to user
		} catch (Exception ex) {
			// error message
			System.out.println("Error : " + ex.getMessage());
		}
		return person;
	}
	public List all() {
		final String HOST = "localhost";
		final String USER = "root";
		final String PASS = "pcps@123";
		final int PORT = 3306;
		final String DBNAME = "mydb";
		final String DRIVER = "com.mysql.cj.jdbc.Driver";
		final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DBNAME;
		
		// Declare
		Connection conn;
		String sql="SELECT * FROM persons";
		PreparedStatement pStat;
		ResultSet rs;
		List<Person> persons=new ArrayList<Person>();
		
		try {
			// input, process, output
			conn = DriverManager.getConnection(URL, USER, PASS);// Connect with db server
			System.out.println("Connected!"); // message to user
			pStat=conn.prepareStatement(sql);
			rs=pStat.executeQuery();//Select, & Search
			while(rs.next()) {
				Person person=new Person();
				person.setPID(rs.getInt("pid"));
				person.setFullName(rs.getString("full_name"));
				person.setEmail(rs.getString("email"));
				persons.add(person);
			}
			rs.close();
			pStat.close();
			conn.close(); // Close Connection
			System.out.println("Connection Closed!");// message to user
		} catch (Exception ex) {
			// error message
			System.out.println("Error : " + ex.getMessage());
		}
		return persons;
	}
}















