
public class UserManager {
	
	public void SignIn(User user)
	{
		System.out.println("-------------------------------------------");
		System.out.println("Welcome" + " " + 
		user.getFirstName() + " " +  
		user.getLastName() + "!" + " " + "Login successful.");
		
	}
	
	public void SignOut(User user)
	{
		
		System.out.println(user.getFirstName() + " " +  
	                       user.getLastName() + " " + "The session has been successfully logged out.");
	}
	
	public void deletedAccount(User user)
	{
		
		System.out.println("The user account named " + user.getFirstName() + " " + 
	                       user.getLastName() + " " +  "as successfully deleted.");
	}
	
	
}
