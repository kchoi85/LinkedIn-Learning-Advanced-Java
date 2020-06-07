package threadExample3;

public class BankAccount {

	private int balance = 0;
	private final int overdraft;
	
	public BankAccount(int overdraft) {
		super();
		this.overdraft = overdraft;
	}
	
	void topUp(int amount) {
		balance += amount;
	}
	
	void debit(int amount) {
		balance -= amount;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getOverdraft() {
		return overdraft;
	}

	
	
	
	
	
	
}
