package week10.day1;

import java.util.List;

public interface InfUserCRUD {
	public boolean insert(User user);
	public User search(int uid);
	public boolean update(User user);
	public boolean delete(int uid);
	public List all();
}
