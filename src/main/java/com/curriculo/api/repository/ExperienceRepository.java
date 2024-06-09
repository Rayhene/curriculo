package com.curriculo.api.repository;

import com.curriculo.api.entities.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepository  extends JpaRepository<Experience, Long> {
}
