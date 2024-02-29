/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1.controller;

import EjercicioPractico1.service.LibroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/Libro")
public class LibroController {
    
    @Autowired
    private LibroService LibroService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var Libro = LibroService.getLibro(false);
        model.addAttribute("categorias", Libro);
        model.addAttribute("precio", Libro.size());
        return "/Libro/listado";
    }
}
