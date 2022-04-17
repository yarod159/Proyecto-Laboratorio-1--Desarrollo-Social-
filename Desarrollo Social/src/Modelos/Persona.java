package modelos;

import java.util.Date;

public class Persona {
    private String
            codigo,
            nombre,
            apellido,
            direccion,
            correo;
    long    telefono;   
    private Date fechaNac;
    public char estatus;
    
    public Persona(String codigo, String nombre,String apellido,
            long telefono,String direccion,Date fechaNac,
            String correo, char estatus){
        
        super();
        
        this.codigo=codigo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.direccion=direccion;
        this.fechaNac=fechaNac;
        this.correo=correo;
        this.estatus=estatus;
        
    }

    public String getcodigo() {
        return codigo;
    }

    public void setId(String codigo) {
        this.codigo = codigo;
    }

    public String getnombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }

}