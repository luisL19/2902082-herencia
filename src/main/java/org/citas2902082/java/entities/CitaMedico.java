package org.citas2902082.java.entities;

import java.time.LocalDateTime;

import org.citas2902082.java.entities.enums.Estado;

public class CitaMedico extends Cita implements IAgendable{

        private String motivo;
        private Medico medico;
        private Estado estado;


        public CitaMedico(LocalDateTime fecha, Paciente paciente, String motivo, Medico medico, Estado estado) {
            super(id, fecha, paciente, consultorio);
            this.motivo = motivo;
            this.medico = medico;
            this.estado = estado;
        }


        public String getMotivo() {
            return motivo;
        }


        public void setMotivo(String motivo) {
            this.motivo = motivo;
        }


        public Medico getMedico() {
            return medico;
        }


        public void setMedico(Medico medico) {
            this.medico = medico;
        }


        public Estado getEstado() {
            return estado;
        }


        public void setEstado(Estado estado) {
            this.estado = estado;
        }


        @Override
        public void agendarCita(LocalDateTime fecha) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
        }


        @Override
        public void cancelarCita() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'cancelarCita'");
        }


        @Override
        public void reAgendarCita(LocalDateTime fecha) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'reAgendarCita'");
        }


       
        
       
}
