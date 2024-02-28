
package practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="arbol")
public class Arbol implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_arbol")
    private Long idArbol;
    
    private String rutaImagen;
    private String nombreComun;
    private String tipoFlor;
    private double durezaMadera;
    private boolean activo;

    public Arbol() {
    }

    public Arbol(String arbol, boolean activo) {
        this.nombreComun = arbol;
        this.activo = activo;
    }
}
