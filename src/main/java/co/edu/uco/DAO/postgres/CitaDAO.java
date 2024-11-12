package co.edu.uco.DAO.postgres;

import co.edu.uco.DAO.CitaEntity;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

import co.edu.uco.DAO.DatabaseConnection;

public class CitaDAO {

    private Connection conn;

    public CitaDAO() {
        conn = DatabaseConnection.getConnection();
    }

    // Método para obtener todas las citas
    public ArrayList<CitaEntity> obtenerTodasLasCitas() throws SQLException {
        ArrayList<CitaEntity> citas = new ArrayList<>();
        String sql = "SELECT c.id AS cita_id, c.fecha, p.id AS paciente_id, p.nombre AS nombre_paciente, medico AS medico_nombre, " +
                "p.direccion, p.telefono, r.tipo_estado_id AS estado_id, " +
                "te.nombre AS estado_nombre, r.fecha_registro AS fecha_estado " +
                "FROM Cita c " +
                "JOIN Paciente p ON c.paciente_id = p.id " +
                "JOIN RegistroEstadoCita r ON c.id = r.cita_id " +
                "JOIN TipoEstadoCita te ON r.tipo_estado_id = te.id " +
                "JOIN ( " +
                "    SELECT cita_id, MAX(fecha_registro) AS max_fecha " +
                "    FROM RegistroEstadoCita " +
                "    GROUP BY cita_id " +
                ") ultimo_estado ON r.cita_id = ultimo_estado.cita_id AND r.fecha_registro = ultimo_estado.max_fecha";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                CitaEntity cita = new CitaEntity(
                        UUID.fromString(rs.getString("cita_id")),
                        rs.getTimestamp("fecha").toLocalDateTime(),
                        UUID.fromString(rs.getString("paciente_id")),
                        rs.getString("nombre_paciente"),
                        UUID.fromString(rs.getString("estado_id")),
                        rs.getString("estado_nombre"),
                        rs.getTimestamp("fecha_estado").toLocalDateTime(),
                        rs.getString("medico_nombre")
                );
                citas.add(cita);
            }
        return citas;
    }

    // Método para actualizar el estado de una cita en la base de datos
    public void actualizarEstado(CitaEntity citaEntity) throws SQLException {
        String sql = "UPDATE Cita SET estado_nombre = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, citaEntity.getEstadoNombre());
            pstmt.setString(2, citaEntity.getId().toString());
            pstmt.executeUpdate();
        }
    }
}
