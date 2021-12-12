package login;

public class User implements Comparable {

	private String email;
	private String password;
	
	public User() {
		
	}
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	// email  , pass 
	public String toString()
	{
		return email+","+password;
	}
	
	public int compareTo(Object o) {
		User u = (User)o;
		if(getEmail().compareTo(u.getEmail()) == 0)
		{
			return 0;
			
		}
		else if(getEmail().compareTo(u.getEmail()) == -1) {
			return 1;
		}else {
			return -1;
		}		
		
	}
	
	

}
