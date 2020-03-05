package com.customer.points.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import com.customer.points.model.CustomerDetails;
import com.customer.points.model.TransactionDetail;
import com.customer.points.model.TransactionResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CustTransService {

	@Autowired
	ResourceLoader resourceLoader;
	
	public List<TransactionResponse> getTransDetails(CustomerDetails model) throws JsonParseException, JsonMappingException, IOException {
		
		//create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        Resource resource = resourceLoader.getResource("classpath:transDetails.json");
        
        //read json file and convert to customer object
        TransactionDetail[] trans = objectMapper.readValue(resource.getFile(), TransactionDetail[].class);
        
        List<TransactionResponse> lsRes = new ArrayList<>();
        for (TransactionDetail transactionDetail : trans) {
			if(transactionDetail.getCustomerId().equals(model.getCustomerId())) {
				TransactionResponse res = new TransactionResponse();
				res.setCustomerId(transactionDetail.getCustomerId());
				res.setCustomerName(transactionDetail.getCustomerName());
				res.setEmail(transactionDetail.getEmail());
				res.setTransactionAmount(transactionDetail.getTransactionAmount());
				res.setTransactionId(transactionDetail.getTransactionId());
				res.setTransactionDate(transactionDetail.getTransactionDate());
				res.setPoints(calculatePoints(transactionDetail.getTransactionAmount()));
				lsRes.add(res);
			}
		}
        //print transaction details
        System.out.println(trans);
        
        return lsRes;
		
	}
	
	private String calculatePoints(String amount) {
		int amt = Integer.parseInt(amount);
		int points = 0;
		if(amt > 0) {
			int tmpamt = amt - 100;
			points = (tmpamt * 2) + (50 * 1);
			
			
		}
		return Integer.toString(points);
	}
}
