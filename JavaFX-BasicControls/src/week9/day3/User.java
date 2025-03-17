package week9.day3;

public class User {
	private int uid;
	private String fullName;
	private String address;
	private String email;
	private String loginID;
	private String loginPassword;
	//Constructors, Setters, Getter, and toString
	
	public User() {
		this.uid = 0;
		this.fullName = "";
		this.address = "";
		this.email = "";
		this.loginID = "";
		this.loginPassword = "";
	}
	
	public User(int uid, String fullName, String address, String email, String loginID, String loginPassword) {
		this.uid = uid;
		this.fullName = fullName;
		this.address = address;
		this.email = email;
		this.loginID = loginID;
		this.loginPassword = loginPassword;
	}
	
	public User(User user) {
		this.uid = user.uid;
		this.fullName = user.fullName;
		this.address = user.address;
		this.email = user.email;
		this.loginID = user.loginID;
		this.loginPassword = user.loginPassword;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginID() {
		return loginID;
	}

	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", fullName=" + fullName + ", address=" + address + ", email=" + email
				+ ", loginID=" + loginID + ", loginPassword=" + loginPassword + "]";
	}
}
