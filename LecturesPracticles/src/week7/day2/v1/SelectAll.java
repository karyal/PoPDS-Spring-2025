package week7.day2.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectAll {

	final static String DRIVER="com.mysql.cj.jdbc.Driver";
	final static String HOST="127.0.0.1"; //localhost //10.10.8.140
	final static int PORT=3306;
	final static String USER="root";
	final static String PASS="pcps@123";
	final static String DBNAME="mydb";
	final static String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
	
	public static void main(String[] args) {
		//persons(pid:int*, full_name varchar(50), email varchar(50))
		//Declare
		Connection conn;
		String sql="SELECT * FROM persons";
		PreparedStatement pStat;//Execute SQL Statement (DDL/DML)
		ResultSet rs;
		try {
			//input, process, output
			Class.forName(DRIVER); //Load Driver Class
			//1. Connect
			conn=DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Connected!");
			//2. SQL Statement Execute
			pStat=conn.prepareStatement(sql);//Set sql to PreparedStatement
			rs = pStat.executeQuery(); //execute sql statement
			//3. Display Records
			while(rs.next()) { //rs.next() returns true if rs have record
				System.out.println(rs.getInt("pid")+", "+rs.getString("full_name")+", "+rs.getString("email"));
			}
			//4. Close Connection
			conn.close();
			System.out.println("Connection Closed!");
		}
		catch(Exception ex) {
			//Error message
			System.out.println("Error : "+ex.getMessage());
		}
	}
}


