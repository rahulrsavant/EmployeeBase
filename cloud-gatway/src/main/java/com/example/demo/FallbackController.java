package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/orderFallBack")
    public Mono<String> orderServiceFallBack() {
        return Mono.just("Order Service is taking too long to respond or is down. Please try again later");
    }
    @RequestMapping("/paymentFallback")
    public Mono<String> paymentServiceFallBack() {
        return Mono.just("Payment Service is taking too long to respond or is down. Please try again later");
    }
    @RequestMapping("/employeeFallback")
    public Mono<String> employeeServiceFallBack() {
        return Mono.just("Employee Service is taking too long to respond or is down. Please try again later");
    }
    @RequestMapping("/frontendFallback")
    public Mono<String> frontEndServiceFallBack() {
        return Mono.just("Front-end Service is taking too long to respond or is down. Please try again later");
    }
    
    @RequestMapping("/springsecurityFallback")
    public Mono<String> springsecurityFallback() {
        return Mono.just("Spring-security Service is taking too long to respond or is down. Please try again later");
    }
}
