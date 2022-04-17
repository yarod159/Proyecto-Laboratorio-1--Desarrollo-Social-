package Modelos;

    public class Donaciones {
    private String
    idSolicitud,
    descripcion;
    private int cantidad;
    private char estatusDo;

    public Donaciones(String idSolicitud, String descripcion, int cantidad, char estatusDo) {
        this.idSolicitud = idSolicitud;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.estatusDo = estatusDo;
    } 

    public String getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public char getEstatusDo(){
        return estatusDo;
    }

    public void setEstatusDo(char estatusDo){
        this.estatusDo = estatusDo;
    }
}