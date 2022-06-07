
public class Games implements IEntity{
	
	private String gameName;
	private String type;
	
	
	public Games(String gameName, String type) {
		this.gameName = gameName;
		this.type = type;
	}
	public String getGameName() {
		return gameName;
	}
	public String getType() {
		return type;
	}
	

}
