package co.edu.uco.DTO;

public class RegistroEstadoCitaDTO {
    String idCita;
    String idEstado;

    public RegistroEstadoCitaDTO() {}
    public RegistroEstadoCitaDTO(String idCita, String idEstado) {
        this.idCita = idCita;
        this.idEstado = idEstado;
    }

    public String getIdCita() {
        return idCita;
    }

    public void setIdCita(String idCita) {
        this.idCita = idCita;
    }

    public String getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(String idEstado) {
        this.idEstado = idEstado;
    }

    public void setEstado(String programada) {
    }
}
