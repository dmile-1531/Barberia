package com.stonecode.proyecto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControladorGeneral {

    @RequestMapping
    @ResponseBody
    public ResponseEntity<String> saludando() {
        return new ResponseEntity<>("Hola alejo estoy haciendo mi primer controlador de pagina web", HttpStatus.OK);
    }
}
