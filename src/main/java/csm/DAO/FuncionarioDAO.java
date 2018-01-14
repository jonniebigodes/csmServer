package csm.DAO;

public class FuncionarioDAO {

    private String numeroFuncionario;
    private String nomeFuncionario;
    private Integer nif;
    private String email;
    private String iban;
    private String rua;
    private String codigopostal;
    private String cidade;
    private String concelho;
    private String distrito;

    public String getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(String value) {
        this.numeroFuncionario = value;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String value) {
        this.nomeFuncionario = value;
    }

    public Integer getNif() {
        return nif;
    }

    public void setNif(Integer value) {
        this.nif = value;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String value) {
        this.email = value;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String value) {
        this.iban = value;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String value) {
        this.rua = value;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String value) {
        this.codigopostal = value;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String value) {
        this.cidade = value;
    }

    public String getConcelho() {
        return concelho;
    }

    public void setConcelho(String value) {
        this.concelho = value;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String value) {
        this.distrito = value;
    }

    public FuncionarioDAO() { }


    public FuncionarioDAO(String numeroFuncionario, String nomeFuncionario, Integer nif, String email, String iban, String rua, String codigopostal, String cidade, String concelho, String distrito) {
        this.numeroFuncionario = numeroFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.nif = nif;
        this.email = email;
        this.iban = iban;
        this.rua = rua;
        this.codigopostal = codigopostal;
        this.cidade = cidade;
        this.concelho = concelho;
        this.distrito = distrito;
    }
}
