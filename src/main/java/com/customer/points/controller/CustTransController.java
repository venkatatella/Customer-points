package com.customer.points.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.points.model.CustomerDetails;
import com.customer.points.model.TransactionResponse;
import com.customer.points.service.CustTransService;

@RestController
public class CustTransController {

	@Autowired
	private CustTransService service;
	
	  @RequestMapping(method = RequestMethod.POST, value="/getTransDetails")
	  @ResponseBody
	  public List<TransactionResponse> getTransDetails(@RequestBody CustomerDetails model) {
		  try {
			return service.getTransDetails(model);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	 return null;
	 }
}
