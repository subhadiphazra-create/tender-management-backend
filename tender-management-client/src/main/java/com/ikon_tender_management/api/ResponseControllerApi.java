package com.ikon_tender_management.api;

import com.ikon_tender_management.dto.ResponseDto;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/responses")
public interface ResponseControllerApi {

        @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
        ResponseEntity<ResponseDto.Response> createResponse(
                        @RequestHeader("Authorization") String accessToken,
                        @ModelAttribute ResponseDto.Request request);

        @GetMapping("/{id}")
        ResponseEntity<ResponseDto.Response> getResponseById(
                        @RequestHeader("Authorization") String accessToken,
                        @PathVariable Long id);

        @GetMapping
        ResponseEntity<List<ResponseDto.Response>> listResponses(
                        @RequestHeader("Authorization") String accessToken);

        @PutMapping(value = "/{id}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
        ResponseEntity<ResponseDto.Response> updateResponse(
                        @RequestHeader("Authorization") String accessToken,
                        @PathVariable Long id,
                        @RequestBody ResponseDto.Request request);

        @DeleteMapping("/{id}")
        ResponseEntity<Void> deleteResponse(
                        @RequestHeader("Authorization") String accessToken,
                        @PathVariable Long id);
}
