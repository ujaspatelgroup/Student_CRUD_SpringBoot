package com.ecommerce.microservices.student_crud_springboot.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
