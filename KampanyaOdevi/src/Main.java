
public class Main {

	public static void main(String[] args) {
		
		User user1 = new User("Berkin","Yard�mc�",1998,"55555");
		Games game = new Games("Gta","Sava�");	
		user1.update("Mehmet", user1);
		
		CampaignManager campaignManager = new Campaign2();
		campaignManager.buy(user1,game);
		

	}

}
