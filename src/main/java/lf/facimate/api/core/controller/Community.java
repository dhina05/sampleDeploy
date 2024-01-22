package lf.facimate.api.core.controller;


import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/community")
public class Community {

    @GetMapping
    public ResponseEntity<?> getEntities(){
        return new ResponseEntity<>("SVG", HttpStatus.OK);
    }
}
