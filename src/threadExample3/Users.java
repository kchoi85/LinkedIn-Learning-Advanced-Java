package threadExample3;

public class Users {
	//Threads are executed without order
	//so we add synchronized

	static final BankAccount account = new BankAccount(50);
	
	public static void main(String[] args) {
		account.topUp(100);
		
		Thread t1 = new Thread(() -> {
			ATM.withdrawl(account, 100);
		});
		
		Thread t2 = new Thread(() ->  {
			ATM.withdrawl(account,  0);
		});
		
		t1.start();
		t2.start();
	}
}
