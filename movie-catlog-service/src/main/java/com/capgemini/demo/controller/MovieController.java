package com.capgemini.demo.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.demo.models.CatalogItem;

@RestController
@RequestMapping("/catlog")
public class MovieController {
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatlog(String userid){
		
		return Collections.singletonList(new CatalogItem("Test", "Test Desc", 4));
	}
	
}
