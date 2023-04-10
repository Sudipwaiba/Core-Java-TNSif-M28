package comtnsif.interfacedemo;

public class BankDemo {

	public static void main(String[] args) {


		SavingAccount sudip=new SavingAccount("sudip","bangalore",22,123432221,24000);
		System.out.println(sudip);
		
		sudip.deposite(100000);
		System.out.println(sudip);
		
		sudip.deposite(200);
		System.out.println(sudip);
		
		sudip.withdraw(10000);
		System.out.println(sudip);

		
	}

}
