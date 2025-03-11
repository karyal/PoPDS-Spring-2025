package week9.day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserCRUD extends MyDatabase implements InfUserCRUD {

	//Insert
	@Override
	public boolean insert(User user) {
		boolean result = false;
		PreparedStatement pStat;
		String sql ="INSERT INTO users VALUES(?, ?, ?, ?, ?, ?);";
		try {
			pStat=connect().prepareStatement(sql);
			pStat.setInt(1, user.getUid());
			pStat.setString(2, user.getFullName());
			pStat.setString(3, user.getAddress());
			pStat.setString(4, user.getEmail());
			pStat.setString(5, user.getLoginID());
			pStat.setString(6, user.getLoginPassword());
			pStat.executeUpdate();
			pStat.close();
			result=true;
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return result;
	}
	
	@Override
	public User search(int uid) {
		Connection conn;
		PreparedStatement pStat;
		ResultSet resultSet;
		String sqlQuery="SELECT * FROM users WHERE uid=?;";
		User user = new User();
		
		try {
			conn = connect();
			pStat = conn.prepareStatement(sqlQuery);
			pStat.setInt(1, uid);
			resultSet = pStat.executeQuery(); //Select
			while(resultSet.next()) {
				user.setUid(resultSet.getInt("uid"));
				user.setFullName(resultSet.getString("full_name"));
				user.setAddress(resultSet.getString("address"));
				user.setEmail(resultSet.getString("email"));
				user.setLoginID(resultSet.getString("login_id"));
				user.setLoginPassword(resultSet.getString("login_pass"));
			}
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return user;
	}
	
	@Override
	public boolean update(User user) {
		
		boolean result=false;
		Connection conn;
		String strSQL="UPDATE users SET full_name=?, address=?, email=?, login_id=?, login_pass=? WHERE uid=?;";
		PreparedStatement pStat;
		
		try {
			conn = connect();
			pStat = conn.prepareStatement(strSQL);
			pStat.setString(1, user.getFullName());
			pStat.setString(2, user.getAddress());
			pStat.setString(3, user.getEmail());
			pStat.setString(4, user.getLoginID());
			pStat.setString(5, user.getLoginPassword());
			pStat.setInt(6, user.getUid());
			pStat.executeUpdate(); //insert, update, delete
			pStat.close();
			close(conn);
			result=true;
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		return result;
	}
	
	//Search
	//SelectALL
	//Update
	//Delete
}






