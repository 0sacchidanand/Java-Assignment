package Demo.Com;

import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("program Started...");
    	Scanner sc = new Scanner(System.in);
    	User u = new User();
    	Site s= new Site();
    	
    	System.out.println("Enter your Email");
    	String email=sc.next();
    	u.setUemail(email);
    	try {
    	       s.verifyUser(u);
    	       }catch(InvalidEmailException  e)
    	       {
    	    	   System.out.println(e);
    	       }
    	
    	System.out.println("Enter your Password");
    	String password=sc.next();
    	u.setUpassword(password);
    	try {
     	   s.validatePassword(u);
        }
        catch(InvalidPasswordException e)
        {
     	   e.printStackTrace();
        }
    	
    	System.out.println("Enter your Age");
    	int age=sc.nextInt();
    	u.setUage(age);
       try {
           s.login( u);
           }catch(InvalidAgeException e)
           {
        	   System.out.println(e);
           }
    
       System.out.println("Program ended..");
       sc.close();
    }
}
