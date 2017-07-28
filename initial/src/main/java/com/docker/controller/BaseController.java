package com.docker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *@author Bland W
 */

@Controller
public class BaseController {

	@RequestMapping(value="/api/test",method=RequestMethod.GET)
	@ResponseBody
	public String test(String name){
		return name;
	}
	
}
