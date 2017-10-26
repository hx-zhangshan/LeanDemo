package com.zs.springmvc.web;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {

	private static Logger logger=org.slf4j.LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping("/index")
	public String hello(){
		logger.info("llllllllllllllllllllllllllllllllllllllllllllllllll");
		return "index2";
	}
	@RequestMapping("/index2")
	public String hello2(){
		logger.info("llllllllllllllllllllllllllllllllllllllllllllllllll");
		return "index";
	}
}
