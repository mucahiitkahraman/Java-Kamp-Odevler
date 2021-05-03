import java.util.Date;
public class Main {

	public static void main(String[] args) {
		
		Campaign campaign = new Campaign();
		campaign.setCampaignName("Summer discounts");
		campaign.setCampaignId(11);
		campaign.setCampaignDetail("Discounts up to 90%");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign);
		
		Game game1 = new Game();
		game1.setGameName("Forza Horizon 4 ");
		game1.setGamePrice("40 $");
		game1.setGameId(5);
		game1.setGameDetail("Car Race");
		
		Gamer gamer1 = new Gamer();
		gamer1.setDateOfBirth("26.06.2001");
		gamer1.setFirstName("Mücahit");
		gamer1.setLastName("Kahraman");
		gamer1.setId(1903);
		gamer1.setIdentityNo("19031903");
		
		
		GameManager gameManager = new GameManager();
		gameManager.addGame(game1);
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.addGamer(gamer1);
		
		System.out.println("");
		
		campaignManager.updateCampaign(campaign);
		gameManager.updateGame(game1);
		gamerManager.updateGamer(gamer1);
		
		System.out.println("");
		
		// Campaign - Game and Gamer deleted
		campaignManager.deleteCampaign(campaign);
		gameManager.deleteGame(game1);
		gamerManager.deleteGamer(gamer1);
		
	}

}
