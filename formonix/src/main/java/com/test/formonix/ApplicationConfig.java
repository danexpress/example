package com.test.formonix;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    @Qualifier("bean1")
    public MyFirstClass myFirstClass() {
        return new MyFirstClass("first bean");

    }

    @Bean
    // @Qualifier("bean2")
    public MyFirstClass mySecondClass() {
        return new MyFirstClass("Second bean");

    }
}
