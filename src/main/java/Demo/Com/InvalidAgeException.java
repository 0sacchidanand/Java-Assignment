package Demo.Com;

public class InvalidAgeException extends RuntimeException{
	private String msg= "Invalid Age ";
	public InvalidAgeException(String msg) {
        this.msg=msg;
    }
	InvalidAgeException(){
		
	}
	public String toString()
	{
		return "InvalidAgeException " + msg;
	}

}
