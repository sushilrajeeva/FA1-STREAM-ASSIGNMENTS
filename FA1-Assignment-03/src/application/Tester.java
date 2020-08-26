package application;

public class Tester {
	public static void main(String[] args) {
		// Uncomment the following code after implementing the other classes
		
		User jack = new User(101, "Jack", "jack@infy.com", 1000d);
		KYCUser jill = new KYCUser(201, "Jill", "jill@infy.com", 3000d);
		
		EPayWallet.processPaymentByUser(jack, 700);
		EPayWallet.processPaymentByUser(jill, 1500);
		EPayWallet.processPaymentByUser(jill, 800);
		EPayWallet.processPaymentByUser(jill, 1200);
	}
}
