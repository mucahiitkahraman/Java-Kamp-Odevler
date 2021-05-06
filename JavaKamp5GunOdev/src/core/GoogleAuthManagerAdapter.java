package core;

import entities.concretes.User;
import googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {

	private GoogleAuthManager authManager;
	
	public GoogleAuthManagerAdapter(GoogleAuthManager authManager) {
		super();
		this.authManager = authManager;
	}

	@Override
	public void reigster(User user) {
		
		authManager.register(user);
		
	}

	@Override
	public void login(User user) {
		
		authManager.login(user);
		
	}
	
}
