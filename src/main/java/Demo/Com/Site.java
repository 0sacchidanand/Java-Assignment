package Demo.Com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Site {
	
	private void homePage(User u)
	{
		System.out.println("Welcome to your second home");
		System.out.println("Welcome"+u.getUemail());
	}
	
	public void login(User u)
	{
		if(u.getUage()>=70)
			homePage(u);
		else
			throw new InvalidAgeException("Age must be atleast 70 or above"); 
			
	}
	public void verifyUser(User u) {
		String emailRegex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(u.getUemail());
		
		Boolean Validmail = u.getUemail().contains("@gmail.com");

        if (matcher.matches() && Validmail) {
            System.out.println("Email is valid");
        } else {
            throw new InvalidEmailException("Email is invalid");
        }
		
	}
	public void validatePassword(User u) {
		String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(u.getUpassword());

        if (matcher.matches()) {
            System.out.println("Password is valid");
        } else {
            throw new InvalidPasswordException("Password is invalid");
        }
		
	}
	
}
