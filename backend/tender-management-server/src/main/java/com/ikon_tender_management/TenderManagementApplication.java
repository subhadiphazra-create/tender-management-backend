package com.ikon_tender_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ikon.autoconfigure.annotation.EnableIkonSdk;
import com.ikon.sdk.config.IkonSdkConfig;

@EntityScan(basePackages = {"com.ikon_tender_management.entity"})
@EnableJpaRepositories(basePackages = {"com.ikon_tender_management.repository"})
@SpringBootApplication
@EnableIkonSdk(configuration = IkonSdkConfig.class)
@EnableFeignClients(basePackages = {"com.ikon.client"})
public class TenderManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(TenderManagementApplication.class, args);
    }
}