package entities;

public class Account {

	//variables declaration
	private int accNumber;
	private String holder;
	private double balance;

	//constructor
	public Account() {
	}

	public Account (int accNumber, String holder, double initDeposit) {
		this.accNumber = accNumber;
		this.holder = holder;
		deposit(initDeposit);
	}

	public Account (int accNumber, String holder) {
		this.accNumber = accNumber;
		this.holder = holder;
	}

	//getter and setter
	public int getAccNumber() {
		return accNumber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}


	//methods
	public void deposit (double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return 
			"Account " +
			accNumber +
			", Holder: " +
			holder +
			", Balance: $ " +
			String.format("%.2f", balance);			
	}
}
