package csm.DAO.Mappings;

import csm.DAO.ClienteDAO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteRowMapper implements RowMapper<ClienteDAO>{

    /**
     * Implementations must implement this method to map each row of data
     * in the ResultSet. This method should not call {@code next()} on
     * the ResultSet; it is only supposed to map values of the current row.
     *
     * @param rs     the ResultSet to map (pre-initialized for the current row)
     * @param rowNum the number of the current row
     * @return the result object for the current row (may be {@code null})
     * @throws SQLException if a SQLException is encountered getting
     *                      column values (that is, there's no need to catch SQLException)
     */
    @Override
    public ClienteDAO mapRow(ResultSet rs, int rowNum) throws SQLException {
        ClienteDAO resultado= new ClienteDAO();
        resultado.set_id(rs.getString("ID"));
        resultado.set_nome(rs.getString("Nome"));
        resultado.set_nif(rs.getInt("NIF"));
        resultado.set_email(rs.getString("Email"));
        resultado.set_rua(rs.getString("Rua"));
        resultado.set_codigopostal(rs.getString("CodigoPostal"));
        resultado.set_cidade(rs.getString("Cidade"));
        resultado.set_concelho(rs.getString("Concelho"));
        resultado.set_distrito(rs.getString("Distrito"));
        return resultado;
    }
}
