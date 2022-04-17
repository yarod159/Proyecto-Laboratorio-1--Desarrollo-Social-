package Modelos;

public class Beneficiario {
    private date
        fechaNac;
    private char estatusBe;

    public Beneficiario(date fechaNac, char estatus){ 
        this.fechaNac=fechaNac;
        this.estatus=estatus;
    }

    public date getFechaNac(){ 
        return fechaNac;
     }

    public void setFechaNac(date fechaNac){
        this.fechaNac=fechaNac;
    }

    public char getEstatus() {
        return estatus;
    }

    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }
