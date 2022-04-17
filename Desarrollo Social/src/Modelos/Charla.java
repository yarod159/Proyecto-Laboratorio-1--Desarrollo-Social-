package Modelos;
import java.util.Date; //Para usar el tipo de variable Date es necesario importar

public class Charla {
    private String
        idCharla,
        rifGobernacion,
        tema,
        lugar;
    private Date fecha;
    private char estatusCh;

    public Charla(String idCharla, String rifGobernacion, String tema, String lugar, Date fecha, char estatusCh) { 
        this.idCharla = idCharla;
        this.rifGobernacion = rifGobernacion;
        this.tema = tema;
        this.lugar = lugar;
        this.fecha = fecha;
        this.estatusCh = estatusCh;
    }

    public String getIdCharla() {
        return idCharla;
    }

    public void setIdCharla(String idCharla) {
        this.idCharla = idCharla;
    }

    public String getRifGobernacion() {
        return rifGobernacion;
    }

    public void setRifGobernacion(String rifGobernacion) {
        this.rifGobernacion = rifGobernacion;
    }

    public String getTema() { 
        return tema;
    }

    public void setTema(String tema) { 
        this.tema = tema;
    }

    public String getLugar() { 
        return lugar;
    }

    public void setLugar(String lugar) { 
        this.lugar = lugar;
    }

    public Date getFecha() { 
        return fecha;
    }

    public void setFecha(Date fecha) { 
        this.fecha = fecha;
    }

    public char getEstatus () {
        return estatusCh;
    }

    public void setEstatusCh(char estatusCh) {
            this.estatusCh = estatusCh;
    }

}