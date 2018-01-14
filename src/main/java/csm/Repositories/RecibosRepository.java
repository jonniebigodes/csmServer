package csm.Repositories;

import csm.DAO.Mappings.ReciboRowMapper;
import csm.DAO.ReciboDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class RecibosRepository {

    @Autowired
    private JdbcTemplate _template;



    @Transactional
    public List<ReciboDAO> getRecibos(){
        String _query="select \"Recibos\".\"id_Recibo\" as numeroRecibo,\n" +
                "  \"Recibos\".\"id_Factura\" as numeroFactura,\n" +
                "  \"Recibos\".\"id_Cliente\" as numeroCliente,\n" +
                "  \"Clientes\".\"Nome\" as nomeCliente,\n" +
                "  \"Clientes\".\"Email\" as contacto,\n" +
                "  \"Recibos\".\"id_Funcionario\" as numeroFuncionario,\n" +
                "  \"Funcionarios\".\"Nome\" as nomeFuncionario,\n" +
                "  \"Morada\".\"Rua\" as Rua,\n" +
                "  \"Codigo_Endereco\".\"CodigoPostal\",\"Codigo_Endereco\".\"Cidade\",\"Codigo_Endereco\".\"Concelho\",\n" +
                "  \"Codigo_Endereco\".\"Distrito\",\n" +
                "  \"Recibos\".\"ValorIva\" as taxaIva,\n" +
                "  \"Recibos\".\"ValorSemIva\"::numeric as valorBruto,\n" +
                "  \"Recibos\".\"ValorFinal\"::numeric as Valor\n" +
                "from \"Recibos\"\n" +
                "INNER JOIN morada_ocorrencia  ON \"Recibos\".\"id_Ocorrencia\" = \"morada_ocorrencia\".id_ocorrencia\n" +
                "INNER JOIN \"Morada\" on morada_ocorrencia.id_morada = \"Morada\".id_morada\n" +
                "INNER JOIN \"Codigo_Endereco\" on \"Morada\".id_codigo_endereco = \"Codigo_Endereco\".id_codigo_endereco\n" +
                "INNER JOIN \"Clientes\" on \"Recibos\".\"id_Cliente\"= \"Clientes\".id_cliente\n" +
                "INNER JOIN \"Funcionarios\" on \"Recibos\".\"id_Funcionario\"=\"Funcionarios\".id_funcionario;";

        return _template.query(_query, new ReciboRowMapper());
    }
}
