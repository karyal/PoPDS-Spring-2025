package week7.day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonCRUDV6 extends Database {
	public void insert(Person person) {
		String sql = "INSERT INTO persons(pid, full_name, email) VALUES(?, ?, ?)";
		PreparedStatement pStat;
		Connection conn;
		try {
			// input, process, output
			conn = connect();// Connect with db server
			System.out.println("Connected!"); // message to user
			pStat = conn.prepareStatement(sql);
			pStat.setInt(1, person.getPID()); // Set value
			pStat.setString(2, person.getFullName()); // Set value
			pStat.setString(3, person.getEmail()); // Set value
			pStat.executeUpdate(); // Run Query
			pStat.close();
			System.out.println("Insert record successfully");
			conn.close(); // Close Connection
			System.out.println("Connection Closed!");// message to user
		} catch (Exception ex) {
			// error message
			System.out.println("Error : " + ex.getMessage());
		}
	}
	
	public void update(Person person) {
		// Update Record (values from parameter)
		String sql = "UPDATE persons SET full_name=?, email=? WHERE pid=?";
		PreparedStatement pStat;
		Connection conn;
		try {
			// input, process, output
			conn = connect();// Connect with db server
			System.out.println("Connected!"); // message to user
			pStat = conn.prepareStatement(sql);
			pStat.setString(1, person.getFullName()); // Set value
			pStat.setString(2, person.getEmail()); // Set value
			pStat.setInt(3, person.getPID()); // Set value
			pStat.executeUpdate(); // Run Query
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
		String sql = "DELETE FROM persons WHERE pid=?";
		PreparedStatement pStat;
		Connection conn;
		try {
			// input, process, output
			conn = connect();// Connect with db server
			System.out.println("Connected!"); // message to user
			pStat = conn.prepareStatement(sql);
			pStat.setInt(1, pid); // Set value
			pStat.executeUpdate(); // Run Query
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
		String sql = "SELECT * FROM persons WHERE pid=?";
		PreparedStatement pStat;
		ResultSet rs;
		Person person = new Person();
		Connection conn;
		try {
			// input, process, output
			conn = connect();// Connect with db server
			System.out.println("Connected!"); // message to user
			pStat = conn.prepareStatement(sql);
			pStat.setInt(1, pid);
			rs = pStat.executeQuery();// Select, & Search
			while (rs.next()) {
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
		String sql = "SELECT * FROM persons";
		PreparedStatement pStat;
		ResultSet rs;
		List<Person> persons = new ArrayList<Person>();
		Connection conn;
		try {
			// input, process, output
			conn = connect();// Connect with db server
			System.out.println("Connected!"); // message to user
			pStat = conn.prepareStatement(sql);
			rs = pStat.executeQuery();// Select, & Search
			while (rs.next()) {
				Person person = new Person();
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
