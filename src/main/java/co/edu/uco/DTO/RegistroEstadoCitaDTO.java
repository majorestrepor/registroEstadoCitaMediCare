package co.edu.uco.DTO;

public class RegistroEstadoCitaDTO {
    String idCita;
    String idNuevoEstado;

    public RegistroEstadoCitaDTO() {}
    public RegistroEstadoCitaDTO(String idCita, String idEstado) {
        this.idCita = idCita;
        this.idNuevoEstado = idEstado;
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
}
