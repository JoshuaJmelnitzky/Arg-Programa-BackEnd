package com.portfolio.joshua.Repository;

import com.portfolio.joshua.Entity.HyS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RHyS extends JpaRepository<HyS, Integer> {
    Optional<HyS> findByNombre(String nombre);

    public boolean existsByNombre(String nombre);

    @Query(value = "SELECT AUTO_INCREMENT " +
            "FROM INFORMATION_SCHEMA.TABLES " +
            "WHERE TABLE_NAME = 'hys' ", nativeQuery = true)
    public int getMaxId();
}
