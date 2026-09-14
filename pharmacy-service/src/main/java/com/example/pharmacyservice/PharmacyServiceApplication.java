package com.example.pharmacyservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PharmacyServiceApplication {

    private static final Logger log = LoggerFactory.getLogger(PharmacyServiceApplication.class);

    @Value("${app.branch-name}")
    private String branchName;

    @Value("${app.hotline}")
    private String hotline;

    @Value("${spring.datasource.url}")
    private String dbUrl;

    public static void main(String[] args) {
        SpringApplication.run(PharmacyServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return args -> {
            log.info("==========================================");
            log.info("Khởi động Pharmacy Service thành công!");
            log.info("Chi nhánh: {}", branchName);
            log.info("Hotline: {}", hotline);
            log.info("Database URL: {}", dbUrl);
            log.info("==========================================");
        };
    }
}