package csm.DAO.Mappings;

import csm.DAO.FaturaDAO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 */
public class FaturaRowMapper implements RowMapper<FaturaDAO> {


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
    public FaturaDAO mapRow(ResultSet rs, int rowNum) throws SQLException {
        FaturaDAO resultado= new FaturaDAO();
        resultado.setNumerofatura(rs.getString("numeroFactura"));
        resultado.setNumerocliente(rs.getString("numeroCliente"));
        resultado.setRua(rs.getString("Rua"));
        resultado.setCodigopostal(rs.getString("CodigoPostal"));
        resultado.setCidade(rs.getString("Cidade"));
        resultado.setConcelho(rs.getString("Concelho"));
        resultado.setDistrito(rs.getString("Distrito"));
        resultado.setNomecliente(rs.getString("nomeCliente"));
        resultado.setContacto(rs.getString("contacto"));
        resultado.setNumerofuncionario(rs.getString("numeroFuncionario"));
        resultado.setNomefuncionario(rs.getString("nomeFuncionario"));
        resultado.setIva(rs.getBigDecimal("taxaIva"));
        resultado.setValorbruto(rs.getBigDecimal("valorBruto"));
        resultado.setValor(rs.getBigDecimal("Valor"));
        return resultado;
    }
}
