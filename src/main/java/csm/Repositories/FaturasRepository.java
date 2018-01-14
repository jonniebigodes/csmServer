package csm.Repositories;


import csm.DAO.FaturaDAO;
import csm.DAO.Mappings.FaturaRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class FaturasRepository {
    @Autowired
    private JdbcTemplate _template;


    @Transactional
    public List<FaturaDAO> getallfaturas(){
        String _query="select \"Factura\".id_factura as numeroFactura,\n" +
                "  \"Factura\".id_cliente as numeroCliente,\n" +
                "  \"Morada\".\"Rua\" as Rua,\n" +
                "  \"Codigo_Endereco\".\"CodigoPostal\",\"Codigo_Endereco\".\"Cidade\",\"Codigo_Endereco\".\"Concelho\",\n" +
                "  \"Codigo_Endereco\".\"Distrito\",\n" +
                "  \"Clientes\".\"Nome\" as nomeCliente,\n" +
                "  \"Clientes\".\"Email\" as contacto,\n" +
                "  \"Funcionarios\".id_funcionario as numeroFuncionario,\n" +
                "  \"Funcionarios\".\"Nome\" as nomeFuncionario,\n" +
                "  \"Factura\".\"ValorIva\" as taxaIva,\n" +
                "  \"Factura\".\"ValorSemIva\"::numeric as valorBruto,\n" +
                "  \"Factura\".\"ValorFinal\"::numeric as Valor\n" +
                "from \"Factura\"\n" +
                "INNER JOIN morada_ocorrencia  ON \"Factura\".\"id_ocorrencia\" = \"morada_ocorrencia\".id_ocorrencia\n" +
                "INNER JOIN \"Morada\" on morada_ocorrencia.id_morada = \"Morada\".id_morada\n" +
                "INNER JOIN \"Codigo_Endereco\" on \"Morada\".id_codigo_endereco = \"Codigo_Endereco\".id_codigo_endereco\n" +
                "INNER JOIN \"Clientes\" on \"Factura\".id_cliente= \"Clientes\".id_cliente\n" +
                "INNER JOIN \"Funcionarios\" on \"Factura\".id_funcionario=\"Funcionarios\".id_funcionario;";

        return _template.query(_query,new FaturaRowMapper());
    }
}
