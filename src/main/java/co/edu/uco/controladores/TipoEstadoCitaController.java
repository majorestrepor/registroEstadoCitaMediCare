package co.edu.uco.controladores;

import co.edu.uco.DTO.TipoEstadoCitaDTO;
import co.edu.uco.servicios.ServicioTipoEstadoCita;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/tipo-estado-cita")
public class TipoEstadoCitaController {

    private final ServicioTipoEstadoCita servicioTipoEstadoCita;

    public TipoEstadoCitaController() throws SQLException {
        servicioTipoEstadoCita = new ServicioTipoEstadoCita();
    }

    @RequestMapping(value = "/obtener-tipos-estado-cita", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<TipoEstadoCitaDTO> obtenerTiposEstadoCita() throws SQLException {
        return servicioTipoEstadoCita.obtenerEstadosCita();
    }

}
