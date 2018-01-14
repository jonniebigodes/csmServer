package csm.DAO.DTO;

import csm.DAO.ReciboDAO;

import java.util.List;

public class RespostaRecibo {
    private int id;

    private String mensagem;
    private List<ReciboDAO> listaRecibos;

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

    public List<ReciboDAO> getListaRecibos() {
        return listaRecibos;
    }

    public void setListaRecibos(List<ReciboDAO> listaRecibos) {
        this.listaRecibos = listaRecibos;
    }


}
