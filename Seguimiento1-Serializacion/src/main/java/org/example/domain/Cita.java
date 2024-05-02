package org.example.domain;

import java.io.Serializable;

public class Cita implements Serializable {
    private static final long serialVersionUID = 1L;
    Paciente paciente;
    String fecha, hora, motivo;
    public Cita(){}

    public Cita(Paciente paciente, String fecha, String hora, String motivo) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
