package com.docker.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *@author Bland W
 */

@RestController
public class Rest {

	@RequestMapping(value="api/print")
	@ResponseBody
	public String print(String id){
		return id;
	}
	
	// add method
	
}
