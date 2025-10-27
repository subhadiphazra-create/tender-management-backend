package com.ikon_tender_management.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class TenderDto {

  @Data
  public static class Request {
    @NotBlank(message = "Tender Subject is required")
    private String title;

    @NotBlank(message = "Tender Reference Number is required")
    private String referenceNumber;

    @NotBlank(message = "Project Description is required")
    private String description;

    @NotBlank(message = "Tender Type is required")
    private String tenderType;

    @NotBlank(message = "Procurement Category is required")
    private String procurementCategory;

    @PositiveOrZero(message = "Estimated Budget must be positive")
    private Double budget;

    // @NotBlank(message = "Industry is required")
    // private String industry;

    @NotBlank(message = "Currency is required")
    private String currency;

    @NotBlank(message = "Publication Date is required")
    private String publicationDate;

    @NotBlank(message = "Submission Deadline is required")
    private String submissionDeadline;

    @Min(value = 1, message = "Tender Validity Period must be at least 1 day")
    private Integer validityPeriod;

    @NotBlank(message = "Expected Project Duration is required")
    private String projectDuration;

    @NotBlank(message = "Department is required")
    private String tender_department;

    @NotBlank(message = "Sector is required")
    private String sector;

    @NotBlank(message = "Product/Service is required")
    private String product_service;

    // Procuring Entity Info
    @NotBlank(message = "Organization Name is required")
    private String organizationName;
    private String department;
    @NotBlank(message = "Contact Person is required")
    private String contactPerson;
    @Email(message = "Invalid email format")
    private String contactEmail;
    @NotBlank(message = "Contact Phone is required")
    private String contactPhone;
    @NotBlank(message = "Address is required")
    private String address;

    // Eligibility Criteria
    @PositiveOrZero(message = "Minimum Annual Turnover must be positive")
    private Double minTurnover;

    @PositiveOrZero(message = "Years of Experience must be positive")
    private Integer experienceYears;

    private String similarProjects;
    private String requiredCertifications;
    private String legalRequirements;
    private String financialStanding;
    private String technicalCapability;

    // Technical Specifications
    @NotBlank(message = "Scope of Work is required")
    private String scopeOfWork;

    private String technicalRequirements;
    private String qualityStandards;
    private String deliveryTimeline;
    private String acceptanceCriteria;
    private String performanceMetrics;
    private String requiredDeliverables;

    // Evaluation Criteria
    @Min(0)
    @Max(100)
    private Double technicalWeight;

    @Min(0)
    @Max(100)
    private Double financialWeight;

    @Min(0)
    @Max(100)
    private Double qualificationThreshold;

    private String evaluationMethodology;
    private String scoringSystem;

    // Bid Security
    @PositiveOrZero
    private Double bidSecurityAmount;

    @NotBlank(message = "Bid Security Form is required")
    private String bidSecurityForm;

    @Min(1)
    private Integer bidSecurityValidity;

    // Submission Requirements
    @NotBlank(message = "Submission Method is required")
    private String submissionMethod;

    @Min(1)
    private Integer copiesRequired;
    private String formatRequirements;
    private String supportingDocuments;
    private String preQualificationDocs;

    // Schedule of Events
    private String preBidMeeting;
    private String siteVisit;
    private String queryDeadline;
    private String responseToQueries;
    private String techBidOpening;
    private String financeBidOpening;

    // Terms and Conditions
    private String paymentTerms;
    private String warrantyRequirements;
    private String insuranceRequirements;
    private String subContractingRules;
    private String contractAmendment;
    private String disputeResolution;
    private String forceMajeure;
    private String terminationConditions;

    // Attachments (multipart upload from client)
    // Spring will bind uploaded files to these fields when request is
    // multipart/form-data
    private MultipartFile biddingDocs;
    private MultipartFile techSpecsDocs;
    private MultipartFile draftContract;
    private MultipartFile billQuantities;
    private MultipartFile specialInstructions;

    // TenderDto.java (Request & Response)
    private String timeline;
    private String stepTracker; // store as JSON string

    private Long templateId;

  }

  @Data
  public static class Response {
    private Long id;
    private String title;
    private String referenceNumber;
    private String description;
    private String tenderType;
    private String procurementCategory;
    private Double budget;
    // private String industry;
    private String currency;
    private String publicationDate;
    private String submissionDeadline;
    private Integer validityPeriod;
    private String projectDuration;
    private String tender_department;
    private String sector;
    private String product_service;

    private String organizationName;
    private String department;
    private String contactPerson;
    private String contactEmail;
    private String contactPhone;
    private String address;

    private Double minTurnover;
    private Integer experienceYears;
    private String similarProjects;
    private String requiredCertifications;
    private String legalRequirements;
    private String financialStanding;
    private String technicalCapability;

    private String scopeOfWork;
    private String technicalRequirements;
    private String qualityStandards;
    private String deliveryTimeline;
    private String acceptanceCriteria;
    private String performanceMetrics;
    private String requiredDeliverables;

    private Double technicalWeight;
    private Double financialWeight;
    private Double qualificationThreshold;
    private String evaluationMethodology;
    private String scoringSystem;

    private Double bidSecurityAmount;
    private String bidSecurityForm;
    private Integer bidSecurityValidity;

    private String submissionMethod;
    private Integer copiesRequired;
    private String formatRequirements;
    private String supportingDocuments;
    private String preQualificationDocs;

    private String preBidMeeting;
    private String siteVisit;
    private String queryDeadline;
    private String responseToQueries;
    private String techBidOpening;
    private String financeBidOpening;

    private String paymentTerms;
    private String warrantyRequirements;
    private String insuranceRequirements;
    private String subContractingRules;
    private String contractAmendment;
    private String disputeResolution;
    private String forceMajeure;
    private String terminationConditions;

    // Attachments are returned as DB relative paths or URLs
    private String biddingDocs;
    private String techSpecsDocs;
    private String draftContract;
    private String billQuantities;
    private String specialInstructions;

    private String timeline;
    private String stepTracker;

    private Long templateId;

  }
}
