package Modelos;

public class Organizacion {
    private String 
            rifOrganizacion,
            razonSocial,
            sector;
    private char estatus;

    public Organizacion(String rifOrganizacion, String razonSocial, String sector, char estatus){
        this.rifOrganizacion = rifOrganizacion;
        this.razonSocial = razonSocial;
        this.sector = sector;
        this.estatus = estatus;
    }

    public  String getRifOrganizacion(){
        return rifOrganizacion;
    }

    public void setRifOrganizacion(String rifOrganizacion){
        this.rifOrganizacion = rifOrganizacion;
    }

    public  String getRazonSocial(){
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial){
        this.razonSocial = razonSocial;
    }

    public String getSector(){
        return sector;
    }

    public void setSector(String sector){
        this.sector = sector;
    }

    public char estatus(){
        return estatus;
    }

    public void setEstatusOrg(char estatus){
        this.estatus = estatus;
    }
}
