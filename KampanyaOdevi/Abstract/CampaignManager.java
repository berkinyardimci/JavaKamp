
public class CampaignManager implements ICampaingServices {
	
	@Override
	public void buy(User user, Games game) {
		System.out.println(game.getGameName() +" "+ " "+ user.getFirstName() +" Taraf�ndan Adl� oyun al�nm��t�r.");
		
	}
}
