package nLayeredHW.business.concretes;

import java.util.List;

import nLayeredHW.business.abstracts.UserService;
import nLayeredHW.dataAccess.abstracts.UserDao;
import nLayeredHW.entities.concretes.User;

public class UserManager implements UserService{

	
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void create(User user) {
		userDao.create(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public User getById(int id) {
		return userDao.getById(id);

	}
	
	@Override
	public User emailAndPassword(String email, String password) {
		return userDao.emailAndPassword(email, password);

	}

	@Override
	public List<User> getAll() {
		return userDao.getAllUsers();
	}

	

}
