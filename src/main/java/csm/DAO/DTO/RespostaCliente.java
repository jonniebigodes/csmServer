package csm.DAO.DTO;

import csm.DAO.ClienteDAO;

import java.util.List;

/**
 *
 */
public class RespostaCliente {

    private int id;

    private String mensagem;
    private List<ClienteDAO> listaClientes;
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

    public List<ClienteDAO> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<ClienteDAO> value) {
        this.listaClientes = value;
    }
}
