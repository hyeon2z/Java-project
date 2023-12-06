package backendweb.z01_vo;

import java.util.Date;

public class Order {
	private String orderId;
	private Date orderDate;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(String orderId, Date orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
}
