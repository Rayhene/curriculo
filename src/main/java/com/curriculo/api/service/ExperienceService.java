package com.curriculo.api.service;

import com.curriculo.api.entities.Experience;
import com.curriculo.api.repository.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienceService {
    @Autowired
    private ExperienceRepository repository;

    public Experience createExperience(Experience experience) {
        return repository.save(experience);
    }

    public List<Experience> getAllExperiences() {
        return repository.findAll();
    }

    public Optional<Experience> getExperienceById(Long id) {
        return repository.findById(id);
    }

    public String deleteExperienceById(Long id) {
        try {
            repository.deleteById(id);
            return "Deletado!";
        } catch (Exception e) {
            return "Erro";
        }
    }
}
