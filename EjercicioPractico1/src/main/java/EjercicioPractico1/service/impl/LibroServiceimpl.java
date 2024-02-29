/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1.service.impl;

import EjercicioPractico1.Dao.LibroDao;
import EjercicioPractico1.domain.Libro;
import EjercicioPractico1.service.LibroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibroServiceimpl implements LibroService {
    
    @Autowired
    private LibroDao LibroDao;

    @Override
    @Transactional(readOnly=true)
    public List<Libro> getLibro(boolean activos) {
        var lista=LibroDao.findAll();
        if (activos) {
           lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
}
