package Modelos;

public class TipoDeServicios extends Servicios{

    private string idTipoSer, descri;
    public TipoDeServicios(String idTipoSer,String descri){
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
