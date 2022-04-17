package Modelos;

    public class Donacion {
    private string
    idSolicitud,
    descripcion;
    private int cantidad;
    private char estatusDo;

    public Donacion(string idSolicitud, string descripcion, int cantidad, char estatusDo){
        this.idSolicitud = idSolicitud;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.estatusDo = estatusDo;
    } 

    public string getIdSolicitud(){
        return idSolicitud;
    }

    public void setIdSolicitud(string idSolicitud){
        this.idSolicitud = idSolicitud;
    }

    public string getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(string descripcion){
        this.descripcion = descripcion;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(){
        this.cantidad = cantidad;
    }

    public char getEstatusDo(){
        return estatusDo;
    }

    public void setEstatusDo(){
        this.estatusDo = estatusDo;
    }
