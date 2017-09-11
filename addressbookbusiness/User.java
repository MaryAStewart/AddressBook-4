package addressbookbusiness;

import java.io.Serializable;

public class User implements Serializable {
	private String name;	
	private String email;
	private String phoneNumber;
	
	public User(){  	  
    }
	
	public User(String name, String email, String phoneNumber){
		setName(name);		
		setEmail(email);
		setPhoneNumber(phoneNumber);		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
