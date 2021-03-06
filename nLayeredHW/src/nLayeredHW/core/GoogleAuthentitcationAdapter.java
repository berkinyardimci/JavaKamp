package nLayeredHW.core;

import nLayeredHW.business.abstracts.EmailVerificationService;
import nLayeredHW.dataAccess.abstracts.UserDao;
import nLayeredHW.entities.concretes.User;
import nLayeredHW.googleAuthentication.GoogleAuthenticationManager;

public class GoogleAuthentitcationAdapter implements AuthenticationService {
	
	private EmailVerificationService emailVerificationService;
	private UserDao userDao;

	

	public GoogleAuthentitcationAdapter(EmailVerificationService emailVerificationService,UserDao userDao) {
		super();
		this.emailVerificationService = emailVerificationService;
		this.userDao =userDao;
		
	}

	@Override
	public void register(String name, String email, String password, String surname) {
		User user = new User(name,email,password,surname);
		GoogleAuthenticationManager googleAuthenticationManager=new GoogleAuthenticationManager();
		googleAuthenticationManager.registerTo(email, password);
		emailVerificationService.sendEmail(user);
		userDao.create(user);
		
	}

	@Override
	public void logIn(String email, String password) {
		GoogleAuthenticationManager googleAuthenticationManager=new GoogleAuthenticationManager();
		googleAuthenticationManager.logInTo(email, password);
		
	}

}
