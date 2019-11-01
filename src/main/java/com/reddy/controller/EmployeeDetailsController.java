package com.reddy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeDetailsController {
	@RequestMapping(value="/")
	public String getEmployeeInfo(){
		return "Hi Reddy...!";
	}

}
