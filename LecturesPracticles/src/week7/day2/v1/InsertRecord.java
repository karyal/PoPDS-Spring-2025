package week7.day2.v1;
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
		String sql="INSERT INTO persons(5, 'X Kumar Chaudhary', 'xkumar@gmail.com')";
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
