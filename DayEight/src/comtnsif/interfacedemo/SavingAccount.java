package comtnsif.interfacedemo;

public class SavingAccount extends Customer implements Bank{

	//data member
	private int accNo;
	private float balance;
	

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	
	public SavingAccount(String name, String city, int age,int accNo, float balance) {
		super(name, city, age);
		this.accNo = accNo;
		this.balance = balance;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposite(float amount) {
 
		
		if(amount>DEPOSITE_LIMIT) {
			System.out.println("Rs "+amount+" exceeds the limit");
		}
		else {
			balance +=amount;
			System.out.println("Rs "+amount+" is deposited");
			
		}
	}

	@Override
	public String toString() {
		return "SavingAccount [accNo=" + accNo + ", balance=" + balance + ", getName()=" + getName() + ", getCity()="
				+ getCity() + ", getAge()=" + getAge() + "]";
	}

	@Override
	public void withdraw(float amount) {


		if(amount<=balance-MINBAL) {
			balance -=amount;
			System.out.println("minimum balance");

		}
		else {
			System.out.println("minimum balance");

		}
	}
	
	

}
