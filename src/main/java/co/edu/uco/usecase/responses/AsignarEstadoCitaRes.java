package co.edu.uco.usecase.responses;

public class AsignarEstadoCitaRes {
    private String Mensaje;

    public AsignarEstadoCitaRes(String mensaje) {
        setMensaje(mensaje);
    }

    public String getMensaje() {
        return Mensaje;
    }

    private void setMensaje(String mensaje) {
        Mensaje = mensaje;
    }
}
