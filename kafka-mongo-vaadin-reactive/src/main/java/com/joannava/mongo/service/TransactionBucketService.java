package com.joannava.mongo.service;

import com.joannava.mongo.domain.TransactionBucket;

import reactor.core.publisher.Flux;

public interface TransactionBucketService {
    Flux<TransactionBucket> findAll();
}
