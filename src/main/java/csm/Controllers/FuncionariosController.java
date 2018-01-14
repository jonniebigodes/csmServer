package csm.Controllers;

import csm.DAO.DTO.RespostaFuncionario;
import csm.DAO.FuncionarioDAO;
import csm.Repositories.FuncionariosRepository;
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
public class FuncionariosController {
    @Autowired
    private FuncionariosRepository _repo;


    @RequestMapping(value = "/api/funcionarios/getfuncionarios",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RespostaFuncionario> getallFuncionarios(){
        List<FuncionarioDAO> resultado= _repo.getAllFuncionarios();
        RespostaFuncionario resposta= new RespostaFuncionario();
        if (!resultado.isEmpty()){
            resposta.setId(200);
            resposta.setMensagem("DATA_OK");
            resposta.setListaFuncionarios(resultado);
            return new ResponseEntity<RespostaFuncionario>(resposta, HttpStatus.OK);
        }
        resposta.setId(204);
        resposta.setMensagem("NO_DATA");
        return new ResponseEntity<RespostaFuncionario>(resposta,HttpStatus.NO_CONTENT);
    }
}
