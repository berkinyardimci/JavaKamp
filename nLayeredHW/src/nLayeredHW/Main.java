package nLayeredHW;

import nLayeredHW.business.abstracts.UserService;
import nLayeredHW.business.concretes.AuthenticationManager;
import nLayeredHW.business.concretes.EmailSendManager;
import nLayeredHW.business.concretes.UserManager;
import nLayeredHW.business.concretes.ValidationManager;
import nLayeredHW.core.AuthenticationService;
import nLayeredHW.core.GoogleAuthentitcationAdapter;
import nLayeredHW.dataAccess.concretes.MongoDbUserDao;
import nLayeredHW.entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		
		
		UserService userService = new UserManager(new MongoDbUserDao());
		
		AuthenticationService authenticationService = new AuthenticationManager(new ValidationManager(),
						userService,
						new EmailSendManager());
		
		authenticationService.register("Berkin", "berkin@gmail.com", "22222222", "Yard�mc�");
		//authenticationService.register("Berkin", "@gmail.com", "123456", "Yard�mc�"); //e mailde hata al�r

		System.out.println("*****");
		
		AuthenticationService googleAuthenticationService = new GoogleAuthentitcationAdapter(new EmailSendManager(), new MongoDbUserDao());
		googleAuthenticationService.register("engin@gmail.com", "77777777", "Engin", "Demiro�");
		googleAuthenticationService.logIn("engin@gmail.com", "77777777");
		


}
}