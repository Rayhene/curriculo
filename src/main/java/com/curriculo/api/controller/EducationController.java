package com.curriculo.api.controller;

import java.util.List;
import java.util.Optional;

import com.curriculo.api.entities.Education;
import com.curriculo.api.entities.Experience;
import com.curriculo.api.service.EducationService;
import com.curriculo.api.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/education")

public class EducationController {
    @Autowired
    private EducationService service;

    @PostMapping
    public Education save(@RequestBody Education education) {
        return service.createEducation(education);
    }

    @GetMapping
    public List<Education> getAll() {
        return service.getAllEducations();
    }

    @GetMapping("/{id}")
    public Optional<Education> getById(@PathVariable Long id) {
        return service.getEducationById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return service.deleteEducationById(id);
    }
}
