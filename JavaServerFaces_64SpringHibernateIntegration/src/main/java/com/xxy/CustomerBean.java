package com.xxy;

import java.io.Serializable;
import java.util.List;

import com.xxy.customer.bo.CustomerBo;
import com.xxy.customer.model.Customer;

public class CustomerBean implements Serializable{
 
	//DI via Spring
	CustomerBo customerBo;
	
	public String name;
	public String address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCustomerBo(CustomerBo customerBo) {
		this.customerBo = customerBo;
	}
 
	//get all customer data from database
	public List<Customer> getCustomerList(){
		return customerBo.findAllCustomer();
	}
	
	//add a new customer data into database
	public String addCustomer(){
		
		Customer cust = new Customer();
		cust.setName(getName());
		cust.setAddress(getAddress());
		
		customerBo.addCustomer(cust);
		
		clearForm();
		
		return "";
	}
	
	//clear form values
	private void clearForm(){
		setName("");
		setAddress("");
	}
	
}
