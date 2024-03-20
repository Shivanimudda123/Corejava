package com.tns.userdefined;

public class Customer {
	private String CustomerName;
	private int CustomerId;
	private String City;
	
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Customer [CustomerName=" + CustomerName + ", CustomerId=" + CustomerId + ", City=" + City
				+ ", getCustomerName()=" + getCustomerName() + ", getCustomerId()=" + getCustomerId() + ", getCity()="
				+ getCity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
		
		

	}


