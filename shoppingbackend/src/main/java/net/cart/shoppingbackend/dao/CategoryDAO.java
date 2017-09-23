package net.cart.shoppingbackend.dao;

import java.util.List;

import net.cart.shoppingbackend.dto.Category;

public interface CategoryDAO {

	
	
	List<Category> list();
	Category get(int id);
	
}
