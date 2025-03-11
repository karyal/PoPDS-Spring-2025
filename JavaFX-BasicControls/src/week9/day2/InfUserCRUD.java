package week9.day2;

public interface InfUserCRUD {
	public boolean insert(User user);
	public User search(int uid);
	public boolean update(User user);
}
