package com.dockmind_backend.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/v1/documents")
@Tag(
        name = "Document Management",
        description = "Endpoints for uploading, listing and managing documents and their vectors embeddings."
)
public class DocmindController {

    @PostMapping
    public ResponseEntity<String> uploadDocument() {
        // Implement the logic for uploading a document and generating its vector embeddings
        return ResponseEntity.ok("Document uploaded successfully.");
    }
}
