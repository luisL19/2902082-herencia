package org.citas2902082.java.entities;

import java.time.LocalDateTime;

public class CitaEnfermero extends Cita implements IAgendable{

    private String procedimiento;
    private Enfermero enfermero;


    
    public CitaEnfermero(LocalDateTime fecha, Paciente paciente, String procedimiento, Enfermero enfermero) {
        super(id, fecha, paciente, consultorio);
        this.procedimiento = procedimiento;
        this.enfermero = enfermero;
    }



    public String getProcedimiento() {
        return procedimiento;
    }



    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }



    public Enfermero getEnfermero() {
        return enfermero;
    }



    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }



    @Override
    public void agendarCita(LocalDateTime fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }



    @Override
    public void cancelarCita() {
        System.
        out.
        println("CITA DE ENFERMERIA CANCELADA");
    }



    @Override
    public void reAgendarCita(LocalDateTime fecha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reAgendarCita'");
    }

    
    
    

}
