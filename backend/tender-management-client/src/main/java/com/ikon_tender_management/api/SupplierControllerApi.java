package com.ikon_tender_management.api;

import com.ikon_tender_management.dto.SupplierDto;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/suppliers")
public interface SupplierControllerApi {

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    ResponseEntity<SupplierDto.Response> createSupplier(
            @RequestHeader("Authorization") String accessToken,
            @ModelAttribute SupplierDto.Request request);

    @GetMapping("/{id}")
    ResponseEntity<SupplierDto.Response> getSupplierById(
            @RequestHeader("Authorization") String accessToken,
            @PathVariable Long id);

    @GetMapping
    ResponseEntity<List<SupplierDto.Response>> listSuppliers(
            @RequestHeader("Authorization") String accessToken);

    @PutMapping(value = "/{id}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    ResponseEntity<SupplierDto.Response> updateSupplier(
            @RequestHeader("Authorization") String accessToken,
            @PathVariable Long id,
            @ModelAttribute SupplierDto.Request request);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteSupplier(
            @RequestHeader("Authorization") String accessToken,
            @PathVariable Long id);
}
