package com.quintrix.dev.psn.controller;
import java.lang.Exception;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/PSN")
public class PSNController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String BASE_URL
            = "http://localhost:8081/";
    private static final String PSN_ = "psN";

    int count=1;

    @GetMapping
    @CircuitBreaker(name = PSN_, fallbackMethod = "psnFallback")

    public String getPSN() {
        String url = BASE_URL + "PS5";
        return restTemplate.getForObject(url, String.class);
    }

    public String psnFallback(Exception e)
    { return    "This is a fallback method for PSN.";}



}
