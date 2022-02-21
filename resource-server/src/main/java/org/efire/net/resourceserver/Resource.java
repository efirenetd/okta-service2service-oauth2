package org.efire.net.resourceserver;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class Resource {

    @GetMapping("/whoami/{name}")
    public ResponseEntity<String> whoami(@PathVariable String name) {
        return ResponseEntity.ok("Hello, "+name);
    }
}
