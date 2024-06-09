package com.curriculo.api.service;

import com.curriculo.api.entities.PersonalInformation;
import com.curriculo.api.repository.PersonalInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalInformationService {

    @Autowired
    private PersonalInformationRepository repository;

    public PersonalInformation createPersonal(PersonalInformation personalInformation) {
        return repository.save(personalInformation);
    }

    public List<PersonalInformation> getAllPersonals() {
        return repository.findAll();
    }

    public Optional<PersonalInformation> getPersonalById(Long id) {
        return repository.findById(id);
    }

    public String deletePersonalById(Long id) {
        try {
            repository.deleteById(id);
            return "Deletado!";
        } catch (Exception e) {
            return "Erro";
        }
    }
}
