package nLayeredHW.dataAccess.abstracts;

import java.util.List;

import nLayeredHW.entities.concretes.User;

public interface UserDao {
	void create(User user);
	void update(User user);
	void delete(User user);
	User emailAndPassword(String email, String password);
	User getById(int id);
	List<User> getAllUsers();
}
