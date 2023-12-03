package Demo.Com;

public class User {
	private String uemail;
	private String upassword;
	private int uage;
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}
	public String getUemail() {
		return uemail;
	}
	public String getUpassword() {
		return upassword;
	}
	public int getUage() {
		return uage;
	}
	@Override
	public String toString() {
		return "User [uemail=" + uemail + ", upassword=" + upassword + ", uage=" + uage + "]";
	}
	public User(String uemail, String upassword, int uage) {
		super();
		this.uemail = uemail;
		this.upassword = upassword;
		this.uage = uage;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
