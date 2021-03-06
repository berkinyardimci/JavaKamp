package nLayeredHW.dataAccess.concretes;

import java.util.List;
import java.util.ArrayList;

import nLayeredHW.dataAccess.abstracts.UserDao;
import nLayeredHW.entities.concretes.User;

public class MongoDbUserDao implements UserDao {

	List<User> users = new ArrayList<User>();

	@Override
	public void create(User user) {
		users.add(user);
		System.out.println(user.getName() + " ?simli kullanc? mongoDb veri taban?na eklendi");

	}

	@Override
	public void update(User user) {
		User currentUser = getById(user.getId());
		currentUser.seteMail(user.geteMail());
		currentUser.setPassword(user.getPassword());
		System.out.println("Kullan?c? MongoDb databes'inde g?ncellenmi?tir.--> " + user.getName());

	}

	@Override
	public void delete(User user) {
		users.removeIf(obj -> obj.getId() == user.getId());

	}

	@Override
	public User getById(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;

			}
		}
		return null;
	}

	@Override
	public User emailAndPassword(String email, String password) {
		for (User user : users) {
			if (user.geteMail() == email && user.getPassword() == password) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		return users;
	}

}
