package com.ikon_tender_management.api;

import com.ikon_tender_management.dto.TenderDto;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/tenders")
public interface TenderFormControllerApi {

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    ResponseEntity<TenderDto.Response> createTender(
            @RequestHeader("Authorization") String accessToken,
            @ModelAttribute TenderDto.Request request);

    @GetMapping("/{id}")
    ResponseEntity<TenderDto.Response> getTenderById(
            @RequestHeader("Authorization") String accessToken,
            @PathVariable Long id);

    @GetMapping
    ResponseEntity<List<TenderDto.Response>> listTenders(
            @RequestHeader("Authorization") String accessToken);

    @PutMapping(value = "/{id}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    ResponseEntity<TenderDto.Response> updateTender(
            @RequestHeader("Authorization") String accessToken,
            @PathVariable Long id,
            @ModelAttribute TenderDto.Request request);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteTender(
            @RequestHeader("Authorization") String accessToken,
            @PathVariable Long id);
}
