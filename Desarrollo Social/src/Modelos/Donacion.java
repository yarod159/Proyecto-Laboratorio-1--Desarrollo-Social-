package Modelos;

    public class Donacion {
    private String
    idSolicitud,
    descripcion;
    private int cantidad;
    private char estatus;

    public Donacion(String idSolicitud, String descripcion, int cantidad, char estatus){
        this.idSolicitud = idSolicitud;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.estatus = estatus;
    } 

    public String getIdSolicitud(){
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud){
        this.idSolicitud = idSolicitud;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public char getEstatus(){
        return estatus;
    }

    public void setEstatus(char estatus){
        this.estatus = estatus;
    }
}
