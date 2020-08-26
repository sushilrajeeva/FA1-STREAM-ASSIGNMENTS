package application;

public class KYCUser extends User{
	
	private int rewardPoints;
	
	public KYCUser(int id, String username, String email, double walletBalance){
		super(id, username, email, walletBalance);	
	}

	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	
	public boolean makePayment(double billAmount) {
		if(super.makePayment(billAmount)) {
			this.rewardPoints += billAmount * 0.1;
			return true;
		}
		else {
			return false;
		}
	}
	
}
