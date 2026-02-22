package SubClasesEleccion;
import modelo.*;
public class EMunicipal extends Eleccion{
    private String lugar;
    public EMunicipal(){
        super();
        lugar ="";
    }
    public String getLugar(){
        return lugar;
    }
    public void setLugar(String lugar){
        this.lugar=lugar;
    }
    public EMunicipal(Fecha fecha, HCandidato[] candidatos, String titulo,String lugar){
        super(fecha,candidatos,titulo);
        this.lugar=lugar;
    }

    @Override
    public String verInfo(){
        return  super.toString()+"\n"+
                "Zona de Eleccion:"+lugar;
    }
}
