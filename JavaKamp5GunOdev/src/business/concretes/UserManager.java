package business.concretes;

import java.util.List;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user) {
		
		userDao.addUser(user);
		
	}

	@Override
	public void deleteUser(User user) {
		
		userDao.deleteUser(user);
		
	}

	@Override
	public void updateuser(User user) {
		
		userDao.updateuser(user);
		
	}

	@Override
	public void userAuthentication(User user) {
		
		userDao.userAuthentication(user);
		
	}
	
	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}
	
	
}
