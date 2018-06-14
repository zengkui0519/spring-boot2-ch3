package com.zk.sample.controller.form;

import java.util.List;

import com.zk.sample.entity.Order;
import com.zk.sample.entity.OrderDetail;

public class OrderPostForm {
	public Order order;
	public List<OrderDetail> details;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public List<OrderDetail> getDetails() {
		return details;
	}

	public void setDetails(List<OrderDetail> details) {
		this.details = details;
	}
	
	
	
}
