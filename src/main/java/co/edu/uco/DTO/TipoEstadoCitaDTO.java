package co.edu.uco.DTO;

public class TipoEstadoCitaDTO {
    private String id;
    private String descripcion;

    public TipoEstadoCitaDTO(String id, String nombre) {
        setId(id);
        setDescripcion(nombre);
    }

    public String getDescripcion() {
        return descripcion;
    }

    private void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }
}
