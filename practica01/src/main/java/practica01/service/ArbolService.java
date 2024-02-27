/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package practica01.service;

import practica01.domain.Arbol;
import java.util.List;

public interface ArbolService {
    
    // Se obtiene un listado de categorias en un List
    public List<Arbol> getCategorias(boolean activos);
 
}
