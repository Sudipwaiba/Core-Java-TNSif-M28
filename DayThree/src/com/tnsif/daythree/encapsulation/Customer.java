package com.tnsif.daythree.encapsulation;

public class Customer {
	
	
	public Customer(String customerName, int customerIdr, String customerCity) {
		super();
		this.customerName = customerName;
		this.customerIdr = customerIdr;
		this.customerCity = customerCity;
	}
	private String customerName;
	private int customerIdr;
	private String customerCity;
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerIdr() {
		return customerIdr;
	}
	public void setCustomerIdr(int customerIdr) {
		this.customerIdr = customerIdr;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerIdr=" + customerIdr + ", customerCity="
				+ customerCity + "]";
	}
	
	

	

}
