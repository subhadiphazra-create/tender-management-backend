package com.ikon_tender_management.api;

import com.ikon_tender_management.dto.RfpDto;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("/api/rfps")
public interface RfpControllerApi {

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    ResponseEntity<RfpDto.Response> createRfp(
            @RequestHeader("Authorization") String accessToken,
            @ModelAttribute RfpDto.Request request
            );

    @GetMapping("/{id}")
    ResponseEntity<RfpDto.Response> getRfpById(
            @RequestHeader("Authorization") String accessToken,
            @PathVariable Long id);

    @GetMapping
    ResponseEntity<List<RfpDto.Response>> listRfps(
            @RequestHeader("Authorization") String accessToken);

    @PutMapping(value = "/{id}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    ResponseEntity<RfpDto.Response> updateRfp(
            @RequestHeader("Authorization") String accessToken,
            @PathVariable Long id,
            @ModelAttribute RfpDto.Request request);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteRfp(
            @RequestHeader("Authorization") String accessToken,
            @PathVariable Long id);
}
