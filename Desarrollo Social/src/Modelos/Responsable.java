package Modelos;
import java.util.Date; //Para usar el tipo de variable Date es necesario importar

public class Responsable extends Persona {
    private 
        char estatusRe;

    public Responsable(char estatusRes){ 
        this.estatusRe=estatusRe;
    public Responsable (String id, String nombre,String apellido,
    long telefono,String direccion,Date fechaNac,
    String correo, char estatusRe) {
        super(id,nombre,apellido,telefono,direccion,fechaNac,correo);
        this.fechaNac=fechaNac;
        this.estatusRe=estatusRe; 
    }

    public char getEstatusRe() {
        return estatusRe;
    }

    public void setEstatusRe(char estatusRe) {
        this.estatusRe = estatusRe;
    }
}
