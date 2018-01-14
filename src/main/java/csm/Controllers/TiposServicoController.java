package csm.Controllers;

import csm.DAO.DTO.RespostaTipoServico;
import csm.DAO.TipoServicoDAO;
import csm.Repositories.TiposServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"}, maxAge = 6000)
public class TiposServicoController {
    @Autowired
    private TiposServicoRepository _repo;

    @RequestMapping(value="/api/servicos/gettipos",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RespostaTipoServico> gettiposservico(){
        List<TipoServicoDAO> resultado= _repo.getTiposServico();
        RespostaTipoServico resposta= new RespostaTipoServico();
        if (!resultado.isEmpty()){
            resposta.setId(200);
            resposta.setMensagem("DATA_OK");
            resposta.setListaTipos(resultado);
            return new ResponseEntity<RespostaTipoServico>(resposta, HttpStatus.OK);
        }
        resposta.setId(204);
        resposta.setMensagem("NO_DATA");
        return new ResponseEntity<RespostaTipoServico>(resposta,HttpStatus.NO_CONTENT);
    }
}
