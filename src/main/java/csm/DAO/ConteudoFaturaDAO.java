package csm.DAO;

import java.math.BigDecimal;

public class ConteudoFaturaDAO {

    private String idservico;
    private String descricaotiposervico;
    private BigDecimal valorServico;
    private double valorIva;
    private double valorFinal;

    public double getValorIva() {
        return valorIva;
    }

    public void setValorIva(double valorIva) {
        this.valorIva = valorIva;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public String getIdservico() {
        return idservico;
    }

    public void setIdservico(String idservico) {
        this.idservico = idservico;
    }

    public String getDescricaotiposervico() {
        return descricaotiposervico;
    }

    public void setDescricaotiposervico(String descricaotiposervico) {
        this.descricaotiposervico = descricaotiposervico;
    }

    public BigDecimal getValorServico() {
        return valorServico;
    }


    public void setValorServico(BigDecimal valorServico) {
        this.valorServico = valorServico;
    }

    public ConteudoFaturaDAO() {
    }

    public ConteudoFaturaDAO(String idservico, String descricaotiposervico, BigDecimal valorServico) {
        this.idservico = idservico;
        this.descricaotiposervico = descricaotiposervico;
        this.valorServico = valorServico;
    }
}
