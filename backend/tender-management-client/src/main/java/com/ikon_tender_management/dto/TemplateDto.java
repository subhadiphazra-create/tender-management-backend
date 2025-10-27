package com.ikon_tender_management.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

public class TemplateDto {

    @Data
    public static class Request {
        @NotBlank(message = "Template name is required")
        private String templateName;

        @NotBlank(message = "Department is required")
        private String department;

        @NotBlank(message = "Sector is required")
        private String sector;

        @NotBlank(message = "Product is required")
        private String product;

        @NotBlank(message = "Template content is required")
        private String editorValue;
    }

    @Data
    public static class Response {
        private Long id;
        private String templateName;
        private String department;
        private String sector;
        private String product;
        private String editorValue;
    }
}
