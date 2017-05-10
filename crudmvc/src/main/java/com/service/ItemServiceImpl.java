package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.ItemDAO;
import com.model.Item;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
    private ItemDAO itemDAO;
	
	
	public boolean addItem(Item item) {
		itemDAO.addItem(item);
		return false;

	}
	public Item getItem(int id) {
		return itemDAO.getItem(id);
	}
	
	public void deleteItem(int id) {
		itemDAO.deleteItem(id);

	}
	
	public List<Item> getAllItems() {
		return 	itemDAO.getAllItems();
	}

}
