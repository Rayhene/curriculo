package com.curriculo.api.controller;


import com.curriculo.api.entities.PersonalInformation;
import com.curriculo.api.service.PersonalInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/personalInformation")
public class PersonalInformationController {

    @Autowired
    private PersonalInformationService service;

    @PostMapping
    public PersonalInformation create(@RequestBody PersonalInformation personalInformation) {
        return service.createPersonal(personalInformation);
    }

    @GetMapping
    public List<PersonalInformation> getAll() {
        return service.getAllPersonals();
    }

    @GetMapping("/{id}")
    public Optional<PersonalInformation> getById(@PathVariable Long id) {
        return service.getPersonalById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deletePersonalById(id);
    }
}
