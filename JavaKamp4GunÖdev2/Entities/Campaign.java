
public class Campaign {
	
	private int campaignId;
	private String campaignName;
	private String campaignDetail;
	
	public Campaign()
	{
		
	}

	public Campaign(int campaignId, String campaignName, String campaignDetail) {
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.campaignDetail = campaignDetail;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignDetail() {
		return campaignDetail;
	}

	public void setCampaignDetail(String campaignDetail) {
		this.campaignDetail = campaignDetail;
	}
	
}
