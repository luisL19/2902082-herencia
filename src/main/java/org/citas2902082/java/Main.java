package org.citas2902082.java;

import java.time.LocalDate;

import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.Paciente;
import org.citas2902082.java.entities.Usuario;
import org.citas2902082.java.entities.enums.Especialidad;
import org.citas2902082.java.entities.enums.TipoIdentificacion;
import org.citas2902082.java.entities.enums.TipoSangre;

public class Main {
    
    public static void main(String[] ars){

        Medico medico1 = new Medico(1,
                        "Luis", 
                      "Lugo",
                                TipoIdentificacion.CC,
           1054456762L,
                 1234345L,
                                Especialidad.MEDICINA_GENERAL);
    

        
      
    

         Medico medico2 = new Medico(2,
                        "pepe", 
                      "lopez",
                                TipoIdentificacion.CC,
           1054456723L,
                 54321L,
                                Especialidad.CARDIOLOGIA);
    
       

        
        Paciente paciente1 = new Paciente(45,
                                     "juan",
                                              "perez",
                                       TipoIdentificacion.CC,
                        234234546,
                           "juanp@gmail.com",
                                               3116758032L,
                                            LocalDate.of(2005, 02, 21),
                                            1.64, 
                                                  156,
                                             TipoSangre.A,
                                             "-");
        
        Paciente paciente2 = new Paciente(46,
                                    "daniel",
                                  "zuñiga",
                                 TipoIdentificacion.CC, 
                      236534543,
                        "danielz@gmail.com",
                                          3154758054L, 
                                          LocalDate.of(2007, 03, 23), 
                                     1.64, 156, 
                                           TipoSangre.AB,
                                            "-");

    }

}