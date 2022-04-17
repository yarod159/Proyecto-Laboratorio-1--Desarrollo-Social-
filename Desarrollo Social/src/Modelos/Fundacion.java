package Modelos;

public class Fundacion {
    private string 
            rifFundacion,
            rifGobernacion,
            nombre,
            telefono,
            direccion;
    private int porc;
    private char estatusFun;

    public Fundacion(string rifFundacion, string rifGobernacion, string nombre, string telefono, string direccion, int porc, char estatusFun){
        this.rifFundacion = rifFundacion;
        this.rifGobernacion = rifGobernacion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.porc = porc;
        this.estatusFun = estatusFun;
    }

    public  string getRifFundacion(){
        return rifFundacion;
    }

    public void setRifFundacion(string rifFundacion){
        this.rifFundacion=rifFundacion;
    }

    public string getRifGobernacion(){
        return rifGobernacion;
    }

    public void setRifGobernacion(string rifGobernacion){
        this.rifGobernacion = rifGobernacion;
    }

     public String getnombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPorc(){
        return porc;
    }

    public void setPorc(int porc){
        this.porc = porc;
    }

    public char estatusFun(){
        return estatusFun;
    }

    public void setPorc(char estatusFun){
        this.estatusFun = estatusFun;
    }

}

