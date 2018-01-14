package csm.DAO;

import java.math.BigDecimal;
import java.util.List;

public class ReciboDAO {

    private String numerorecibo;
    private String numerofatura;
    private String numerocliente;
    private String nomecliente;
    private String contacto;
    private String numerofuncionario;
    private String nomefuncionario;
    private String rua;
    private String codigopostal;
    private String cidade;
    private String concelho;
    private String distrito;
    private BigDecimal iva;
    private BigDecimal valorbruto;
    private BigDecimal valor;

    private List<ConteudoFaturaDAO> dadosRecibo;

    public String getNumerorecibo() {
        return numerorecibo;
    }

    public void setNumerorecibo(String numerorecibo) {
        this.numerorecibo = numerorecibo;
    }

    public String getNumerofatura() {
        return numerofatura;
    }

    public void setNumerofatura(String numerofatura) {
        this.numerofatura = numerofatura;
    }

    public String getNumerocliente() {
        return numerocliente;
    }

    public void setNumerocliente(String numerocliente) {
        this.numerocliente = numerocliente;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getNumerofuncionario() {
        return numerofuncionario;
    }

    public void setNumerofuncionario(String numerofuncionario) {
        this.numerofuncionario = numerofuncionario;
    }

    public String getNomefuncionario() {
        return nomefuncionario;
    }

    public void setNomefuncionario(String nomefuncionario) {
        this.nomefuncionario = nomefuncionario;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getConcelho() {
        return concelho;
    }

    public void setConcelho(String concelho) {
        this.concelho = concelho;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getValorbruto() {
        return valorbruto;
    }

    public void setValorbruto(BigDecimal valorbruto) {
        this.valorbruto = valorbruto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public List<ConteudoFaturaDAO> getDadosRecibo() {
        return dadosRecibo;
    }

    public void setDadosRecibo(List<ConteudoFaturaDAO> dadosRecibo) {
        this.dadosRecibo = dadosRecibo;
    }

    public ReciboDAO(String numerorecibo, String numerofatura, String numerocliente, String nomecliente, String contacto, String numerofuncionario, String nomefuncionario, String rua, String codigopostal, String cidade, String concelho, String distrito, BigDecimal iva, BigDecimal valorbruto, BigDecimal valor, List<ConteudoFaturaDAO> dadosRecibo) {
        this.numerorecibo = numerorecibo;
        this.numerofatura = numerofatura;
        this.numerocliente = numerocliente;
        this.nomecliente = nomecliente;
        this.contacto = contacto;
        this.numerofuncionario = numerofuncionario;
        this.nomefuncionario = nomefuncionario;
        this.rua = rua;
        this.codigopostal = codigopostal;
        this.cidade = cidade;
        this.concelho = concelho;
        this.distrito = distrito;
        this.iva = iva;
        this.valorbruto = valorbruto;
        this.valor = valor;
        this.dadosRecibo = dadosRecibo;
    }

    public ReciboDAO(String numerorecibo, String numerofatura, String numerocliente, String nomecliente, String contacto, String numerofuncionario, String nomefuncionario, String rua, String codigopostal, String cidade, String concelho, String distrito, BigDecimal iva, BigDecimal valorbruto, BigDecimal valor) {
        this.numerorecibo = numerorecibo;
        this.numerofatura = numerofatura;
        this.numerocliente = numerocliente;
        this.nomecliente = nomecliente;
        this.contacto = contacto;
        this.numerofuncionario = numerofuncionario;
        this.nomefuncionario = nomefuncionario;
        this.rua = rua;
        this.codigopostal = codigopostal;
        this.cidade = cidade;
        this.concelho = concelho;
        this.distrito = distrito;
        this.iva = iva;
        this.valorbruto = valorbruto;
        this.valor = valor;
    }


    public ReciboDAO() {
    }
}
