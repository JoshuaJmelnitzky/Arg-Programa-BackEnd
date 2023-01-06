package com.portfolio.joshua.Service;

import com.portfolio.joshua.Entity.HyS;
import com.portfolio.joshua.Repository.RHyS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class SHyS {
    @Autowired
    RHyS rHyS;

    public List<HyS> list(){
        return rHyS.findAll();
    }

    public Optional<HyS> getOne(int id){
        return rHyS.findById(id);
    }

    public Optional<HyS> getByNombre(String nombre){
        return rHyS.findByNombre(nombre);
    }

    public void save(HyS skill){
        rHyS.save(skill);
    }

    public void deleteById(int id){
        rHyS.deleteById(id);
    }

    public boolean existsById(int id){
        return rHyS.existsById(id);
    }

    public boolean existsByNombre(String nombre){
        return rHyS.existsByNombre(nombre);
    }
}
