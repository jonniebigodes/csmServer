package csm.DAO.DTO;


import csm.DAO.OcorrenciaDAO;

import java.util.List;

public class RespostaOcorrencia {
    private int id;

    private String mensagem;
    private List<OcorrenciaDAO> listaOcorrenciass;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String value) {
        this.mensagem = value;
    }

    public List<OcorrenciaDAO> getlistaOcorrencias() {
        return listaOcorrenciass;
    }

    public void setlistaOcorrencias(List<OcorrenciaDAO> value) {
        this.listaOcorrenciass = value;
    }
}
