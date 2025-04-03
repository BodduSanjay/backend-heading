package com.example.backend.controller;

import com.example.backend.model.Heading;
import com.example.backend.service.HeadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/heading")
@CrossOrigin(origins = "*")
public class HeadingController {

    @Autowired
    private HeadingService headingService;

    @GetMapping
    public Heading getHeading() {
        return headingService.getHeading();
    }

    @PutMapping
    public Heading updateHeading(@RequestBody Heading heading) {
        return headingService.updateHeading(heading.getId(),heading.getText());
    }
}
