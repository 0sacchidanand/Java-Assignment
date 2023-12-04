package Demo.Com;

@SuppressWarnings("serial")
public class InvalidEmailException extends RuntimeException {
	private String msg= "Invalid Email ";
	public InvalidEmailException(String msg) {
        this.msg=msg;
    }
	InvalidEmailException(){
		
	}
	public String toString()
	{
		return "InvalidEmailException " + msg;
	}
}
