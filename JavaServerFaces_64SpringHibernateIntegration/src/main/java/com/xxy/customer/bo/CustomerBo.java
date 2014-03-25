package com.xxy.customer.bo;
 
import java.util.List;
 
import com.xxy.customer.model.Customer;
 
public interface CustomerBo{
 
	void addCustomer(Customer customer);
 
	List<Customer> findAllCustomer();
 
}