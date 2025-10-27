package com.ikon_tender_management.api;

import com.ikon_tender_management.dto.BuyerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/buyers")
public interface BuyerControllerApi {

    @PostMapping
    ResponseEntity<BuyerDto.Response> createBuyer(
            @RequestHeader("Authorization") String accessToken,
            @RequestBody BuyerDto.Request request);

    @GetMapping("/{id}")
    ResponseEntity<BuyerDto.Response> getBuyerById(
            @RequestHeader("Authorization") String accessToken,
            @PathVariable Long id);

    @GetMapping
    ResponseEntity<List<BuyerDto.Response>> listBuyers(
            @RequestHeader("Authorization") String accessToken);

    @PutMapping("/{id}")
    ResponseEntity<BuyerDto.Response> updateBuyer(
            @RequestHeader("Authorization") String accessToken,
            @PathVariable Long id,
            @RequestBody BuyerDto.Request request);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteBuyer(
            @RequestHeader("Authorization") String accessToken,
            @PathVariable Long id);
}
