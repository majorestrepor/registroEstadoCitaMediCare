package co.edu.uco.DTO;

import java.time.LocalDateTime;

public class CitaDTO {
    private String id;
    private LocalDateTime fecha;
    private String pacienteId;
    private String paciente;
    private String estadoId;
    private String estadoActual;
    private String doctor;

    public CitaDTO(String id, LocalDateTime fechaCita, String pacienteId, String nombrePaciente, String estadoId, String estadoNombre, String medicoNombre) {
        setId(id);
        setFecha(fechaCita);
        setPacienteId(pacienteId);
        setPaciente(nombrePaciente);
        setEstadoId(estadoId);
        setEstadoActual(estadoNombre);
        setDoctor(medicoNombre);
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    private void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getPacienteId() {      // Agrega el getter para pacienteId
        return pacienteId;
    }

    public void setPacienteId(String pacienteId) {   // Agrega el setter para pacienteId
        this.pacienteId = pacienteId;
    }

    public String getPaciente() {
        return paciente;
    }

    private void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getEstadoId() {
        return estadoId;
    }

    private void setEstadoId(String estadoId) {
        this.estadoId = estadoId;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    public String getDoctor() {
        return doctor;
    }

    private void setDoctor(String doctor) {
        this.doctor = doctor;
    }
}
