package Modelos;

public class TipoServicio extends Servicio{

    private string idTipoSer, descri;
    public TipoServicio(String idTipoSer,String descri){
        this.idTipoSer= idTipoSer;
        this.descri=descri;
    }
    public String getIdTipoSer(){
        return idTipoSer;
    }

    public void setIdTipoSer(String idTipoSer){
        id.idTipoSer=idTipoSer;
    }

    public String getDescri(){
        return descri;
    }

    public void setDescri(String descri){
        this.descri=descri
    }
}
