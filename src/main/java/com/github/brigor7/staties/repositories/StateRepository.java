package com.github.brigor7.staties.repositories;

import com.github.brigor7.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
