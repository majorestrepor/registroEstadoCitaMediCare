package co.edu.uco.DAO.postgres;

import co.edu.uco.DAO.DatabaseConnection;
import co.edu.uco.DAO.RegistroEstadoCitaEntity;

import java.sql.*;

public class RegistroEstadoCitaDAO {
    private Connection conn;
    private Statement stmt;
    public RegistroEstadoCitaDAO() throws SQLException {
        conn = DatabaseConnection.getConnection();
        stmt = conn.createStatement();
    }
    public void crear(RegistroEstadoCitaEntity entity) throws SQLException{
        String sql = "INSERT INTO registroestadocita (id, cita_id, tipo_estado_id, fecha_registro) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setObject(1, entity.getId());
        pstmt.setObject(2, entity.getIdCita());
        pstmt.setObject(3, entity.getIdEstado());
        pstmt.setTimestamp(4, Timestamp.valueOf(entity.getFechaRegistro()));
        int filasInsertadas = pstmt.executeUpdate();
        if (filasInsertadas > 0) {
            System.out.println("Registro insertado exitosamente en la tabla registro_estado_cita.");
        }
    }
}
