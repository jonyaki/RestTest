package com.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AplicationInitializate{
    public static Logger LOG = LoggerFactory.getLogger(AplicationInitializate.class);

    public static void main(String[] args){
        SpringApplication.run(AplicationInitializate.class, args);
    }


}
