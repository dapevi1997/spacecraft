package com.sofka.spacecraft.controller;

import com.sofka.spacecraft.domain.Manned1;

import com.sofka.spacecraft.service.Manned1Service;
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
public class Manned1Controller {
    @Autowired
    private Manned1Service manned1Service;
    @GetMapping(path = "/api/v1/list/manned1")
    public ResponseEntity<Response> getManned1s(Manned1 manned1){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Manneds", manned1Service.list()))
                        .message("Manneds type 1 listed")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }
    @PostMapping(path = "/api/v1/create/manned1")
    public ResponseEntity<Response> createManned1 (Manned1 manned1){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Manned", manned1Service.createManned1(manned1)))
                        .message("Manned type 2 created")
                        .status(HttpStatus.CREATED)
                        .statusCode(HttpStatus.CREATED.value())
                        .build()
        );
    }
    @DeleteMapping(path = "/api/v1/delete/manned1/{id}")
    public ResponseEntity<Response> deleteManned1(@PathVariable("id") Integer id){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Manned", manned1Service.delete(id)))
                        .message("Manned deleted")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }
}
