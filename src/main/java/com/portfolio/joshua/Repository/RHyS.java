package com.portfolio.joshua.Repository;

import com.portfolio.joshua.Entity.HyS;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RHyS extends JpaRepository<HyS, Integer> {
    Optional<HyS> findByNombre(String nombre);

    public boolean existsByNombre(String nombre);
}
