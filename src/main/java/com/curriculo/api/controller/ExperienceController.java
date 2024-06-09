package com.curriculo.api.controller;

import java.util.List;
import java.util.Optional;

import com.curriculo.api.entities.Experience;
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
@RequestMapping("/experience")
public class ExperienceController {

    @Autowired
    private ExperienceService service;

    @PostMapping
    public Experience save(@RequestBody Experience experience) {
        return service.createExperience(experience);
    }

    @GetMapping
    public List<Experience> getAll() {
        return service.getAllExperiences();
    }

    @GetMapping("/{id}")
    public Optional<Experience> getById(@PathVariable Long id) {
        return service.getExperienceById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return service.deleteExperienceById(id);
    }

}
