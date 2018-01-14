package csm.Repositories;


import csm.DAO.FuncionarioDAO;
import csm.DAO.Mappings.FuncionarioRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class FuncionariosRepository {

    @Autowired
    private JdbcTemplate _template;


    @Transactional
    public List<FuncionarioDAO> getAllFuncionarios(){

        String _tmpquery= "select distinct \"Funcionarios\".id_funcionario as NumeroFuncionario,\"Nome\",\"NIF\",\"Email\",\"IBAN\",\"Morada\".\"Rua\" as Rua,\n" +
                "  \"Codigo_Endereco\".\"CodigoPostal\",\"Codigo_Endereco\".\"Cidade\",\"Codigo_Endereco\".\"Concelho\",\n" +
                "  \"Codigo_Endereco\".\"Distrito\"\n" +
                "from \"Funcionarios\"\n" +
                "INNER JOIN morada_funcionario  ON \"Funcionarios\".id_funcionario = \"morada_funcionario\".id_funcionario\n" +
                "INNER JOIN \"Morada\" on morada_funcionario.id_morada = \"Morada\".id_morada\n" +
                "INNER JOIN \"Codigo_Endereco\" on \"Morada\".id_codigo_endereco = \"Codigo_Endereco\".id_codigo_endereco;";

        return _template.query(_tmpquery,new FuncionarioRowMapper());
    }
}
