package com.nsapi.niceschoolapi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class NiceschoolapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(NiceschoolapiApplication.class, args);
    }
}


