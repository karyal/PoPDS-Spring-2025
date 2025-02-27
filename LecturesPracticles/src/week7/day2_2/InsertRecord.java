package week7.day2_2;
import java.sql.Connection;//Interface
import java.sql.DriverManager;//Class
import java.sql.PreparedStatement;
public class InsertRecord {
	final static String HOST="localhost";
	final static String USER="root";
	final static String PASS="pcps@123";
	final static int PORT = 3306;
	final static String DBNAME="mydb";
	final static String DRIVER="com.mysql.cj.jdbc.Driver";
	final static String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME;
	//persons (pid:int*, full_name varchar(50), email:varchar(50))
	
	public static void main(String[] args) {
		//Declare
		Connection conn;
		int tmpPID=6;
		String tmpName="Keshor Thapa";
		String tmpEmail="keshor@gmail.com";
		String sql="INSERT INTO persons(pid, full_name, email) VALUES("+tmpPID+", '"+tmpName+"', '"+tmpEmail+"')";
		PreparedStatement pStat;
		try {
			//input, process, output
			conn = DriverManager.getConnection(URL, USER, PASS);//Connect with db server
			System.out.println("Connected!"); //message to user
			pStat = conn.prepareStatement(sql);//Assign sql statement to PreparedStatement
			pStat.executeUpdate(); //insert, update, delete
			pStat.close();//Close Statement
			System.out.println("Record Inserted!");
			conn.close(); //Close Connection
			System.out.println("Connection Closed!");//message to user
		}
		catch(Exception ex) {
			//error message
			System.out.println("Error : "+ex.getMessage());
		}
	}
}
