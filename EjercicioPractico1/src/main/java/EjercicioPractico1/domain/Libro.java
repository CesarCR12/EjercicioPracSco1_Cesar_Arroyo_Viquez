/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author cesar
 */
@Data
@Entity
@Table(name="categoria")

public class Libro implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long id_categoria;
    
    @Column(name="descripcion")
    private String descripcion;
    
    @Column(name="ruta_imagen")
    private String rutaImagen;
    
    @Column(name="activo")
    private boolean activo;

    public Libro() {
    }

    public Libro(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
}
