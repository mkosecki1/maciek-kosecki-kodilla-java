package com.kodilla.spring.library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfig {
    @Bean
    public LibraryN libraryN(){
        return new LibraryN(libraryDbController());
    }
    @Bean
    public LibraryDbController libraryDbController(){
        return new LibraryDbController();
    }
}
