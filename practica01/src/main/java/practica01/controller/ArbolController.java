/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica01.controller;

import practica01.service.ArbolService;
import lombok.extern.slf4j.Slf4j; // Manejo controladores con interfaz en la vista
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/arbol") // Creando EndPoint, este es el API
public class ArbolController {
    
    @Autowired 
    private ArbolService arbolService; //arbolService trae adentro la lista anteriormente creada

    @GetMapping("/listado")
    public String inicio(Model model) { 
        var arboles = arbolService.getCategorias(false); // se crea variable categoria que obtienen todas las categorias que vienen de getArboles
        model.addAttribute("arboles", arboles); // "categorias" es un nombre que le estamos dando a la variable
        model.addAttribute("totalArboles", arboles.size()); // totalCategorias == categorias.size()
        return "/arboles/listado";
    }
}

