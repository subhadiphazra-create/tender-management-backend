package com.ikon_tender_management.dto;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

public class SupplierDto {

    @Data
    public static class Request {
        @NotBlank(message = "Company Name is required")
        private String companyName;

        @NotBlank(message = "Registered Address is required")
        private String registeredAddress;

        private String postalAddress;
        private String phoneNumber;

        @Email(message = "Invalid Email")
        private String email;

        private String websiteURL;
        private String registrationNumber;
        private String vatNumber;

        private String contactName;
        private String contactPosition;
        private String contactPhoneNumber;
        private String contactEmail;
        private String industry;
        private String supplierType; // Enum name as string
        private String yearsOfExperience;
        private String keyProducts;
        private String insuranceCoverage;
        private String prevTenders;
        private String relevantProjects;
        private String annualTurnover;
        private String creditRating;
        private String bankAccount;
        private String taxCompliant; // Enum name as string
        private String legalStructure; // Enum name as string
        private List<String> regulations;
        private String conflicts;
         private MultipartFile certifications; // ✅ change to MultipartFile
        private MultipartFile references;
        private String nda;
        private String criminal;
        private String qualityManagement;
        private String serviceGurantee;
       private MultipartFile sla;

        private String bidAmount;
        private String proposedDelivery;
        private String proposedPaymentTerms;
        private String additionalInfo;

        private MultipartFile profileFile;
        private MultipartFile financialStatementFile;
        private String supplierDeclaration;
        private String authorizedSignatoryName;
        private MultipartFile signature;
        private String date;
    }

    @Data
    public static class Response {
        private Long id;
        private String companyName;
        private String registeredAddress;
        private String postalAddress;
        private String phoneNumber;
        private String email;
        private String websiteURL;
        private String registrationNumber;
        private String vatNumber;
        private String contactName;
        private String contactPosition;
        private String contactPhoneNumber;
        private String contactEmail;
        private String industry;
        private String supplierType;
        private String yearsOfExperience;
        private String keyProducts;
        private String certifications;
        private String insuranceCoverage;
        private String prevTenders;
        private String relevantProjects;
        private String references;
        private String annualTurnover;
        private String creditRating;
        private String bankAccount;
        private String taxCompliant;
        private String legalStructure;
        private List<String> regulations;
        private String conflicts;
        private String nda;
        private String criminal;
        private String qualityManagement;
        private String serviceGurantee;
        private String sla;
        private String bidAmount;
        private String proposedDelivery;
        private String proposedPaymentTerms;
        private String additionalInfo;
        private String profileFilePath;
        private String financialStatementFilePath;
        private String supplierDeclaration;
        private String authorizedSignatoryName;
        private String signatureFilePath;
        private String date;
    }
}
