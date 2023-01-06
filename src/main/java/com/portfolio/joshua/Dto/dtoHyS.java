package com.portfolio.joshua.Dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter @Setter
public class dtoHyS {
    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;

    @NotBlank
    private String img;

    private dtoHyS(){

    }

    public dtoHyS(String nombre, int porcentaje, String img) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.img = img;
    }
}
