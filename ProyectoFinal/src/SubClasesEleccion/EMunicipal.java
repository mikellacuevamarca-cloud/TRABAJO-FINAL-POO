package SubClasesEleccion;
import modelo.*;
import java.util.Arrays;
public class EMunicipal extends Eleccion{
    private String lugar;
    public EMunicipal(){
        super();
        lugar ="";
    }
    public EMunicipal(Fecha fecha, Candidato[] candidatos,String titulo,String lugar){
        super(fecha,candidatos,titulo);
        this.lugar=lugar;
    }
    
    @Override
    public String verInfo(){
        return  super.toString()+"\n"+
                "Zona de Eleccion:"+lugar;
    }
}
