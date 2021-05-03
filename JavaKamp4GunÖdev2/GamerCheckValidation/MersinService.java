public class MersinService implements GamerCheckService {
	
	@Override
	public boolean checkIfRealPerson(Gamer gamer) 
	{
		if(!gamer.getIdentityNo().isEmpty() && !gamer.getFirstName().isEmpty())
		{
			System.out.println("The player has been checked. ");
			return true;
		}
		else
		{
			System.out.println("There is no such player! ");
			return false;
		}
		
    }
}

