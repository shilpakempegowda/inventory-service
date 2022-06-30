package com.example.hcaas.inventoryservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.hcaas.inventoryservice.model.Inventory;
import com.example.hcaas.inventoryservice.service.InventoryService;

@RestController
public class InventoryController {

	@Autowired InventoryService inventoryService;
	
	@GetMapping(value = "/inventories/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity <List<Inventory>> getinventories(@PathVariable String name) {
		List<Inventory> inventories =  inventoryService.getInventories(name);
		return new ResponseEntity < >(inventories, HttpStatus.OK);
	}
}
