package com.khadri.spring.mvc.form;

public class Order {
	
	private String orderName;
	private String orderType;
	private String orderLocation;
	private String orderCost;
	private String orderGST;
	private String orderTotalCost;

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderLocation() {
		return orderLocation;
	}

	public void setOrderLocation(String orderLocation) {
		this.orderLocation = orderLocation;
	}

	public String getOrderCost() {
		return orderCost;
	}

	public void setOrderCost(String orderCost) {
		this.orderCost = orderCost;
	}

	public String getOrderGST() {
		return orderGST;
	}

	public void setOrderGST(String orderGST) {
		this.orderGST = orderGST;
	}

	public String getOrderTotalCost() {
		return orderTotalCost;
	}

	public void setOrderTotalCost(String orderTotalCost) {
		this.orderTotalCost = orderTotalCost;
	}

}
