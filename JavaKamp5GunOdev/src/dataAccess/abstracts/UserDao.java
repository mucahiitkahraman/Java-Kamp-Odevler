package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	
	void addUser(User user);
	void deleteUser(User user);
	void updateuser(User user);
	void userAuthentication(User user);
	User getById(int id);
	User getByEMail(String eMail);
	User getByEmailAndPassword(String email,String password);
	List<User> getAll();
}
