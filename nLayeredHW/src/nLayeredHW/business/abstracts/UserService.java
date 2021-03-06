package nLayeredHW.business.abstracts;

import java.util.List;

import nLayeredHW.entities.concretes.User;

public interface UserService {
	void create(User user);
	void update(User user);
	void delete(User user);
	User getById(int id);
	User emailAndPassword(String email, String password);
	List<User> getAll();
	
	
}
