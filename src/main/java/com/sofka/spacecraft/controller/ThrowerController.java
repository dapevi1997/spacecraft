package com.sofka.spacecraft.controller;

import com.sofka.spacecraft.domain.Thrower;
import com.sofka.spacecraft.service.ThrowerService;
import com.sofka.spacecraft.utility.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@Slf4j
@RestController
public class ThrowerController {
    @Autowired
    private ThrowerService throwerService;
    @PostMapping(path = "/api/v1/create/thrower")
    public ResponseEntity<Response> createThrower(Thrower thrower){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Thrower", throwerService.createThrower(thrower)))
                        .message("Thrower created")
                        .status(HttpStatus.CREATED)
                        .statusCode(HttpStatus.CREATED.value())
                        .build()
        );
    }
}
