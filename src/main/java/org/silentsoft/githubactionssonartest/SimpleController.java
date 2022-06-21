package org.silentsoft.githubactionssonartest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/")
    public ResponseEntity<?> index() {
        return ResponseEntity.ok("Hello, world!");
    }

}
