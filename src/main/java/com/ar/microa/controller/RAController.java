package com.ar.microa.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("arone")
public class RAController {

	Logger log=LoggerFactory.getLogger(RAController.class);
	
	@GetMapping("getInfo")
	public Object getInfo() {
		log.info("Get info invoked");
		Map<String,String> map=new HashMap<>();
		map.put("appinfo", "microa");
		map.put("version", "1.2");
		log.info("Get info completed");
		return map;
	}

} 
