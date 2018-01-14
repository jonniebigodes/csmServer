package csm.DAO.Mappings;

import csm.DAO.FuncionarioDAO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioRowMapper implements RowMapper<FuncionarioDAO> {
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
    public FuncionarioDAO mapRow(ResultSet rs, int rowNum) throws SQLException {
        FuncionarioDAO resultado = new FuncionarioDAO();
        resultado.setNumeroFuncionario(rs.getString("NumeroFuncionario"));
        resultado.setNomeFuncionario(rs.getString("Nome"));
        resultado.setNif(rs.getInt("NIF"));
        resultado.setEmail(rs.getString("Email"));
        resultado.setIban(rs.getString("IBAN"));
        resultado.setRua(rs.getString("Rua"));
        resultado.setCodigopostal(rs.getString("CodigoPostal"));
        resultado.setCidade(rs.getString("Cidade"));
        resultado.setConcelho(rs.getString("Concelho"));
        resultado.setDistrito(rs.getString("Distrito"));
        return resultado;
    }
}
