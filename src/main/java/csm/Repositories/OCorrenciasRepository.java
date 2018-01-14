package csm.Repositories;

import csm.DAO.Mappings.OcorrenciaRowMapper;
import csm.DAO.OcorrenciaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class OCorrenciasRepository {

    @Autowired
    private JdbcTemplate _template;

    @Transactional
    public List<OcorrenciaDAO> getOcorrencias(){
        String _query="select \"Ocorrencia\".\"id_Ocorrencia\" as numeroOcurrencia,\"Clientes\".\"Nome\" as nomeCliente,\"Funcionarios\".\"Nome\" as nomeFuncionario,\n" +
                "  \"Ocorrencia\".\"DataInicioOcorrencia\" as dataInicial, \"Ocorrencia\".\"DataFimOcorrencia\" as dataFinal,\n" +
                "\"Ocorrencia\".\"Terminado\" as Finalizado, \"Morada\".\"Rua\" as Rua,\n" +
                "  \"Codigo_Endereco\".\"CodigoPostal\",\"Codigo_Endereco\".\"Cidade\",\"Codigo_Endereco\".\"Concelho\",\n" +
                "  \"Codigo_Endereco\".\"Distrito\",\"Ocorrencia\".\"Descricao\" as sumarioOcorrencia\n" +
                "from \"Ocorrencia\"\n" +
                "INNER JOIN morada_ocorrencia  ON \"Ocorrencia\".\"id_Ocorrencia\" = \"morada_ocorrencia\".id_ocorrencia\n" +
                "INNER JOIN \"Morada\" on morada_ocorrencia.id_morada = \"Morada\".id_morada\n" +
                "INNER JOIN \"Codigo_Endereco\" on \"Morada\".id_codigo_endereco = \"Codigo_Endereco\".id_codigo_endereco\n" +
                "INNER JOIN \"Clientes\" on \"Ocorrencia\".\"id_Cliente\"= \"Clientes\".id_cliente\n" +
                "INNER JOIN \"Funcionarios\" on \"Ocorrencia\".\"id_Funcionario\"=\"Funcionarios\".id_funcionario\n" +
                "where \"Terminado\" IS TRUE\n" +
                "ORDER BY \"DataInicioOcorrencia\" asc;";


        return _template.query(_query,new OcorrenciaRowMapper());
    }
}
