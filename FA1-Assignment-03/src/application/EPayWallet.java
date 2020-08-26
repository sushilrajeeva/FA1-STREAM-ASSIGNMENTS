package application;

public class EPayWallet {
	
	public static void processPaymentByUser(User user, double billAmount) {
		if(user.makePayment(billAmount)) {
			System.out.println("Congratulations " + user.getUsername() + ", payment of " + billAmount + " was successful");
			System.out.println("Your wallet balance is " + user.getWalletBalance());
		}
		else {
			System.out.println("Sorry " + user.getUsername() + ", not enough balance to make payment");
			System.out.println("Your wallet balance is " + user.getWalletBalance());
		}
		
		if(user instanceof KYCUser) {
			System.out.println("You have "  + ((KYCUser)user).getRewardPoints() + " reward points");
		}
	}
	
}
