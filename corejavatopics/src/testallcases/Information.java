package testallcases;


class Information {

	private String uname, pword;

	public Information(String uname, String pword) {
		super();
		this.uname = uname;
		this.pword = pword;
	}
	public int getLength() {
		return pword.length();
	}
	
	public boolean validate() {
		if(uname.equalsIgnoreCase("Java") && pword.equals("java123"))
			return true;
		else
			return false;
	}


}
