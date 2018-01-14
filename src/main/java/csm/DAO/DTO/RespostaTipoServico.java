package csm.DAO.DTO;

import csm.DAO.TipoServicoDAO;

import java.util.List;

public class RespostaTipoServico {
    private int id;
    private String mensagem;
    private List<TipoServicoDAO> listaTipos;

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

    public List<TipoServicoDAO> getListaTipos() {
        return listaTipos;
    }

    public void setListaTipos(List<TipoServicoDAO> listaTipos) {
        this.listaTipos = listaTipos;
    }

    public RespostaTipoServico(){}
    public RespostaTipoServico(int id, String mensagem, List<TipoServicoDAO> listaTipos) {
        this.id = id;
        this.mensagem = mensagem;
        this.listaTipos = listaTipos;
    }
}
