package com.ikon_tender_management.dto;

import org.springframework.web.multipart.MultipartFile;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

public class ResponseDto {

  @Data
  public static class Request {
    @NotBlank(message = "Response Title is required")
    private String responseTitle;

    @NotBlank(message = "Response Deadline is required")
    private String responseDeadline;

    // Keep department property
    @NotBlank(message = "Department is required")
    private String tender_department;

    @NotBlank(message = "Sector is required")
    private String sector;

    @NotBlank(message = "Product/Service is required")
    private String product_service;


    @NotBlank(message = "Country is required")
    private String country;

    private MultipartFile file; // Spring handles file uploads with MultipartFile
  }

  @Data
  public static class Response {
    private Long id;
    private String responseTitle;
    private String responseDeadline;
    private String tender_department;
    private String sector;
    private String product_service;
    private String country;
    private String filePath;
  }
}
