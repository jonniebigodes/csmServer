package csm.DAO;

public class LinhaFaturaDAO {
    private String id;
    private String idservico;
    private String idfatura;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdservico() {
        return idservico;
    }

    public void setIdservico(String idservico) {
        this.idservico = idservico;
    }

    public String getIdfatura() {
        return idfatura;
    }

    public void setIdfatura(String idfatura) {
        this.idfatura = idfatura;
    }

    public LinhaFaturaDAO(String id, String idservico, String idfatura) {
        this.id = id;
        this.idservico = idservico;
        this.idfatura = idfatura;
    }

    public LinhaFaturaDAO() {
    }
}
