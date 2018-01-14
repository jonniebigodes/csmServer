package csm.Controllers;


import csm.DAO.ConteudoFaturaDAO;
import csm.DAO.DTO.RespostaRecibo;
import csm.DAO.LinhaFaturaDAO;
import csm.DAO.ReciboDAO;
import csm.DAO.TipoServicoDAO;
import csm.Repositories.LinhasRepository;
import csm.Repositories.RecibosRepository;
import csm.Repositories.TiposServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@CrossOrigin(origins = {"*"}, maxAge = 6000)
public class RecibosController {


    @Autowired
    private RecibosRepository _repo;

    @Autowired
    LinhasRepository _repolinhas;

    @Autowired
    TiposServicoRepository _repoServicos;


    private TipoServicoDAO getDescServico(List<TipoServicoDAO> valueServicos, String valueTipo){
        if (valueServicos.isEmpty()){
            return null;
        }
        for (TipoServicoDAO item:valueServicos){
            if (item.getIdServico().equals(valueTipo)){
                return item;
            }
        }
        return null;
    }

    private double calculoValorFinal(Number valorIva,BigDecimal valorServico){

        DecimalFormat df= new DecimalFormat("###,###.##");
        double tmp= valorServico.doubleValue();
        double iva= valorIva.doubleValue();


        double result= tmp*iva;
        double valorFinal= tmp+result;
        System.out.println("result: " +result+" valor final:"+valorFinal+ " formatted: "+ df.format(valorFinal));
        return valorFinal;
    }

    @RequestMapping(value="/api/recibos/getrecibos", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RespostaRecibo> getallRecibos(){
        List<ReciboDAO> resultado= _repo.getRecibos();
        List<LinhaFaturaDAO> dadosLinhas= _repolinhas.getLinhas();
        List<TipoServicoDAO> dadosServico= _repoServicos.getTiposServico();
        RespostaRecibo resposta= new RespostaRecibo();
        if (resultado.isEmpty()){
            resposta.setId(204);
            resposta.setMensagem("NO_DATA");
            return new ResponseEntity<RespostaRecibo>(resposta, HttpStatus.NO_CONTENT);
        }

        for (ReciboDAO item:resultado){
            ArrayList<ConteudoFaturaDAO> dadosConteudoFatura= new ArrayList<ConteudoFaturaDAO>();
            for (LinhaFaturaDAO linha:dadosLinhas){
                //System.out.println("fatura id:"+ item.getNumerofatura()+" linha idfatura: "+ linha.getIdfatura());
                if (item.getNumerofatura().equals(linha.getIdfatura())){
                    //System.out.println("Entered equal fatura id:"+ item.getNumerofatura()+" linha idfatura: "+ linha.getIdfatura());
                    TipoServicoDAO infoServico= getDescServico(dadosServico,linha.getIdservico());
                    ConteudoFaturaDAO itemLinha= new ConteudoFaturaDAO();
                    itemLinha.setIdservico(linha.getIdservico());
                    if (Objects.isNull(infoServico)){
                        itemLinha.setDescricaotiposervico("NAN");
                        itemLinha.setValorServico(new BigDecimal(0));
                        itemLinha.setValorIva(0);
                        itemLinha.setValorFinal(0);
                    }
                    else{

                        itemLinha.setDescricaotiposervico(infoServico.getDescricao());
                        itemLinha.setValorServico(infoServico.getValor());

                        itemLinha.setValorIva(0.23);
                        itemLinha.setValorFinal(calculoValorFinal(0.23,infoServico.getValor()));
                    }
                    dadosConteudoFatura.add(itemLinha);
                }
            }
            item.setDadosRecibo(dadosConteudoFatura);
        }

        resposta.setId(200);
        resposta.setMensagem("DATA_OK");
        resposta.setListaRecibos(resultado);
        return new ResponseEntity<RespostaRecibo>(resposta, HttpStatus.OK);
    }
}
