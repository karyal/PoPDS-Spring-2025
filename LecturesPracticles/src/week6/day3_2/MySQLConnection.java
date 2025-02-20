package week6.day3_2;

import java.sql.Connection; //Interface
import java.sql.DriverManager;

public class MySQLConnection {

	final static String SERVER="localhost";
	final static String USER="root";
	final static String PASS="pcps@123";
	final static Integer PORT=3306;
	final static String DB_NAME="MyDB";
	final static String DRIVER="com.mysql.cj.jdbc.Driver";
	final static String URL="jdbc:mysql://"+SERVER+":"+PORT+"/"+DB_NAME;
	
	public static void main(String[] args) {
		//Declare
		Connection conn;
		try {
			//input
			//process
			//output
			conn = DriverManager.getConnection(URL, USER, PASS);//connect with database server
			System.out.println("Connect database server successfully");
			conn.close();//close the connection
			System.out.println("Close database connection successfully");
		}
		catch(Exception ex) {
			//Error message
			System.out.println("Error : "+ex.getMessage());
		}
	}

}
