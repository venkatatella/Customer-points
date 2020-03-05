package com.customer.points.model;

import lombok.ToString;

@ToString
public class TransactionResponse {

private String transactionId;
private String transactionAmount;
private String transactionDate;
private String customerId;
private String customerName;
private String email;
private String points;
public String getTransactionId() {
	return transactionId;
}
public void setTransactionId(String transactionId) {
	this.transactionId = transactionId;
}
public String getTransactionAmount() {
	return transactionAmount;
}
public void setTransactionAmount(String transactionAmount) {
	this.transactionAmount = transactionAmount;
}
public String getTransactionDate() {
	return transactionDate;
}
public void setTransactionDate(String transactionDate) {
	this.transactionDate = transactionDate;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPoints() {
	return points;
}
public void setPoints(String points) {
	this.points = points;
}


}