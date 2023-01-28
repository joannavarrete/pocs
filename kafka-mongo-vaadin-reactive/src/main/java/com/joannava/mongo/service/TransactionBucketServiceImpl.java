package com.joannava.mongo.service;

import org.springframework.stereotype.Service;

import com.joannava.mongo.domain.TransactionBucket;
import com.joannava.mongo.repositories.TransactionBucketRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class TransactionBucketServiceImpl implements TransactionBucketService{
 
    private final TransactionBucketRepository repository;
    @Override
    public Flux<TransactionBucket> findAll() {
       return repository.findAll(); 
    }
    
}
