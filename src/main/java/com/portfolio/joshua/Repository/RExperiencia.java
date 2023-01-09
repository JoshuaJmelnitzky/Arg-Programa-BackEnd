package com.portfolio.joshua.Repository;

import com.portfolio.joshua.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer> {
    public Optional<Experiencia> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);

    @Query(value = "SELECT AUTO_INCREMENT " +
            "FROM INFORMATION_SCHEMA.TABLES " +
            "WHERE TABLE_NAME = 'experiencia' ", nativeQuery = true)
    public int getMaxId();
}
