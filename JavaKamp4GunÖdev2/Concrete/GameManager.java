
public class GameManager implements GameService {

	@Override
	public void addGame(Game game) 
	{
		System.out.println("The game has been added : " + game.getGameName());
	}

	@Override
	public void deleteGame(Game game) 
	{
		System.out.println("The game has been deleted : " + game.getGameName());
	}

	@Override
	public void updateGame(Game game) 
	{
		System.out.println("The game has been updated : " + game.getGameName());
	}

}
