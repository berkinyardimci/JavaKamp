package nLayeredHW.business.abstracts;

import nLayeredHW.entities.concretes.User;

public interface ValidationService {
	boolean validate(User user);
	
	boolean validatePassword(User user);
	
	boolean validateEmail(User user);
	
	boolean ValidateNameAndSurname(User user);
	
}
