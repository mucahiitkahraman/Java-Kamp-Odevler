package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
	
	void addUser(User user);
	void deleteUser(User user);
	void updateuser(User user);
	void userAuthentication(User user);
	List<User> getAll();
	
}
