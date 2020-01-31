package com.example.steep.sistemaPruebas.expose.web;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/status")
public class StatusController {

    @GetMapping("/verify")
    public ResponseEntity<String> status(){
        return new ResponseEntity<String>("OK", HttpStatus.OK);
    }
}
