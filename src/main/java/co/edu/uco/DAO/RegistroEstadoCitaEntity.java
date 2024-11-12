package co.edu.uco.DAO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class RegistroEstadoCitaEntity {
    private UUID idCita;
    private UUID idEstado;
    private UUID Id;
    private LocalDateTime fechaRegistro;

    public RegistroEstadoCitaEntity(UUID idEstado, UUID idCita, UUID id, LocalDateTime fechaRegistro) {
        setIdEstado(idEstado);
        setIdCita(idCita);
        setId(id);
        setFechaRegistro(fechaRegistro);
    }

    public UUID getIdCita() {
        return idCita;
    }

    private void setIdCita(UUID idCita) {
        this.idCita = idCita;
    }

    public UUID getIdEstado() {
        return idEstado;
    }

    private void setIdEstado(UUID idEstado) {
        this.idEstado = idEstado;
    }

    public UUID getId() {
        return Id;
    }

    private void setId(UUID id) {
        Id = id;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    private void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
