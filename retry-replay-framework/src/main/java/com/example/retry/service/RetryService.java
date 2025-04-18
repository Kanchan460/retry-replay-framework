package com.example.retry.service; // ✅ CORRECT

// REMOVE this blank line with tabs

import org.springframework.stereotype.Service;
import com.example.retry.model.RetryRequest;

@Service
public class RetryService {

    public String processRetry(RetryRequest request) {
        // Add retry strategy logic here
        System.out.println("Processing Retry for transaction: " + request.getTransactionId());
        return "Retry Triggered Successfully!";
    }
}

