package nLayeredHW.business.abstracts;

import nLayeredHW.entities.concretes.User;

public interface EmailVerificationService {
	void sendEmail(User user);
}
