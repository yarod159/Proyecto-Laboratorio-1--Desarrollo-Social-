package Modelos;
import java.util.Date; //Para usar el tipo de variable Date es necesario importar

public class Beneficiario extends Persona {

    public Beneficiario (String id, String nombre,String apellido,
    long telefono,String direccion,Date fechaNac,
    String correo, char estatus) {
        super(id,nombre,apellido,telefono,direccion,fechaNac,correo,estatus);
    }

}
