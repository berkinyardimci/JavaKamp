package nLayeredHW.business.concretes;

import nLayeredHW.business.abstracts.EmailVerificationService;
import nLayeredHW.business.abstracts.UserService;
import nLayeredHW.business.abstracts.ValidationService;
import nLayeredHW.core.AuthenticationService;
import nLayeredHW.entities.concretes.User;

public class AuthenticationManager implements AuthenticationService{
	
	private ValidationService validationService;
	private UserService userService;
	private EmailVerificationService emailVerificationService;
	
	

	public AuthenticationManager(ValidationService validationService, UserService userService,
			EmailVerificationService emailVerificationService) {
		super();
		this.validationService = validationService;
		this.userService = userService;
		this.emailVerificationService = emailVerificationService;
	}

	@Override
	public void register(String name, String email, String password, String surname) {
		User currentUser = new User(email, password, name, surname);
		
		if(!(validationService.validate(currentUser))) {
			System.err.println("Bilgilerinizi kontrol edin");
			return;
		}
		
		emailVerificationService.sendEmail(currentUser);
		userService.create(currentUser);
		System.out.println("Kullanýcý oluþturuldu" + currentUser.getName());
		
	}

	@Override
	public void logIn(String email, String password) {
		User currentUser = userService.emailAndPassword(email, password);
		
		if(!(validationService.validate(currentUser))) {
			System.err.println("Bilgilerinizi kontrol edin");
			return;
		}
		System.out.println("Giriþ Baþarýlý: " + currentUser.geteMail() + " " + currentUser.getName());
	}
	
	

}
