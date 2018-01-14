package csm.DAO;

public class ClienteDAO {

    private String id;
    private String nome;
    private Integer nif;
    private String email;
    private String rua;
    private String codigopostal;
    private String cidade;
    private String concelho;
    private String distrito;

    public String get_id() {
        return id;
    }

    public void set_id(String value) {
        this.id = value;
    }

    public String get_nome() {
        return nome;
    }

    public void set_nome(String value) {
        this.nome = value;
    }

    public Integer get_nif() {
        return nif;
    }

    public void set_nif(Integer value) {
        this.nif = value;
    }

    public String get_email() {
        return email;
    }

    public void set_email(String value) {
        this.email = value;
    }

    public String get_rua() {
        return rua;
    }

    public void set_rua(String value) {
        this.rua = value;
    }

    public String get_codigopostal() {
        return codigopostal;
    }

    public void set_codigopostal(String value) {
        this.codigopostal = value;
    }

    public String get_cidade() {
        return cidade;
    }

    public void set_cidade(String value) {
        this.cidade = value;
    }

    public String get_concelho() {
        return concelho;
    }

    public void set_concelho(String value) {
        this.concelho = value;
    }

    public String get_distrito() {
        return distrito;
    }

    public void set_distrito(String value) {
        this.distrito = value;
    }


    public ClienteDAO(){}

    public ClienteDAO(String id, String nome, Integer nif, String email, String rua, String codigopostal, String cidade, String concelho, String distrito) {
        this.id = id;
        this.nome = nome;
        this.nif = nif;
        this.email = email;
        this.rua = rua;
        this.codigopostal = codigopostal;
        this.cidade = cidade;
        this.concelho = concelho;
        this.distrito = distrito;
    }
}
