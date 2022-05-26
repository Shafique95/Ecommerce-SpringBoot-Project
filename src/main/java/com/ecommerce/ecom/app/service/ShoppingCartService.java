package com.ecommerce.ecom.app.service;

import com.ecommerce.ecom.app.domain.Article;
import com.ecommerce.ecom.app.domain.CartItem;
import com.ecommerce.ecom.app.domain.ShoppingCart;
import com.ecommerce.ecom.app.domain.User;


public interface ShoppingCartService {

	ShoppingCart getShoppingCart(User user);
	
	int getItemsNumber(User user);
	
	CartItem findCartItemById(Long cartItemId);
	
	CartItem addArticleToShoppingCart(Article article, User user, int qty, String size);
		
	void clearShoppingCart(User user);
	
	void updateCartItem(CartItem cartItem, Integer qty);

	void removeCartItem(CartItem cartItem);
	
}
