
public class Game {
	
	private int gameId;
	private String gameName;
	private String gamePrice;
	private String gameDetail;
	
	public Game()
	{
		
	}

	public Game(int gameId, String gameName, String gamePrice, String gameDetail) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
		this.gameDetail = gameDetail;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(String gamePrice) {
		this.gamePrice = gamePrice;
	}

	public String getGameDetail() {
		return gameDetail;
	}

	public void setGameDetail(String gameDetail) {
		this.gameDetail = gameDetail;
	}
}
