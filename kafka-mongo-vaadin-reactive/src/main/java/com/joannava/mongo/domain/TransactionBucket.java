package com.joannava.mongo.domain;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("transactions")
public class TransactionBucket {
    
    @Field("account_id")
    private  Integer accountId;
    private  List<Transaction> transactions;  

}
