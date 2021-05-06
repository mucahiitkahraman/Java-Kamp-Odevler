package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	List<User> users = new ArrayList<User>();
	
	public InMemoryUserDao(ArrayList<User> users) {
        this.users = users;
    }
	
	@Override
	public void addUser(User user) {
		users.add(user);		
	}

	@Override
	public void deleteUser(User user) {
		
		users.remove(user);
		
	}

	@Override
	public void updateuser(User user) {
		
		System.out.println("Your profile information has been successfully updated");
		
	}

	@Override
	public void userAuthentication(User user) {
		System.out.println("Confirmed");
	}

	@Override
	public User getByEMail(String eMail) {
		for(User user : users)
		{
			if(user.geteMail() == eMail)
			{
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public User getById(int id) {
		for(User user : users)
		{
			if(user.getId() == id)
			{
				return user;
			}
		}
		
		return null;
	}

	@Override
	public User getByEmailAndPassword(String eMail, String password) {
		for(User user : users)
		{
			if(user.geteMail() == eMail && user.getPassword() == password)
			{
				return user;
			}
		}
		return null;
	}

}
