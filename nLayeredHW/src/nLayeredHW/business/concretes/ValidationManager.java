package nLayeredHW.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nLayeredHW.business.abstracts.ValidationService;
import nLayeredHW.entities.concretes.User;

public class ValidationManager implements ValidationService{

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	
	boolean validate = false;
	
	@Override
	public boolean validate(User user) {
		if(validatePassword(user) && validateEmail(user) && ValidateNameAndSurname(user)) {
			validate = true;
		}else {
			validate = false;
		}
		return validate;
	}

	@Override
	public boolean validatePassword(User user) {
		
		if(user.getPassword().length() >= 6) {
			validate = true;
		}else {
			validate = false;
		}
		return validate;
		
		
		
	}

	@Override
	public boolean validateEmail(User user) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(user.geteMail());
        return matcher.find();
		
	}

	@Override
	public boolean ValidateNameAndSurname(User user) {
		
		if(user.getName().length() >=2 && user.getSurname().length()>=2) {
			validate = true;
		}else {
			validate = false;
		}
			
		return validate;
		
	}

}
