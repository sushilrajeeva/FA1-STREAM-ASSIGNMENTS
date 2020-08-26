package application;

public class User {
	
	private int id;
	private String username;
	private String email;
	private double walletBalance;
	
	public User(int id, String username, String email, double walletBalance) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.walletBalance = walletBalance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	
	public boolean makePayment(double billAmount) {
		if(billAmount > this.walletBalance) {
			return false;
		}
		else {
			this.setWalletBalance(this.walletBalance - billAmount);
			return true;
		}
	}
	
}
