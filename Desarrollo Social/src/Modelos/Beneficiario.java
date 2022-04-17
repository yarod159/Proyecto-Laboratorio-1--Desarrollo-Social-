package Modelos;

public class Beneficiario extends Persona {
    private char estatusBe;

    public Beneficiario(date fechaNac, char estatusBe){ 
        this.fechaNac=fechaNac;
        this.estatusBe=estatusBe;
    }

    public char getEstatusBe() {
        return estatusBe;
    }

    public void setEstatusBe(char estatusBe) {
        this.estatusBe = estatusBe;
    }
