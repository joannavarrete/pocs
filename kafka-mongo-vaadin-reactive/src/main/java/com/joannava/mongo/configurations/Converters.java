package com.joannava.mongo.configurations;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.convert.WritingConverter;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import org.springframework.lang.NonNull;

@Configuration
public class Converters {

    @Bean
    public MongoCustomConversions mongoCustomConversions() {

        List<Converter> converters = new ArrayList<>();
        converters.add(new StringDecimalConverter());
        converters.add(new BigDecimalStringConverter());
        return new MongoCustomConversions(converters);
    }

    @WritingConverter
    public static class BigDecimalStringConverter implements Converter<BigDecimal, String> {

        @Override
        public String convert(@NonNull BigDecimal source) {
            return source.toString();
        }
    }

    @ReadingConverter
    public static class StringDecimalConverter implements Converter<String, BigDecimal> {

        @Override
        public BigDecimal convert(@NonNull String source) {
            return new BigDecimal(source);
        }
    }
}
