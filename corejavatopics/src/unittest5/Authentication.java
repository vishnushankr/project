package unittest5;
//Create authentication class which is having a method to validate username and password. 
//Pass this class object as parameter to testcase and check for validate


class Authentication {

	private String username, password;

	public Authentication(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public int getLength() {
		return password.length();
	}
	
	public boolean validate() {
		if(username.equalsIgnoreCase("vishnu") && password.equals("shankar"))
			return true;
		else
			return false;
	}

}
	
	
	
