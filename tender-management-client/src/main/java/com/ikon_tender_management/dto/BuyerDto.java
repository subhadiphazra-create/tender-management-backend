package com.ikon_tender_management.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

public class BuyerDto {

    @Data
    public static class Request {
        @NotBlank(message = "Company Name is required")
        private String companyName;

        private String businessType;
        private String industry;
        private Integer yearEstablished;
        private Integer numberOfEmployees;
        private String annualRevenue;
        private String website;

        @NotBlank(message = "Primary Contact Name is required")
        private String primaryContactName;

        private String jobTitle;

        @Email(message = "Invalid Email Address")
        private String email;

        @NotBlank(message = "Phone Number is required")
        private String phoneNumber;

        private String altContactPerson;
        private String street;
        private String city;
        private String state;
        private String zipcode;
        private String country;

        private String productsPurchased;
        private String averageOrderValue;
        private String procurementFrequency;
        private String paymentTerms;
        private String preferredCurrencies;
        private String requiredCertifications;

        private String businessRegCertPath;
        private String taxId;
        private String bankingInfo;
    }

    @Data
    public static class Response {
        private Long id;
        private String companyName;
        private String businessType;
        private String industry;
        private Integer yearEstablished;
        private Integer numberOfEmployees;
        private String annualRevenue;
        private String website;
        private String primaryContactName;
        private String jobTitle;
        private String email;
        private String phoneNumber;
        private String altContactPerson;
        private String street;
        private String city;
        private String state;
        private String zipcode;
        private String country;
        private String productsPurchased;
        private String averageOrderValue;
        private String procurementFrequency;
        private String paymentTerms;
        private String preferredCurrencies;
        private String requiredCertifications;
        private String businessRegCertPath;
        private String taxId;
        private String bankingInfo;
    }
}
