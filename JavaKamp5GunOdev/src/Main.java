import business.concretes.UserManager;
import dataAccess.concretes.InMemoryUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		 UserManager userManager = new UserManager(new InMemoryUserDao());
         User user = new User("Mücahit", "Kahraman", "xxxxx@gmail.com", "1234");
         userManager.addUser(user);
         userManager.deleteUser(user);

	}

}
