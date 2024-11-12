package co.edu.uco.DTO;

public class TipoEstadoCitaDTO {
    private String id;
    private String nombre;

    public TipoEstadoCitaDTO(String id, String nombre) {
        setId(id);
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }
}
