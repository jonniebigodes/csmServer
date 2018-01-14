package csm.DAO;

import java.util.Date;

public class OcorrenciaDAO {

    private String numeroocorrencia;
    private String nomecliente;
    private String nomefuncionario;
    private String datainicial;
    private String datafinal;
    private Boolean finalizado;
    private String rua;
    private String codigopostal;
    private String cidade;
    private String concelho;
    private String distrito;
    private String sumario;

    public String getNumeroocorrencia() {
        return numeroocorrencia;
    }

    public void setNumeroocorrencia(String numeroocorrencia) {
        this.numeroocorrencia = numeroocorrencia;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public String getNomefuncionario() {
        return nomefuncionario;
    }

    public void setNomefuncionario(String nomefuncionario) {
        this.nomefuncionario = nomefuncionario;
    }

    public String getDatainicial() {
        return datainicial;
    }

    public void setDatainicial(String datainicial) {
        this.datainicial = datainicial;
    }

    public String getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(String datafinal) {
        this.datafinal = datafinal;
    }

    public Boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
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

    public String getSumario() {
        return sumario;
    }

    public void setSumario(String sumario) {
        this.sumario = sumario;
    }

    public OcorrenciaDAO(){}
    public OcorrenciaDAO(String numeroocorrencia, String nomecliente, String nomefuncionario, String datainicial, String datafinal, boolean finalizado, String rua, String codigopostal, String cidade, String concelho, String distrito, String sumario) {
        this.numeroocorrencia = numeroocorrencia;
        this.nomecliente = nomecliente;
        this.nomefuncionario = nomefuncionario;
        this.datainicial = datainicial;
        this.datafinal = datafinal;
        this.finalizado = finalizado;
        this.rua = rua;
        this.codigopostal = codigopostal;
        this.cidade = cidade;
        this.concelho = concelho;
        this.distrito = distrito;
        this.sumario = sumario;
    }

}
