package com.tnsif.packagesone;

public class Base {

	int varDefault=10;
	public int varPublic=20;
	protected int varProtected=30;
	private int varPrivate=40;
	
	 void methodDefault() {
		System.out.println("Default Mthod");
		System.out.println("Default Variable: "+ varDefault);
	}
	public void methodPublic() {
		System.out.println("Public Mthod");
		System.out.println("Public Variable: "+ varPublic);
	}
	protected void methodProtected() {
		System.out.println("Protected Mthod");
		System.out.println("Protected Variable: "+ varProtected);
	}
	private void methodPrivate() {
		System.out.println("Private Mthod");
		System.out.println("Private Variable: "+ varPrivate);
	}

}
