package Modelos;

public class Organizacion {
    private string 
            rifOrganizacion,
            razonSocial,
            sector;
    private char estatusOrg;

    public Organizacion(string rifOrganizacion, string razonSocial, string sector, char estatusOrg){
        this.rifOrganizacion = rifOrganizacion;
        this.razonSocial = razonSocial;
        this.sector = sector;
        this.estatusOrg = estatusOrg;
    }

    public  string getRifOrganizacion(){
        return rifOrganizacion;
    }

    public void setRifOrganizacion(string rifOrganizacion){
        this.rifOrganizacion = rifOrganizacion;
    }

    public  string getRazonSocial(){
        return razonSocial;
    }

    public void setRazonSocial(string razonSocial){
        this.razonSocial = razonSocial;
    }

    public string getSector(){
        return sector;
    }

    public void setSector(string sector){
        this.sector = sector;
    }

    public char estatusOrg(){
        return estatusOrg;
    }

    public void setEstatusOrg(char estatusOrg){
        this.estatusOrg = estatusOrg;
    }

