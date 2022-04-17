package Modelos;

public class Fundacion {
    private String 
            rifFundacion,
            rifGobernacion,
            nombre,
            telefono,
            direccion;
    private int porc;
    private char estatus;

    public Fundacion(String rifFundacion, String rifGobernacion, String nombre, String telefono, String direccion, int porc, char estatus){
        this.rifFundacion = rifFundacion;
        this.rifGobernacion = rifGobernacion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.porc = porc;
        this.estatus = estatus;
    }

    public  String getRifFundacion(){
        return rifFundacion;
    }

    public void setRifFundacion(String rifFundacion){
        this.rifFundacion=rifFundacion;
    }

    public String getRifGobernacion(){
        return rifGobernacion;
    }

    public void setRifGobernacion(String rifGobernacion){
        this.rifGobernacion = rifGobernacion;
    }

     public String getnombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
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

    public char estatus(){
        return estatus;
    }

    public void setEstatus(char estatus){
        this.estatus = estatus;
    }

}

