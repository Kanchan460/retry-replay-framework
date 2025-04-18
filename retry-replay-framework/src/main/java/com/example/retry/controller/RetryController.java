
package com.example.retry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.retry.model.RetryRequest;
import com.example.retry.service.RetryService;

@RestController
@RequestMapping("/api/retry")
public class RetryController {

    @Autowired
    private RetryService retryService;

    @PostMapping
    public String retry(@RequestBody RetryRequest request) {
        return retryService.processRetry(request);
    }
}


