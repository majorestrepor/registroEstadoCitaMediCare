package co.edu.uco.controladores;

import co.edu.uco.DTO.CitaDTO;
import co.edu.uco.servicios.ServicioCita;
import co.edu.uco.usecase.exceptions.InvalidFieldFormatException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/cita")
@CrossOrigin(origins = "*")
public class CitaController {

    private final ServicioCita servicioCita;

    public CitaController(ServicioCita servicioCita) {
        this.servicioCita = servicioCita;
    }

    // Endpoint para obtener todas las citas
    @GetMapping(value = "/obtener-citas")
    public ResponseEntity<ArrayList<CitaDTO>> obtenerCitas() {
        try {
            ArrayList<CitaDTO> citas = servicioCita.obtenerCitas();
            return ResponseEntity.ok(citas);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ArrayList<>());
        }
    }

    // Endpoint para actualizar el estado de la cita
    @PutMapping(value = "/actualizar-estado")
    public ResponseEntity<String> actualizarEstadoCita(@RequestBody CitaDTO citaDTO,
                                                       @RequestParam String nuevoEstado) {
        try {
            servicioCita.actualizarEstadoCita(citaDTO, nuevoEstado);
            return ResponseEntity.ok("Estado de la cita actualizado correctamente");
        } catch (InvalidFieldFormatException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
        } catch (SQLException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al actualizar el estado en la base de datos: " + e.getMessage());
        }
    }
}
