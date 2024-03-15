package org.citas2902082.java.entities;

import java.time.LocalDateTime;

import org.citas2902082.java.entities.enums.Estado;

public class CitaMedico extends Cita implements IAgendable{

        private String motivo;
        private Medico medico;
        private Estado estado;


        public CitaMedico(LocalDateTime fecha, Paciente paciente, String motivo, Medico medico) {
            super(fecha, paciente);
            this.motivo = motivo;
            this.medico = medico;
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


        @Override
        public void agendarCita(LocalDateTime fecha) {
            super.setFecha(fecha);
        }


        @Override
        public void cancelarCita() {
            this.estado = Estado.CANCELADA;
        }


        @Override
        public void reAgendarCita(LocalDateTime fecha) {
           super.setFecha(fecha);
        }
 
}
