package com.xxy;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Comparator;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.ArrayDataModel;
import javax.faces.model.DataModel;
 
@ManagedBean(name="order")
@SessionScoped
public class OrderBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private SortableDataModel<Order> sotableDataModel;

	private boolean sortAscending = true; 
	
	private static final Order[] orderList = {
		new Order("A0002", "Harddisk 100TB", 
				new BigDecimal("500.00"), 3),
		new Order("A0001", "Intel CPU", 
				new BigDecimal("4200.00"), 6),
		new Order("A0004", "Samsung LCD", 
				new BigDecimal("5200.00"), 10),
		new Order("A0003", "Dell Laptop", 
				new BigDecimal("11600.00"), 9),
		new Order("A0005", "A4Tech Mouse", 
				new BigDecimal("200.00"), 20)
	};
	
	public OrderBean(){

		sotableDataModel = new SortableDataModel<Order>(new ArrayDataModel<Order>(orderList));

	}
	
	public DataModel<Order> getOrderList() {
		 
		return sotableDataModel;
 
	}

	//sort by order no
	public String sortByOrderNo() {
	    
		if(sortAscending){
			
			sotableDataModel.sortBy(new Comparator<Order>() {
				
				@Override
				public int compare(Order o1, Order o2) {
					
					return o1.getOrderNo().compareTo(o2.getOrderNo());
					
				}
			});
			
			sortAscending = false;
			
		}else{

			//descending order
			sotableDataModel.sortBy(new Comparator<Order>() {
				
				@Override
				public int compare(Order o1, Order o2) {
					
					return o2.getOrderNo().compareTo(o1.getOrderNo());
					
				}
			});
			sortAscending = true;
		}

		return null;
	}

	
	public static class Order{
		
		String orderNo;
		String productName;
		BigDecimal price;
		int qty;

		public Order(String orderNo, String productName, 
				BigDecimal price, int qty) {
			this.orderNo = orderNo;
			this.productName = productName;
			this.price = price;
			this.qty = qty;
		}

		public String getOrderNo() {
			return orderNo;
		}

		public void setOrderNo(String orderNo) {
			this.orderNo = orderNo;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public BigDecimal getPrice() {
			return price;
		}

		public void setPrice(BigDecimal price) {
			this.price = price;
		}

		public int getQty() {
			return qty;
		}

		public void setQty(int qty) {
			this.qty = qty;
		}
		
		
	}
}