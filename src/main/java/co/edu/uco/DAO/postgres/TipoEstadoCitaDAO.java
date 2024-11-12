package co.edu.uco.DAO.postgres;

import co.edu.uco.DAO.TipoEstadoCitaEntity;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;
import co.edu.uco.DAO.DatabaseConnection;


public class TipoEstadoCitaDAO {
    private static final Logger LOGGER = Logger.getLogger(TipoEstadoCitaDAO.class.getName());
    private Connection conn;

    public TipoEstadoCitaDAO() {
        conn = DatabaseConnection.getConnection();
    }

    public ArrayList<TipoEstadoCitaEntity> obtenerTodosLosEstados() throws SQLException {
        ArrayList<TipoEstadoCitaEntity> tipoEstadoCitas = new ArrayList<>();
        String sql = "SELECT * FROM tipoestadocita";
        try (PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                TipoEstadoCitaEntity tipoEstadoCita = new TipoEstadoCitaEntity(
                        rs.getString("id"),
                        rs.getString("nombre")
                );
                tipoEstadoCitas.add(tipoEstadoCita);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error al obtener tipos de estado de citas: " + e.getMessage(), e);
            throw e;
        }
        return tipoEstadoCitas;
    }
}
