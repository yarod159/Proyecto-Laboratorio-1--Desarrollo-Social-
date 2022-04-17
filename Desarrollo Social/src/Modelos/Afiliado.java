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
        this.Beneficiario=Beneficiario;
        this.estatus_afi=estatus_afi;
    }

    public String getId_afi() {
        return id_afi;
    }

    public void setId_afi(String id_afi) {
        this.id_afi = id_afi;
    }

    public String getFundacion() {
        return Fundacion;
    }

    public void setFundacion(String Fundacion) {
        this.Fundacion = Fundacion;
    }

    public void getBeneficiario(){
         return Beneficiario;
    }

    public void getBeneficiario(){
         this.Beneficiario= Beneficiario;
    }

    public char getEstatus() {
        return estatus_afi;
    }

    public void setEstatus(char estatus_afi) {
        this.estatus_afi = estatus_afi;
    }
}
