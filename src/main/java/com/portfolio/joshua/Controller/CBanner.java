package com.portfolio.joshua.Controller;

import com.portfolio.joshua.Dto.dtoBanner;
import com.portfolio.joshua.Dto.dtoPersona;
import com.portfolio.joshua.Entity.Banner;
import com.portfolio.joshua.Entity.Persona;
import com.portfolio.joshua.Security.Controller.Mensaje;
import com.portfolio.joshua.Service.SBanner;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banner")
@CrossOrigin(origins = {"http://localhost:4200", "https://argprograma--front.web.app"})
public class CBanner {
    @Autowired
    SBanner sBanner;

    @GetMapping("/lista")
    public ResponseEntity<List<Banner>> list(){
        List<Banner> list = sBanner.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Banner> getById(@PathVariable("id") int id){
        if(!sBanner.existsById(id))
            return new ResponseEntity(new Mensaje("No existe el id ingresado"), HttpStatus.NOT_FOUND);

        Banner banner = sBanner.getOne(id).get();
        return new ResponseEntity(banner, HttpStatus.OK);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoBanner dtobanner){
        if(!sBanner.existsById(id))
            return new ResponseEntity(new Mensaje("No existe el id ingresado"), HttpStatus.NOT_FOUND);

//        if(StringUtils.isBlank(dtobanner.getImg()))
//            return new ResponseEntity(new Mensaje("El campo es obligatorio"), HttpStatus.BAD_REQUEST);

        Banner banner = sBanner.getOne(id).get();

        banner.setImg(dtobanner.getImg());

        sBanner.save(banner);
        return new ResponseEntity(new Mensaje("Banner actualizado con éxito"), HttpStatus.OK);
    }
}
