package co.edu.uco.DAO;

import java.time.LocalDateTime;

public class CitaEntity {
    private String id;
    private LocalDateTime fechaCita;
    private String pacienteId;
    private String nombrePaciente;
    private String estadoId;
    private String estadoNombre;
    private LocalDateTime fechaEstado;
    private String medicoNombre;

    public CitaEntity(String id, LocalDateTime fechaCita, String pacienteId, String nombrePaciente, String estadoId, String estadoNombre, LocalDateTime fechaEstado, String medicoNombre) {
        setId(id);
        setFechaCita(fechaCita);
        setPacienteId(pacienteId);
        setNombrePaciente(nombrePaciente);
        setEstadoId(estadoId);
        setEstadoNombre(estadoNombre);
        setFechaEstado(fechaEstado);
        setMedicoNombre(medicoNombre);
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getFechaCita() {
        return fechaCita;
    }

    private void setFechaCita(LocalDateTime fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getPacienteId() {
        return pacienteId;
    }

    private void setPacienteId(String pacienteId) {
        this.pacienteId = pacienteId;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    private void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getEstadoId() {
        return estadoId;
    }

    private void setEstadoId(String estadoId) {
        this.estadoId = estadoId;
    }

    public String getEstadoNombre() {
        return estadoNombre;
    }

    private void setEstadoNombre(String estadoNombre) {
        this.estadoNombre = estadoNombre;
    }

    public LocalDateTime getFechaEstado() {
        return fechaEstado;
    }

    private void setFechaEstado(LocalDateTime fechaEstado) {
        this.fechaEstado = fechaEstado;
    }

    public String getMedicoNombre() {
        return medicoNombre;
    }

    private void setMedicoNombre(String medicoNombre) {
        this.medicoNombre = medicoNombre;
    }
}


