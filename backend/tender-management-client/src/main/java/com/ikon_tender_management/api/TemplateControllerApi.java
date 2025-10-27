package com.ikon_tender_management.api;

import com.ikon_tender_management.dto.TemplateDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/templates")
public interface TemplateControllerApi {

        @PostMapping
        ResponseEntity<TemplateDto.Response> createTemplate(
                        @RequestHeader("Authorization") String accessToken,
                        @RequestBody TemplateDto.Request request);

        @GetMapping("/{id}")
        ResponseEntity<TemplateDto.Response> getTemplateById(
                        @RequestHeader("Authorization") String accessToken,
                        @PathVariable Long id);

        @GetMapping
        ResponseEntity<List<TemplateDto.Response>> listTemplates(
                        @RequestHeader("Authorization") String accessToken);

        @PutMapping("/{id}")
        ResponseEntity<TemplateDto.Response> updateTemplate(
                        @RequestHeader("Authorization") String accessToken,
                        @PathVariable Long id,
                        @RequestBody TemplateDto.Request request);

        @DeleteMapping("/{id}")
        ResponseEntity<Void> deleteTemplate(
                        @RequestHeader("Authorization") String accessToken,
                        @PathVariable Long id);
}
