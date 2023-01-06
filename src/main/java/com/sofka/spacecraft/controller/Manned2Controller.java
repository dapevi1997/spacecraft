package com.sofka.spacecraft.controller;

import com.sofka.spacecraft.domain.Manned2;

import com.sofka.spacecraft.service.Manned2Service;
import com.sofka.spacecraft.utility.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDateTime;
import java.util.Map;

@Slf4j
@RestController
public class Manned2Controller {
    @Autowired
    private Manned2Service manned2Service;
    @GetMapping(path = "/api/v1/list/manned2")
    public ResponseEntity<Response> getManned2s(){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Manneds", manned2Service.list()))
                        .message("Manneds type 2 listed")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }
    @PostMapping(path = "/api/v1/create/manned2")
    public ResponseEntity<Response> createManned2 (Manned2 manned2){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Manned", manned2Service.createManned2(manned2)))
                        .message("Manned type 2 created")
                        .status(HttpStatus.CREATED)
                        .statusCode(HttpStatus.CREATED.value())
                        .build()
        );
    }
    @DeleteMapping(path = "/api/v1/delete/manned2/{id}")
    public ResponseEntity<Response> deleteManned1(@PathVariable("id") Integer id){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Manned", manned2Service.delete(id)))
                        .message("Manned type 2 deleted")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }

    @PatchMapping(path = "/api/v1/update/manned2/{id}/name")
    public ResponseEntity<Response> updateName(@PathVariable("id") Integer id, @RequestBody Manned2 manned2){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Manned", manned2Service.updateName(id, manned2)))
                        .message("Manned updated")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }

    @PatchMapping(path = "/api/v1/update/manned2/{id}/power")
    public ResponseEntity<Response> updatePower(@PathVariable("id") Integer id, @RequestBody Manned2 manned2){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Manned", manned2Service.updatePower(id, manned2)))
                        .message("Manned updated")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }

    @PatchMapping(path = "/api/v1/update/manned2/{id}/year")
    public ResponseEntity<Response> updateYear(@PathVariable("id") Integer id, @RequestBody Manned2 manned2){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Manned", manned2Service.updateYear(id, manned2)))
                        .message("Manned updated")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }

    @PatchMapping(path = "/api/v1/update/manned2/{id}/country")
    public ResponseEntity<Response> updateCountry(@PathVariable("id") Integer id, @RequestBody Manned2 manned2){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Manned", manned2Service.updateCountry(id, manned2)))
                        .message("Manned updated")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }

    @PatchMapping(path = "/api/v1/update/manned2/{id}/ncrew")
    public ResponseEntity<Response> updateNCrew(@PathVariable("id") Integer id, @RequestBody Manned2 manned2){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Manned", manned2Service.updateNCrew(id, manned2)))
                        .message("Manned updated")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }
}
