package Modelos;

public class DetallesDeSolicitud {
    private String
            idsolicitud,
            idservicio;
    private double
              costo;
    private char estatus_ds;
    
    public DetallesDeSolicitud(String idsolicitud, String idservicio,double costo, char estatus_ds){
        this.idsolicitud=idsolicitud;
        this.idservicio=idservicio;
        this.costo=costo;
        this.estatus_ds=estatus_ds;
    }

    public String getIdsolicitud() {
        return idsolicitud;
    }

    public void setId(String idsolicitud) {
        this.idsolicitud = idsolicitud;
    }
    public String getIdservicio() {
        return idservicio;
    }

    public void setId(String idservicios) {
    
        this.idservicio = idservicio;
    }
   
    public double getCosto() {
        return costo;
    }

    public void setcosto(double costo) {
    
        this.costo = costo;
    }

    public char getEstatus() {
        return estatus_ds;
    }

    public void setEstatus(char estatus_ds) {
        this.estatus = estatus_ds;
    }
}
