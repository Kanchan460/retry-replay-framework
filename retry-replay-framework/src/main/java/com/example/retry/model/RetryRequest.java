package com.example.retry.model;

public class RetryRequest {

	
	
	
	    private String transactionId;
	    private String payload;
	    private String retryStrategy;

	    // Constructors
	    public RetryRequest() {}

	    public RetryRequest(String transactionId, String payload, String retryStrategy) {
	        this.transactionId = transactionId;
	        this.payload = payload;
	        this.retryStrategy = retryStrategy;
	    }

	    // Getters and Setters
	    public String getTransactionId() {
	        return transactionId;
	    }

	    public void setTransactionId(String transactionId) {
	        this.transactionId = transactionId;
	    }

	    public String getPayload() {
	        return payload;
	    }

	    public void setPayload(String payload) {
	        this.payload = payload;
	    }

	    public String getRetryStrategy() {
	        return retryStrategy;
	    }

	    public void setRetryStrategy(String retryStrategy) {
	        this.retryStrategy = retryStrategy;
	    }
	}


