package com.joannava.mongo.domain;

import java.math.BigInteger;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction {

    private Date date;
    private int amount;

    @Field("transaction_code")
    private String transaction_code;
    private String symbol;
    private String price;
    private String total;
}
