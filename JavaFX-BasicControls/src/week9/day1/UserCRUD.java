package week9.day1;

import java.sql.PreparedStatement;

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
	
	//Search
	//SelectALL
	//Update
	//Delete
}
