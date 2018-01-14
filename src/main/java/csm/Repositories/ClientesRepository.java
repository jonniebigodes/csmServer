package csm.Repositories;

import csm.DAO.ClienteDAO;
import csm.DAO.Mappings.ClienteRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ClientesRepository {
    @Autowired
    private JdbcTemplate _template;

    @Transactional
    public List<ClienteDAO> getall(){
        String _tmpquery="select distinct \"Clientes\".id_cliente as ID,\"Nome\",\"NIF\",\"Email\",\"Morada\".\"Rua\" as Rua,\n" +
                "  \"Codigo_Endereco\".\"CodigoPostal\",\"Codigo_Endereco\".\"Cidade\",\"Codigo_Endereco\".\"Concelho\",\n" +
                "  \"Codigo_Endereco\".\"Distrito\"\n" +
                "from \"Clientes\"\n" +
                "INNER JOIN morada_cliente  ON \"Clientes\".id_cliente = \"morada_cliente\".id_cliente\n" +
                "INNER JOIN \"Morada\" on morada_cliente.id_morada = \"Morada\".id_morada\n" +
                "INNER JOIN \"Codigo_Endereco\" on \"Morada\".id_codigo_endereco = \"Codigo_Endereco\".id_codigo_endereco;";

        return _template.query(_tmpquery, new ClienteRowMapper());
    }
}
