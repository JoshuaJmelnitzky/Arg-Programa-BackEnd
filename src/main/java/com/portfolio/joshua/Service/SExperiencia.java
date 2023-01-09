package com.portfolio.joshua.Service;

import com.portfolio.joshua.Entity.Experiencia;
import com.portfolio.joshua.Repository.RExperiencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SExperiencia {
    @Autowired
    RExperiencia rExperiencia;

    public List<Experiencia> list(){
      return rExperiencia.findAll();
    };

    public Optional<Experiencia> getOne(int id){
        return rExperiencia.findById(id);
    }

    public Optional<Experiencia> getByNombreE(String nombreE){
        return rExperiencia.findByNombreE(nombreE);
    }

    public void save(Experiencia exp){
        rExperiencia.save(exp);
    }

    public void deleteById(int id){
        rExperiencia.deleteById(id);
    }

    public boolean existsById(int id){
        return rExperiencia.existsById(id);
    }

    public boolean existsByNombreE(String nombreE){
        return rExperiencia.existsByNombreE(nombreE);
    }

    public int getMaxId(){
        return rExperiencia.getMaxId();
    }
}
