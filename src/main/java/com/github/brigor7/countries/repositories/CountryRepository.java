package com.github.brigor7.countries.repositories;

import com.github.brigor7.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
