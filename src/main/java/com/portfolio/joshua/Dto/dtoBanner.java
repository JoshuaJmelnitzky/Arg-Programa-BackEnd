package com.portfolio.joshua.Dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class dtoBanner {
    @NotBlank
    private String img;

    public dtoBanner(){

    }

    public dtoBanner(String img) {
        this.img = img;
    }
}
