package co.edu.uco.DAO;

import java.time.LocalDateTime;
import java.util.UUID;

public class CitaEntity {
    private UUID id;
    private LocalDateTime fechaCita;
    private UUID pacienteId;
    private String nombrePaciente;
    private UUID estadoId;
    private String estadoNombre;
    private LocalDateTime fechaEstado;
    private String medicoNombre;

    public CitaEntity(UUID id, LocalDateTime fechaCita, UUID pacienteId, String nombrePaciente, UUID estadoId, String estadoNombre, LocalDateTime fechaEstado, String medicoNombre) {
        setId(id);
        setFechaCita(fechaCita);
        setPacienteId(pacienteId);
        setNombrePaciente(nombrePaciente);
        setEstadoId(estadoId);
        setEstadoNombre(estadoNombre);
        setFechaEstado(fechaEstado);
        setMedicoNombre(medicoNombre);
    }

    public UUID getId() {
        return id;
    }

    private void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getFechaCita() {
        return fechaCita;
    }

    private void setFechaCita(LocalDateTime fechaCita) {
        this.fechaCita = fechaCita;
    }

    public UUID getPacienteId() {
        return pacienteId;
    }

    private void setPacienteId(UUID pacienteId) {
        this.pacienteId = pacienteId;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    private void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public UUID getEstadoId() {
        return estadoId;
    }

    private void setEstadoId(UUID estadoId) {
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


