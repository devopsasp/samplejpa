package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.model.*;
import com.dao.ItemDAO;

@RestController
public class ItemController {
	
	@Autowired 
	ItemDAO itemDAO;
	
	
	@GetMapping("/getitems")
	public ResponseEntity<?> getItems() 
	{ 
		 List<Item> itemlist=itemDAO.findAll();
		return new ResponseEntity<List<Item>>(itemlist,HttpStatus.OK);
	}
	

}
