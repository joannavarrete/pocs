package com.joannava.mongo.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class TransactionBucketRunner implements CommandLineRunner{

    private final TransactionBucketService service ;
    @Override
    public void run(String... args) throws Exception {
        service.findAll()
        .take(50)
        .subscribe(System.out::println);
    }
    
}
