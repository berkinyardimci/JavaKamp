package nLayeredHW.core;

public interface AuthenticationService {
	void register(String name, String email, String password, String surname);
	
	void logIn(String email, String password);
}
