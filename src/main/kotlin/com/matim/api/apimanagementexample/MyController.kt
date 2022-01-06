package com.matim.api.apimanagementexample

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyController {

    @GetMapping("/")
    fun index(): ResponseEntity<String> {
        return ResponseEntity("index", HttpStatus.OK);
    }

    @GetMapping("/hello")
    fun hello(): ResponseEntity<String> {
        return ResponseEntity("world", HttpStatus.OK);
    }
}