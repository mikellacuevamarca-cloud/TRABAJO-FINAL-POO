package SubClasesEleccion;
import modelo.*;
public class EMunicipal extends Eleccion{
    private String lugar;
    public EMunicipal(){
        super();
        lugar ="";
    }
    public EMunicipal(Fecha fecha, HCandidato[] candidatos, String titulo,String lugar){
        super(fecha,candidatos,titulo);
    }

    @Override
    public String verInfo(){
        return  super.toString()+"\n"+
                "Zona de Eleccion:"+lugar;
    }
}
