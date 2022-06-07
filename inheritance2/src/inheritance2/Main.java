package inheritance2;

public class Main {
	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		DataBaseLogger dataBaseLogger = new DataBaseLogger();
		//dataBaseLogger.log();
		customerManager.add(new DataBaseLogger());
	}
}