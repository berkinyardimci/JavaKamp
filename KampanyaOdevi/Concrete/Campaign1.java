
public class Campaign1 extends CampaignManager {
	@Override
	public void buy(User user, Games game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameName() +" "+ " "+ user.getFirstName() + 
				" Taraf?ndan  Adl? oyun %50 ?ndirimle al?nm??t?r.");
	}
	
}
