package co.edu.uco.controladores;
import co.edu.uco.DTO.RegistroEstadoCitaDTO;
import co.edu.uco.servicios.ServicioRegistroEstadoCita;
import org.springframework.web.bind.annotation.*;
import java.sql.SQLException;

@RestController
@RequestMapping(value = "/registro-estado-cita")
public class RegistroEstadoCitaController {

    private final ServicioRegistroEstadoCita servicioRegistroEstadoCita;

    public RegistroEstadoCitaController() throws SQLException {
        servicioRegistroEstadoCita = new ServicioRegistroEstadoCita();
    }

    @RequestMapping(value = "/asignar-estado-cita", method = RequestMethod.POST)
    @ResponseBody
    public void asignarEstadoCita(@RequestBody RegistroEstadoCitaDTO registroEstadoCitaDTO) throws SQLException {
        servicioRegistroEstadoCita.asignarEstadoCita(registroEstadoCitaDTO);
    }
}
