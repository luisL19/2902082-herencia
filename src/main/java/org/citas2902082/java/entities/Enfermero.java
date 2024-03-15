package org.citas2902082.java.entities;

import org.citas2902082.java.entities.enums.TipoIdentificacion;

public class Enfermero extends Usuario{

    public Enfermero(Integer id, 
            String nombres, 
            String apellidos, 
            TipoIdentificacion tipoIdentificacion,
            Long numeroIdentidicacion) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentidicacion);
    
}

}
