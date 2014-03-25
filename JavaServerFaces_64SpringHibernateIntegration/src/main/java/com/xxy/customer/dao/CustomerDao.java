package com.xxy.customer.dao;
 
import java.util.List;
 
import com.xxy.customer.model.Customer;
 
public interface CustomerDao{
 
	void addCustomer(Customer customer);
 
	List<Customer> findAllCustomer();
 
}