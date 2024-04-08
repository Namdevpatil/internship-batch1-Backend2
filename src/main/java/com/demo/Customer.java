package com.demo;

public class Customer
{
	
	private int customerId;
	private String customerName;
	private long customerContactNo;
	private Address address;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String customerName, long customerContactNo, Address address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContactNo = customerContactNo;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContactNo="
				+ customerContactNo + ", address=" + address + "]";
	}

	
	
}
