package co.edu.uco.DTO;

public class RegistroEstadoCitaDTO {
    String idCita;
    String idNuevoEstado;
    String idAnteriorEstado;

    public RegistroEstadoCitaDTO(String idCita, String idEstado, String idAnteriorEstado) {
        this.idCita = idCita;
        this.idNuevoEstado = idEstado;
        this.idAnteriorEstado = idAnteriorEstado;
    }

    public String getIdCita() {
        return idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public String getIdNuevoEstado() {
        return idNuevoEstado;
    }

    public void setIdNuevoEstado(String idNuevoEstado) {
        this.idNuevoEstado = idNuevoEstado;
    }

    public void setEstado(String programada) {
    }

    public String getIdAnteriorEstado() {
        return idAnteriorEstado;
    }

    public void setIdAnteriorEstado(String idAnteriorEstado) {
        this.idAnteriorEstado = idAnteriorEstado;
    }
}
