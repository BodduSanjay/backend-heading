package com.example.backend.service;

import com.example.backend.model.Heading;
import org.springframework.stereotype.Service;

@Service
public interface HeadingService {
    Heading getHeading();
    Heading updateHeading(long id, String text);
}
