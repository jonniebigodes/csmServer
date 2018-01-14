package csm.DAO.DTO;

import csm.DAO.FaturaDAO;

import java.util.List;

public class RespostaFatura {

    private int id;

    private String mensagem;

    private List<FaturaDAO>listaFaturas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public List<FaturaDAO> getListaFaturas() {
        return listaFaturas;
    }

    public void setListaFaturas(List<FaturaDAO> listaFaturas) {
        this.listaFaturas = listaFaturas;
    }

    public RespostaFatura(){}

    public RespostaFatura(int id, String mensagem, List<FaturaDAO> listaFaturas) {
        this.id = id;
        this.mensagem = mensagem;
        this.listaFaturas = listaFaturas;
    }
}
