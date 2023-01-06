package com.sofka.spacecraft.controller;

import com.sofka.spacecraft.domain.Thrower;
import com.sofka.spacecraft.service.ThrowerService;
import com.sofka.spacecraft.utility.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.Map;

@Slf4j
@RestController
public class ThrowerController {
    @Autowired
    private ThrowerService throwerService;

    @GetMapping(path = "/api/v1/list/thrower")
    public ResponseEntity<Response> getThrowers(){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Throwers", throwerService.list()))
                        .message("Throwers listed")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }
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

    @DeleteMapping(path = "/api/v1/delete/thrower/{id}")
    public ResponseEntity<Response> deleteThrower(@PathVariable("id") Long id){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Deleted", throwerService.delete(id)))
                        .message("Thrower deleted")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }

    @PatchMapping(path = "/api/v1/updateName/thrower/{id}")
    public ResponseEntity<Response> UpdateNameThrower(@RequestBody Thrower thrower, @PathVariable("id") Long id) {

        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Updated", throwerService.updateNameThrower(id,thrower)))
                        .message("Thrower name updated")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );

    }

    @PatchMapping(path = "/api/v1/updateYear/thrower/{id}")
    public ResponseEntity<Response> UpdateYearThrower(@RequestBody Thrower thrower, @PathVariable("id") Long id) {

        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Updated", throwerService.updateYearThrower(id,thrower)))
                        .message("Thrower year updated")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );

    }

    @PatchMapping(path = "/api/v1/updateCountry/thrower/{id}")
    public ResponseEntity<Response> UpdateCountryThrower(@RequestBody Thrower thrower, @PathVariable("id") Long id) {

        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Updated", throwerService.updateCountryThrower(id,thrower)))
                        .message("Thrower country of origin updated")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );

    }

    @PatchMapping(path = "/api/v1/updatePower/thrower/{id}")
    public ResponseEntity<Response> UpdatePowerThrower(@RequestBody Thrower thrower, @PathVariable("id") Long id) {

        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Updated", throwerService.updatePowerThrower(id,thrower)))
                        .message("Thrower power updated")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );

    }

    @PatchMapping(path = "/api/v1/updateLoad/thrower/{id}")
    public ResponseEntity<Response> UpdateLoadThrower(@RequestBody Thrower thrower, @PathVariable("id") Long id) {

        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Updated", throwerService.updateLoadThrower(id,thrower)))
                        .message("Thrower load updated")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );

    }
}
