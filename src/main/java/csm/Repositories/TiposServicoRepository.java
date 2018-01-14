package csm.Repositories;

import csm.DAO.Mappings.TipoServicoRowMapper;
import csm.DAO.TipoServicoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class TiposServicoRepository {
    @Autowired
    private JdbcTemplate _template;

    @Transactional
    public List<TipoServicoDAO> getTiposServico(){
        String _query="select \"Tipos_Servico\".id_tipo_servico as idServico,\"Tipos_Servico\".descricao,\"Custo\".valor::numeric\n" +
                "from \"Tipos_Servico\"\n" +
                "INNER JOIN custo_servico_tipo ON \"Tipos_Servico\".id_tipo_servico = \"custo_servico_tipo\".id_tipo_servico\n" +
                "INNER JOIN \"Custo\" on \"custo_servico_tipo\".id_custo= \"Custo\".id_custo\n" +
                "ORDER BY idServico desc;";

        return _template.query(_query,new TipoServicoRowMapper());
    }
}
