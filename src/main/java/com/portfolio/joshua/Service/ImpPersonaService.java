package com.portfolio.joshua.Service;

import com.portfolio.joshua.Entity.Persona;
import com.portfolio.joshua.Interface.IPersonaService;
import com.portfolio.joshua.Repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ImpPersonaService implements IPersonaService {
    @Autowired IPersonaRepository ipersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public Void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
        return null;
    }

    @Override
    public Void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
        return null;
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
}
