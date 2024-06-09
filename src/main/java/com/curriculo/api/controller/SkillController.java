package com.curriculo.api.controller;

import java.util.List;
import java.util.Optional;

import com.curriculo.api.entities.Skill;
import com.curriculo.api.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/skills")

public class SkillController {
    @Autowired
    private SkillService service;

    @PostMapping
    public Skill save(@RequestBody Skill skill) {
        return service.createSkill(skill);
    }

    @GetMapping
    public List<Skill> getAll() {
        return service.getAllSkills();
    }

    @GetMapping("/{id}")
    public Optional<Skill> getById(@PathVariable Long id) {
        return service.getSkillById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return service.deleteSkillById(id);
    }
}
