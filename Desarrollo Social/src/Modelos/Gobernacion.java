package Modelos;

public class Gobernacion {
    private string 
            rifGobernacion,
            razonSocial;
    private char estatusGob;

    public Gobernacion(string rifGobernacion, string razonSocial, char estatusGob){
        this.rifGobernacion = rifGobernacion;
        this.razonSocial = razonSocial;
        this.estatusGob = estatusGob;
    }

    public  string getRifGobernacion(){
        return rifGobernacion;
    }

    public void setRifGobernacion(string rifGobernacion){
        this.rifGobernacion = rifGobernacion;
    }

    public  string getRazonSocial(){
        return razonSocial;
    }

    public void setRazonSocial(string razonSocial){
        this.razonSocial = razonSocial;
    }

    public char estatusGob(){
        return estatusGob;
    }

    public void setEstatusGob(char estatusGob){
        this.estatusGob = estatusGob;
    }
