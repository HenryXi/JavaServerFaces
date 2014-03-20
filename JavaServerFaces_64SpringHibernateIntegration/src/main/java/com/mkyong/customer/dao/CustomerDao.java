package com.mkyong.customer.dao;
 
import java.util.List;
 
import com.mkyong.customer.model.Customer;
 
public interface CustomerDao{
 
	void addCustomer(Customer customer);
 
	List<Customer> findAllCustomer();
 
}