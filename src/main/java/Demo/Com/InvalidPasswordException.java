package Demo.Com;

public class InvalidPasswordException extends RuntimeException{
	private String msg= "Invalid Email ";
	public InvalidPasswordException(String msg) {
        this.msg=msg;
    }
	InvalidPasswordException(){
		
	}
	public String toString()
	{
		return "InvalidPasswordException " + msg;
	}
}
