package co.edu.uco.DAO.postgres;

import co.edu.uco.DAO.CitaEntity;
import java.sql.*;
import java.util.ArrayList;
import co.edu.uco.DAO.DatabaseConnection;

public class CitaDAO {

    private Connection conn;

    public CitaDAO() {
        conn = DatabaseConnection.getConnection();
    }

    // Método para obtener todas las citas
    public ArrayList<CitaEntity> obtenerTodasLasCitas() throws SQLException {
        ArrayList<CitaEntity> citas = new ArrayList<>();
        String sql = "SELECT * FROM Medicare";
        try (PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                CitaEntity cita = new CitaEntity(
                        rs.getString("id"),
                        rs.getTimestamp("fecha").toLocalDateTime(),
                        rs.getString("paciente_id"),
                        rs.getString("nombre_paciente"),
                        rs.getString("estado_id"),
                        rs.getString("estado_nombre"),
                        rs.getTimestamp("fecha_estado").toLocalDateTime(),
                        rs.getString("medico_nombre")
                );
                citas.add(cita);
            }
        }
        return citas;
    }

    // Método para actualizar el estado de una cita en la base de datos
    public void actualizarEstado(CitaEntity citaEntity) throws SQLException {
        String sql = "UPDATE Cita SET estado_nombre = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, citaEntity.getEstadoNombre());
            pstmt.setString(2, citaEntity.getId());
            pstmt.executeUpdate();
        }
    }
}
