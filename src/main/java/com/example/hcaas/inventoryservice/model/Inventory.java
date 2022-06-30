package com.example.hcaas.inventoryservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Inventory {
	
	private String name;
	private Long id;
	private String type;
	private boolean isStockAvaialble;
	
}
