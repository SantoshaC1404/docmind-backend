package com.dockmind_backend.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/v1/chat")
@Tag(
        name = "Chat Management",
        description = "All chat related API's goes here."
)
public class ChatController {

    @PostMapping
    public ResponseEntity<String> chat() {
        // Implement the logic for handling chat requests
        return ResponseEntity.ok("Chat request processed successfully.");
    }
}
