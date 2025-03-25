package mylibs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ResultProcessing {
	
	public Student calculateResult(Student student) {
		//calculate total
		student.setTotal(student.getDcn()+student.getPop());
		//calculate average
		student.setAverage(student.getTotal()/2);
		//calculate result
		if((student.getDcn()>=40) && (student.getPop()>=40)) {
			student.setResult("PASS");
		}
		else {
			student.setResult("FAIL");
		}
		return student;
	}
	
	public void insert(Student student) { //insert record on table
		String DRIVER="com.mysql.cj.jdbc.Driver";
		String HOST="localhost";
		int PORT=3306;
		String USER="root";
		String PASS="pcps@123";
		String DBNAME="Results";
		String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		String SQL = "insert into student_results values(?, ?, ?, ?, ?, ?, ?);";
		
		try{
			Class.forName(DRIVER); //Loading Driver Class
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Connected.");
			PreparedStatement pStat = conn.prepareStatement(SQL);
			pStat.setInt(1, student.getSid());
			pStat.setString(2, student.getFull_name());
			pStat.setString(3, student.getCourse());
			pStat.setString(4, student.getCurrent_level());
			pStat.setString(5, student.getSection());
			pStat.setInt(6, student.getDcn());
			pStat.setInt(7, student.getPop());
			pStat.executeUpdate(); //insert, update, delete
			System.out.println("Inserted.");
			conn.close();
			System.out.println("Closed.");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
	}
	
	public Student search(int sid) { //search record on table based on sid
		String DRIVER="com.mysql.cj.jdbc.Driver";
		String HOST="localhost";
		int PORT=3306;
		String USER="root";
		String PASS="pcps@123";
		String DBNAME="Results";
		String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		String SQL = "SELECT * FROM student_results WHERE sid=?";
		Student s1 = new Student();
		try{
			Class.forName(DRIVER); //Loading Driver Class
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Connected.");
			PreparedStatement pStat = conn.prepareStatement(SQL);
			pStat.setInt(1, sid);
			ResultSet rs = pStat.executeQuery(); //Select
			while(rs.next()) {
				s1 = new Student();
				s1.setSid(rs.getInt("sid"));
				s1.setFull_name(rs.getString("full_name"));
				s1.setCourse(rs.getString("course"));
				s1.setCurrent_level(rs.getString("current_level"));
				s1.setSection(rs.getString("section"));
				s1.setDcn(rs.getInt("dcn"));
				s1.setPop(rs.getInt("pop"));
			}
			System.out.println("Search.");
			conn.close();
			System.out.println("Closed.");
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return s1;
	}
	
	public boolean edit(Student student) { //insert record on table
		String DRIVER="com.mysql.cj.jdbc.Driver";
		String HOST="localhost";
		int PORT=3306;
		String USER="root";
		String PASS="pcps@123";
		String DBNAME="Results";
		String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		String SQL = "update student_results set full_name=?, course=?, current_level=?, section=?, dcn=?, pop=? WHERE sid=?";
		boolean result=false;
		try{
			Class.forName(DRIVER); //Loading Driver Class
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Connected.");
			PreparedStatement pStat = conn.prepareStatement(SQL);
			pStat.setString(1, student.getFull_name());
			pStat.setString(2, student.getCourse());
			pStat.setString(3, student.getCurrent_level());
			pStat.setString(4, student.getSection());
			pStat.setInt(5, student.getDcn());
			pStat.setInt(6, student.getPop());
			pStat.setInt(7, student.getSid());
			pStat.executeUpdate(); //insert, update, delete
			System.out.println("Edited.");
			conn.close();
			System.out.println("Closed.");
			result=true;
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return result;
	}
	
	public boolean delete(int sid) { //insert record on table
		String DRIVER="com.mysql.cj.jdbc.Driver";
		String HOST="localhost";
		int PORT=3306;
		String USER="root";
		String PASS="pcps@123";
		String DBNAME="Results";
		String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
		String SQL = "delete FROM student_results WHERE sid=?";
		boolean result=false;
		try{
			Class.forName(DRIVER); //Loading Driver Class
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Connected.");
			PreparedStatement pStat = conn.prepareStatement(SQL);
			pStat.setInt(1, sid);
			pStat.executeUpdate(); //insert, update, delete
			System.out.println("Deleted.");
			conn.close();
			System.out.println("Closed.");
			result=true;
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return result;
	}
}





