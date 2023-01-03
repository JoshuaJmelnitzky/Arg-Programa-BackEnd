package com.portfolio.joshua.Service;

import com.portfolio.joshua.Entity.Educacion;
import com.portfolio.joshua.Repository.REducacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SEducacion {
    @Autowired
    REducacion rEducacion;

    public List<Educacion> list(){
        return rEducacion.findAll();
    };

    public Optional<Educacion> getOne(int id){
        return rEducacion.findById(id);
    };

    public Optional<Educacion> getByNombreE(String nombreE){
        return rEducacion.findByNombreE(nombreE);
    };

    public void save(Educacion educacion){
      rEducacion.save(educacion);
    };

    public void deleteById(int id){
        rEducacion.deleteById(id);
    }

    public boolean existsById(int id){
        return rEducacion.existsById(id);
    };

    public boolean existsByNombreE(String nombreE){
        return rEducacion.existsByNombreE(nombreE);
    };
}
