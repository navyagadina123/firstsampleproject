package com.cg.model;

public class Customer {
	int customerId;
	String customerName;
	String customerContact;
	 Address address;
	 
	 
	public Customer() {
		super();
	}
	public Customer(int customerId, String customerName, String customerContact, Address address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.address = address;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", address=" + address + "]";
	}
	void displayInfo(){  
	    System.out.println(customerId+" "+" "+customerName+" "+customerContact+" "+address);  
 
	}  
	

}
