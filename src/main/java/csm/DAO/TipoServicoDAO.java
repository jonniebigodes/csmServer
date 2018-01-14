package csm.DAO;

import java.math.BigDecimal;

public class TipoServicoDAO {

    private String idServico;
    private String descricao;
    private BigDecimal valor;

    public String getIdServico() {
        return idServico;
    }

    public void setIdServico(String idServico) {
        this.idServico = idServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public TipoServicoDAO(){}
    public TipoServicoDAO(String idServico, String descricao,BigDecimal valor) {
        this.idServico = idServico;
        this.descricao = descricao;
        this.valor= valor;
    }
}
