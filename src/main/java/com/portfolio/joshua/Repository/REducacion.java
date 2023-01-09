package com.portfolio.joshua.Repository;

import com.portfolio.joshua.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface REducacion extends JpaRepository<Educacion, Integer>{
    public Optional<Educacion> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);

    @Query(value = "SELECT AUTO_INCREMENT " +
            "FROM INFORMATION_SCHEMA.TABLES " +
            "WHERE TABLE_NAME = 'educacion' ", nativeQuery = true)
    public int getMaxId();
}
