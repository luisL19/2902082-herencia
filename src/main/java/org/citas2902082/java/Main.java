package org.citas2902082.java;

import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.Usuario;
import org.citas2902082.java.entities.enums.Especialidad;
import org.citas2902082.java.entities.enums.TipoIdentificacion;

public class Main {
    
    public static void main(String[] ars){

        Medico m = new Medico(1,
                        "Luis", 
                      "Lugo",
                                TipoIdentificacion.CC,
           1054456762L,
                 1234345L,
                                Especialidad.MEDICINA_GENERAL);
    
        System.out.println(m.toString());
        
        Usuario u = new Usuario();
    }

}