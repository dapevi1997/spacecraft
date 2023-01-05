package com.sofka.spacecraft.controller;

import com.sofka.spacecraft.domain.Thrower;
import com.sofka.spacecraft.service.ThrowerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ThrowerController {
    @Autowired
    private ThrowerService throwerService;
    @PostMapping(path = "/api/v1/create/thrower")
    public ResponseEntity<Thrower> createThrower(Thrower thrower){
        throwerService.createThrower(thrower);
        return new ResponseEntity<>(thrower, HttpStatus.CREATED);
    }
}
