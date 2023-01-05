package com.sofka.spacecraft.controller;

import com.sofka.spacecraft.domain.Unmanned;
import com.sofka.spacecraft.service.UnmannedService;
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
public class UnmannedController {
    @Autowired
    private UnmannedService unmannedService;

    @GetMapping(path = "/api/v1/list/unmanned")
    public ResponseEntity<Response> getUnmanneds(Unmanned unmanned){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Unmanneds", unmannedService.list()))
                        .message("Unmanneds listed")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }
    @PostMapping(path = "/api/v1/create/unmanned")
    public ResponseEntity<Response> createUnmanned(Unmanned unmanned){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Unmanned", unmannedService.createUnmanned(unmanned)))
                        .message("Unmanned created")
                        .status(HttpStatus.CREATED)
                        .statusCode(HttpStatus.CREATED.value())
                        .build()
        );
    }

    @DeleteMapping(path = "/api/v1/delete/unmanned/{id}")
    public ResponseEntity<Response> deleteUnmanned(@PathVariable("id") Long id){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Deleted", unmannedService.delete(id)))
                        .message("Unmanned deleted")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }
}
