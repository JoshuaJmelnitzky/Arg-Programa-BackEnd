package com.portfolio.joshua.Service;

import com.portfolio.joshua.Entity.Banner;
import com.portfolio.joshua.Entity.Persona;
import com.portfolio.joshua.Repository.RBanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SBanner {
    @Autowired
    RBanner rBanner;

    public List<Banner> list(){
        return rBanner.findAll();
    };

    public Optional<Banner> getOne(int id){
        return rBanner.findById(id);
    }

    public boolean existsById(int id){
        return rBanner.existsById(id);
    }

    public void save(Banner banner){
        rBanner.save(banner);
    }

    public void deleteById(int id){
        rBanner.deleteById(id);
    }
}
