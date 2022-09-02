package com.stonecode.proyecto.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {

    @GetMapping("/")
    public String saludar(){
        return "Hola alejo estoy haciendo mi primer controlador de pagina web";

    }

    @GetMapping("/about")
    public String presentar() {
        return "hola mi nombre es Diana Guzmán";
    }
}

