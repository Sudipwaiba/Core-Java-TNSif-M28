package comtnsif.interfacedemo;

public interface Bank {
	
	static final float MINBAL=5000;
	static final float DEPOSITE_LIMIT=25000;
	
	public void deposite(float amount);
	public void withdraw(float amount);

}
