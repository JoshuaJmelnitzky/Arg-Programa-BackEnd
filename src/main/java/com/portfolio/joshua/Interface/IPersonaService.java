package com.portfolio.joshua.Interface;

import com.portfolio.joshua.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    public List<Persona> getPersona();

    public Void savePersona(Persona persona);

    public Void deletePersona(Long id);

    public Persona findPersona(Long id);
}
