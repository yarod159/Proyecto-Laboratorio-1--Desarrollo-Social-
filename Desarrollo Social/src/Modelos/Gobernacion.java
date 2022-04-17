package Modelos;

public class Gobernacion {
    private string 
            rifGobernacion,
            razonSocial;
    private char estatusGob;

    public Gobernacion(string rifGobernacion, char estatusGob){
        this.rifGobernacion = rifGobernacion;
        this.estatusGob = estatusGob;
    }

    public  string getRifGobernacion(){
        return rifGobernacion;
    }

    public void setRifGobernacion(string rifGobernacion){
        this.rifGobernacion = rifGobernacion;
    }
