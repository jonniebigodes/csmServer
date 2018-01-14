package csm.Repositories;

import csm.DAO.LinhaFaturaDAO;
import csm.DAO.Mappings.LinhaFaturaRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class LinhasRepository {
    @Autowired
    private JdbcTemplate _template;


    @Transactional
    public List<LinhaFaturaDAO> getLinhas(){
        String _query="select \"id_linha\" as numeroLinha,\"id_factura\" as numeroFatura,\"id_tipo_servico\" as idServico from linhas_factura;";
        return _template.query(_query,new LinhaFaturaRowMapper());
    }
}
