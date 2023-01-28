package com.joannava.mongo.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.joannava.mongo.domain.TransactionBucket;

public interface TransactionBucketRepository extends ReactiveMongoRepository<TransactionBucket, Integer> {
    
}
