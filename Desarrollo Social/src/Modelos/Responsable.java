package Modelos;
import java.util.Date; //Para usar el tipo de variable Date es necesario importar

public class Responsable extends Persona {
    private 
        int fundacionid;

    public Responsable(int fundacionid,String id, String nombre,String apellido,
    long telefono,String direccion,Date fechaNac,
    String correo, char estatus){ 
        super(id,nombre,apellido,telefono,direccion,fechaNac,correo,estatus);
        this.fundacionid=fundacionid; 
    }

    public int getFundacionid(){
        return fundacionid;
    }

    public void setFundacionid(int fundacionid){
        this.fundacionid = fundacionid;
    }
}
