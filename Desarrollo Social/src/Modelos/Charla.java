package Modelos;

public class Charla {
    private string
        idCharla,
        rifGobernacion,
        tema,
        lugar;
    private date fecha;
    private timestamp hora; 
    private char estatusCh;

    public Charla(string idCharla, string rifGobernacion, string tema, string lugar, date fecha, timestamp hora, char estatusCh){ 
        this.idCharla = idCharla;
        this.rifGobernacion = rifGobernacion;
        this.tema = tema;
        this.lugar = lugar;
        this.fecha = fecha;
        this.hora = hora;
        this.estatusCh = estatusCh;
    }
}

public String getIdCharla(){
    return idCharla;
 }

public void setIdCharla(string idCharla){
    this.idCharla = idCharla;
 }

public String getRifGobernacion(){
     return rifGobernacion;
  }

public void setRifGobernacion(string rifGobernacion){
      this.rifGobernacion = rifGobernacion;
   }

public string getTema(){ 
    return tema;
}

public void setTema(string tema){ 
    this.tema = tema;
}

public string getLugar(){ 
    return lugar;
}

public void setLugar(){ 
    this.lugar = lugar;
}

public date getFecha(){ 
    return fecha;
}

public void setFecha(){ 
    this.fecha = fecha;
}

public timestamp getHora(){ 
    return hora;
}

public void setHora(){ 
    this.hora = hora;
}

public void setEstatusCh(char estatusCh) {
        this.estatusCh = estatusCh;
}
