package com.cinelitas.controller;


import com.cinelitas.entity.Pelicula;
import com.cinelitas.entity.Sala;
import com.cinelitas.service.IPeliculaService;
import com.cinelitas.service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PeliculaController {
    
    @Autowired
    private ISalaService salaService;
    
    @Autowired
    private IPeliculaService peliculaService;
    
    @GetMapping("/pelicula")
    public String index (Model model){
        List<Pelicula> listaPelicula = peliculaService.getAllPelicula();
        model.addAttribute("titulo", "Tabla Artistas");
        model.addAttribute("peliculas",listaPelicula);
        return "artistas";
    }
    
    @GetMapping("/peliculaN")
    public String crearPelicula(Model model){
        List<Sala> listaSalas = salaService.listSala();
        model.addAttribute("pelicula", new Pelicula());
        model.addAttribute("salas", listaSalas);
        return "crear";
    }
}
