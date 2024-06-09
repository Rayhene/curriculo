package com.curriculo.api.service;

import com.curriculo.api.entities.Skill;
import com.curriculo.api.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService {
    @Autowired
    private SkillRepository repository;

    public Skill createSkill(Skill skill) {
        return repository.save(skill);
    }

    public List<Skill> getAllSkills() {
        return repository.findAll();
    }

    public Optional<Skill> getSkillById(Long id) {
        return repository.findById(id);
    }

    public String deleteSkillById(Long id) {
        try {
            repository.deleteById(id);
            return "Deletado!";
        } catch (Exception e) {
            return "Erro";
        }
    }

}
