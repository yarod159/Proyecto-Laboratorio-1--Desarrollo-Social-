package Modelos;
import java.util.Date; //Para usar el tipo de variable Date es necesario importar

public class Beneficiario extends Persona {
    private 
        char estatusBe;

    public Beneficiario(char estatusBe){ 
        this.estatusBe=estatusBe;
    public Beneficiario (String id, String nombre,String apellido,
    long telefono,String direccion,Date fechaNac,
    String correo, char estatus, char estatusBe) {
        super(id,nombre,apellido,telefono,direccion,fechaNac,correo,estatus);
        this.fechaNac=fechaNac;
        this.estatusBe=estatusBe; //No entiendo la inclusión de una segunda fecha de nacimiento o del segundo estatus -JM
    }

    public char getEstatusBe() {
        return estatusBe;
    }

    public void setEstatusBe(char estatusBe) {
        this.estatusBe = estatusBe;
    }
}
