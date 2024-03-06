package com.shopping.happygo;

public class CartUpdateParam {
	private String userName;
	private String method;
	private String productId;
//	private String productName;
	private int quantity;
	
	public CartUpdateParam() {}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getMethod() {
		return method;
	}
	
	public void setMethod(String method) {
		this.method = method;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
//	public String getProductName() {
//		return productName;
//	}
//	
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
