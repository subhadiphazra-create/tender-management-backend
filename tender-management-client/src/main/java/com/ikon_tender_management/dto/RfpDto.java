package com.ikon_tender_management.dto;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

public class RfpDto {

    @Data
    public static class Request {
      @NotBlank(message = "RFP Title is required")
      private String rfpTitle;

      @NotBlank(message = "RFP Deadline is required")
      private String rfpDeadline;

      @NotBlank(message = "Department is required")
      private String tender_department;

      @NotBlank(message = "Sector is required")
      private String sector;

      @NotBlank(message = "Product/Service is required")
      private String product_service;

      @NotBlank(message = "Country is required")
      private String country;

      private MultipartFile file;
    }

    @Data
    public static class Response {
      private Long id;
      private String rfpTitle;
      private String rfpDeadline;
      private String tender_department;
      private String sector;
      private String product_service;
      private String country;
      private String rfpFilePath;
    }
}
