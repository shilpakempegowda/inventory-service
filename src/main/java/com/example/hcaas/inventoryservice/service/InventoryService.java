package com.example.hcaas.inventoryservice.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.hcaas.inventoryservice.model.Inventory;

@Service
public class InventoryService {
	
	@Value("${stock.available}")
    private boolean isStockAvaialble;


	public List<Inventory> getInventories(String name) {

		if (name.equalsIgnoreCase("clothes")) {
			return Arrays.asList(getInventory(1, "t-shirt", "tops",isStockAvaialble), getInventory(2, "jeans", "pant",isStockAvaialble));
		} else {
			return Arrays.asList(getInventory(1, "puma", "casual",isStockAvaialble), getInventory(2, "addidas", "sports",isStockAvaialble));
		}
	}

	private Inventory getInventory(long id, String name, String type,boolean isStockAvaialble ) {
		return new Inventory(name,id,type,isStockAvaialble);
	}
}
