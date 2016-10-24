
public class HelloUser {

	private String userName;
	
	public HelloUser(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return userName;
	}

	public void setName(String userName) {
		this.userName = userName;
	}
	
	public void greetUser() {
		System.out.println("Hello " + this.userName + "!");
	}
}
