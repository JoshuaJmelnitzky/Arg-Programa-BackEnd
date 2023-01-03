package com.portfolio.joshua.Security.Service;

import com.portfolio.joshua.Security.Entity.Rol;
import com.portfolio.joshua.Security.Enums.RolNombre;
import com.portfolio.joshua.Security.Repository.iRolRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol){
        irolRepository.save(rol);
    }

}
