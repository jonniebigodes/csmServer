package csm.Controllers;


import csm.DAO.ClienteDAO;
import csm.DAO.DTO.RespostaCliente;
import csm.Repositories.ClientesRepository;
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
public class ClientesController {

    @Autowired
    private ClientesRepository _repocliente;

    @RequestMapping(value = "/api/clientes/getclientes",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RespostaCliente> getALLClientes(){
        List<ClienteDAO> resultado= _repocliente.getall();
        RespostaCliente resposta= new RespostaCliente();
        if (!resultado.isEmpty()){
            resposta.setId(200);
            resposta.setMensagem("DATA_OK");
            resposta.setListaClientes(resultado);
            return new ResponseEntity<RespostaCliente>(resposta, HttpStatus.OK);
        }
        resposta.setId(204);
        resposta.setMensagem("NO_DATA");
        return new ResponseEntity<RespostaCliente>(resposta,HttpStatus.NO_CONTENT);
    }
}
