package com.ecommerce.ecom.app.service;

import java.util.List;

import com.ecommerce.ecom.app.domain.Order;
import com.ecommerce.ecom.app.domain.Payment;
import com.ecommerce.ecom.app.domain.Shipping;
import com.ecommerce.ecom.app.domain.ShoppingCart;
import com.ecommerce.ecom.app.domain.User;

public interface OrderService {

	Order createOrder(ShoppingCart shoppingCart, Shipping shippingAddress, Payment payment, User user);
	
	List<Order> findByUser(User user);
	
	Order findOrderWithDetails(Long id);
}
