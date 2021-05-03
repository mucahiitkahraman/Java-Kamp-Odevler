
public class GamerManager implements GamerService {

	@Override
	public void addGamer(Gamer gamer) 
	{
		System.out.println("A new player named " + " " + gamer.getFirstName() + " " + "has been added to the system.");
	}

	@Override
	public void deleteGamer(Gamer gamer) 
	{
		System.out.println("The player named " + " " + gamer.getFirstName() + " " + "has been deleted from the system.");
	}

	@Override
	public void updateGamer(Gamer gamer) 
	{
		System.out.println("The information of the player named " + " " + gamer.getFirstName() + " " + "has been updated.");
	}
	
}
