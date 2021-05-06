package googleAuth;

import entities.concretes.User;

public class GoogleAuthManager {
	
	 public void register(User user)
	 {
         System.out.println("User added with Google : " + user.getFirstName() + " " + user.getLastName());
     }
	 
	 public void login(User user)
	 {
	        System.out.println("Giriþ Google ile yapýldý : " + user.geteMail());
	 }
	 
	
}
