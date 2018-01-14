package csm.DAO.Mappings;

import csm.DAO.OcorrenciaDAO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class OcorrenciaRowMapper implements RowMapper<OcorrenciaDAO> {


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
    public OcorrenciaDAO mapRow(ResultSet rs, int rowNum) throws SQLException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        OcorrenciaDAO resultado= new OcorrenciaDAO();
        resultado.setNumeroocorrencia(rs.getString("numeroOcurrencia"));
        resultado.setNomecliente(rs.getString("nomeCliente"));
        resultado.setNomefuncionario(rs.getString("nomeFuncionario"));
        resultado.setDatainicial(sdf.format(rs.getTimestamp("dataInicial")) );
        resultado.setDatafinal(sdf.format(rs.getTimestamp("dataFinal")));
        resultado.setFinalizado(rs.getBoolean("Finalizado"));
        resultado.setRua(rs.getString("Rua"));
        resultado.setCodigopostal(rs.getString("CodigoPostal"));
        resultado.setCidade(rs.getString("Cidade"));
        resultado.setConcelho(rs.getString("Concelho"));
        resultado.setDistrito(rs.getString("Distrito"));
        resultado.setSumario(rs.getString("sumarioOcorrencia"));
        return resultado;
    }
}
