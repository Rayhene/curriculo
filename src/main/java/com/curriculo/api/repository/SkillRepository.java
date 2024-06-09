package com.curriculo.api.repository;

import com.curriculo.api.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository  extends JpaRepository<Skill, Long> {
}
