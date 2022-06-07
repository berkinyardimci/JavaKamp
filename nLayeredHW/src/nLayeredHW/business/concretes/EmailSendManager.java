package nLayeredHW.business.concretes;

import nLayeredHW.business.abstracts.EmailVerificationService;
import nLayeredHW.entities.concretes.User;

public class EmailSendManager implements EmailVerificationService{
	
	//private User user;
	
	@Override
	public void sendEmail(User user) {
		System.out.println("Email gönderildi: " + user.geteMail());
		
	}
	
}
