package csm.Controllers;

import csm.DAO.DTO.RespostaOcorrencia;
import csm.DAO.OcorrenciaDAO;
import csm.Repositories.OCorrenciasRepository;
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
public class OcorrenciasController {

    @Autowired
    private OCorrenciasRepository _repo;

    @RequestMapping(value="/api/ocorrencias/getocorrencias",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RespostaOcorrencia> getOcorrencias(){
        List<OcorrenciaDAO> resultado= _repo.getOcorrencias();
        RespostaOcorrencia resposta= new RespostaOcorrencia();

        if (!resultado.isEmpty()){
            resposta.setId(200);
            resposta.setMensagem("DATA_OK");
            resposta.setlistaOcorrencias(resultado);
            return new ResponseEntity<RespostaOcorrencia>(resposta, HttpStatus.OK);
        }
        resposta.setId(204);
        resposta.setMensagem("NO_DATA");
        return new ResponseEntity<RespostaOcorrencia>(resposta,HttpStatus.NO_CONTENT);
    }
}
