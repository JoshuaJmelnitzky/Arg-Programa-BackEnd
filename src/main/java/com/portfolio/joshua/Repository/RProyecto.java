package com.portfolio.joshua.Repository;

import com.portfolio.joshua.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RProyecto extends JpaRepository<Proyecto, Integer> {
    public Optional<Proyecto> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);

    @Query(value = "SELECT AUTO_INCREMENT " +
            "FROM INFORMATION_SCHEMA.TABLES " +
            "WHERE TABLE_NAME = 'proyecto' ", nativeQuery = true)
    public int getMaxId();
}
