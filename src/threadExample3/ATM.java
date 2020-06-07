package threadExample3;

public class ATM {

	static synchronized void withdrawl(BankAccount account, int amount) {
		int balance = account.getBalance();
		if ((balance-amount) < - account.getOverdraft()) {
			System.out.println("Transaction denied");
		}
		else {
			account.debit(amount);
			System.out.println("$"+ amount + "succesfully withdrawn");
		}
		System.out.println("Current balance: " + account.getBalance());
	}
}
