package com.sofka.spacecraft.controller;

import com.sofka.spacecraft.domain.Unmanned;
import com.sofka.spacecraft.service.UnmannedService;
import com.sofka.spacecraft.utility.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.Map;

@Slf4j
@RestController
public class UnmannedController {
    @Autowired
    private UnmannedService unmannedService;

    @GetMapping(path = "/api/v1/list/unmanned")
    public ResponseEntity<Response> getUnmanneds(){
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

    @PatchMapping(path = "/api/v1/updateName/unmanned/{id}")
    public ResponseEntity<Response> UpdateNameUnmanned(@RequestBody Unmanned unmanned, @PathVariable("id") Long id) {

        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Updated", unmannedService.updateNameUnmanned(id,unmanned)))
                        .message("Unmanned name updated")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );

    }

    @PatchMapping(path = "/api/v1/updateYear/unmanned/{id}")
    public ResponseEntity<Response> UpdateYearUnmanned(@RequestBody Unmanned unmanned, @PathVariable("id") Long id) {

        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Updated", unmannedService.updateYearUnmanned(id,unmanned)))
                        .message("Unmanned year updated")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );

    }

    @PatchMapping(path = "/api/v1/updateCountry/unmanned/{id}")
    public ResponseEntity<Response> UpdateCountryUnmanned(@RequestBody Unmanned unmanned, @PathVariable("id") Long id) {

        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Updated", unmannedService.updateCountryUnmanned(id,unmanned)))
                        .message("Unmanned country updated")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );

    }

    @PatchMapping(path = "/api/v1/updatePower/unmanned/{id}")
    public ResponseEntity<Response> UpdatePowerUnmanned(@RequestBody Unmanned unmanned, @PathVariable("id") Long id) {

        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Updated", unmannedService.updatePowerUnmanned(id,unmanned)))
                        .message("Unmanned power updated")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );

    }

    @PatchMapping(path = "/api/v1/updatePForce/unmanned/{id}")
    public ResponseEntity<Response> UpdatePForceUnmanned(@RequestBody Unmanned unmanned, @PathVariable("id") Long id) {

        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Updated", unmannedService.updatePForceUnmanned(id,unmanned)))
                        .message("Unmanned initializer pushing force updated")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );

    }
    @PatchMapping(path = "/api/v1/updateIsActive/unmanned/{id}")
    public ResponseEntity<Response> UpdateIsActiveUnmanned(@RequestBody Unmanned unmanned, @PathVariable("id") Long id) {

        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("Updated", unmannedService.updateIsActiveUnmanned(id,unmanned)))
                        .message("Unmanned actived updated")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );

    }

}
