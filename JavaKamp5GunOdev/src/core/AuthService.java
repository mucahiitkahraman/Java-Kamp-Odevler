package core;

import entities.concretes.User;

public interface AuthService {
	
	void reigster(User user);
	void login(User user);
	
}
