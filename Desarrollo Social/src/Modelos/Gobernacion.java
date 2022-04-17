package Modelos;

public class Gobernacion {
    private String 
            rifGobernacion,
            razonSocial;
    private char estatus;

    public Gobernacion(String rifGobernacion, String razonSocial, char estatus){
        this.rifGobernacion = rifGobernacion;
        this.razonSocial = razonSocial;
        this.estatus = estatus;
    }

    public  String getRifGobernacion(){
        return rifGobernacion;
    }

    public void setRifGobernacion(String rifGobernacion){
        this.rifGobernacion = rifGobernacion;
    }

    public  String getRazonSocial(){
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial){
        this.razonSocial = razonSocial;
    }

    public char estatus(){
        return estatus;
    }

    public void setEstatus(char estatus){
        this.estatus = estatus;
    }
}
