
public class Campaign2 extends CampaignManager {
	@Override
	public void buy(User user, Games game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() +" "+ " "+ user.getFirstName() + 
				" Tarafýndan  Adlý oyun %85 Ýndirimle alýnmýþtýr.");
	}
}
