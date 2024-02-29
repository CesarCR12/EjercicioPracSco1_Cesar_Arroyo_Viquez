/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EjercicioPractico1.service;

import EjercicioPractico1.domain.Libro;
import java.util.List;

public interface LibroService {
    List<Libro> getLibro(boolean activos);
}
