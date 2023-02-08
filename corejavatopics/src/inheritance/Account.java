package inheritance;

import java.util.Scanner;

public class Account {
	private String customername;
	private long accountnumber;
	private String accounttype;

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account obj = new Account();
		System.out.println("choose 1: savings account " + " 2: current account");
		obj.setAccounttype(sc.next());
		/* var type=Account.accounttype(1,2); */
	}
	/*
	 * public static int accounttype(int x,int y) { x=1; y=2; if(x==1) { return x; }
	 * else { return y; }
	 */
}
