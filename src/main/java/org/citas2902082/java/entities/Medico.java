package org.citas2902082.java.entities;

import org.citas2902082.java.entities.enums.Especialidad;
import org.citas2902082.java.entities.enums.TipoIdentificacion;

public class Medico extends Usuario{

     private Long registroMedico;
     private Especialidad especialidad;


    public Medico(Integer id, 
            String nombres, 
            String apellidos, 
            TipoIdentificacion tipoIdentificacion,
            Long numeroIdentidicacion, 
            Long registroMedico, 
            Especialidad especialidad) {
        //constructor de la clase padre
        //en un contructor de clase hija
        //es lo primero que debe aparecer
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentidicacion);
        //inicializar los atributos propios de la clase padre

        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }


    public Long getRegistroMedico() {
        return registroMedico;
    }


    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }


    public Especialidad getEspecialidad() {
        return especialidad;
    }


    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }


    @Override
    public String toString() {
        return
        super.toString() + "Medico [registroMedico=" + registroMedico + ", especialidad=" + especialidad + "]";
    }
     
     
}
