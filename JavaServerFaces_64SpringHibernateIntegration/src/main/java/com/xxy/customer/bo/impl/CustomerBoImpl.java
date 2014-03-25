package com.xxy.customer.bo.impl;
 
import java.util.List;
 
import com.xxy.customer.bo.CustomerBo;
import com.xxy.customer.dao.CustomerDao;
import com.xxy.customer.model.Customer;
 
public class CustomerBoImpl implements CustomerBo{
 
	CustomerDao customerDao;
 
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
 
	public void addCustomer(Customer customer){
 
		customerDao.addCustomer(customer);
 
	}
 
	public List<Customer> findAllCustomer(){
 
		return customerDao.findAllCustomer();
	}
}