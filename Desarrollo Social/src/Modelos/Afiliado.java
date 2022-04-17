package Modelos;

public class Afiliado {

    private String
            id_afi,
            Fundacion,
            Beneficiario;

    private char estatus_afi;
    
    public Afiliado (String id_afi, String Fundacion, String Beneficiario, char estatus_afi){
        this.id_afi=id_afi;
        this.Fundacion=Fundacion;
        this.Beneficiario=Beneficiario
        this.estatus_afi=estatus_afi;
    }

    public String getId_afi() {
        return id_afi;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public char getEstatus() {
        return estatus;
    }

    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }
}
