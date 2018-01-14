package csm.DAO.DTO;

import csm.DAO.FuncionarioDAO;

import java.util.List;

public class RespostaFuncionario {


    private int id;
    private String mensagem;
    private List<FuncionarioDAO> listaFuncionarios;

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

    public List<FuncionarioDAO> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(List<FuncionarioDAO> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }
    public RespostaFuncionario(){}

    public RespostaFuncionario(int id, String mensagem, List<FuncionarioDAO> listaFuncionarios) {
        this.id = id;
        this.mensagem = mensagem;
        this.listaFuncionarios = listaFuncionarios;
    }
}
