package Modelos;

public class Afiliado {

    private Integer
            id_afi,
            Fundacion,
            Beneficiario;

    private char estatus_afi;
    
    public Afiliado (Integer id_afi, Integer Fundacion, Integer Beneficiario, char estatus_afi){
        this.id_afi=id_afi;
        this.Fundacion=Fundacion;
        this.Beneficiario=Beneficiario;
        this.estatus_afi=estatus_afi;
    }

    public Integer getId_afi() {
        return id_afi;
    }

    public void setId_afi(Integer id_afi) {
        this.id_afi = id_afi;
    }

    public Integer getFundacion() {
        return Fundacion;
    }

    public void setFundacion(Integer Fundacion) {
        this.Fundacion = Fundacion;
    }

    public Integer getBeneficiario(){
         return Beneficiario;
    }

    public void setBeneficiario(Integer Beneficiario){
         this.Beneficiario= Beneficiario;
    }

    public char getEstatus() {
        return estatus_afi;
    }

    public void setEstatus(char estatus_afi) {
        this.estatus_afi = estatus_afi;
    }
}
