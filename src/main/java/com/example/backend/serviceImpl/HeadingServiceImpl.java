package com.example.backend.serviceImpl;

import com.example.backend.model.Heading;
import com.example.backend.repository.HeadingRepository;
import com.example.backend.service.HeadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeadingServiceImpl implements HeadingService {

    private final HeadingRepository headingRepository;

    @Autowired
    public HeadingServiceImpl(HeadingRepository headingRepository) {
        this.headingRepository = headingRepository;
    }

    @Override
    public Heading getHeading() {
        return headingRepository.findAll().stream().findFirst().orElse(new Heading(1l, "Default Heading"));
    }

    @Override
    public Heading updateHeading(long id, String text) {
        Heading exHeading = headingRepository.findById(id).get();
        exHeading.setText(text);
        return headingRepository.save(exHeading);
    }
}
