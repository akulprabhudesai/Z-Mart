package com.ecommerce.onlineshopping.service;

import java.util.List;

import com.ecommerce.onlineshopping.model.CartLine;

public interface CartLineService {
	
	public CartLine findCartLineById(int id);
	public boolean saveCartLine(CartLine cartLine);
	public boolean updateCartLine(CartLine cartLine);
	public boolean deleteCartLine(CartLine cartLine);
	public List<CartLine> findAllCartLine(int cartId);
	
	public List<CartLine> findCartLines();
	
	CartLine findCartLineByCartIdAndProductId(int cartId,int id);
	
}