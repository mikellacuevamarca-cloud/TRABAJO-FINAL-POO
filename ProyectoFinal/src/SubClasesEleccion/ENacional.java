
package SubClasesEleccion;
import modelo.*;
public class ENacional extends Eleccion{
    private boolean segundaVuelta;
    public ENacional(){
        super();
        segundaVuelta=false;
    }
    public ENacional(Fecha fecha , HCandidato[] candidatos, String titulo,boolean segundaVuelta){
        super(fecha,candidatos,titulo);
        this.segundaVuelta=segundaVuelta;
    }

    @Override
    public String verInfo(){
        String vuelta="Primera Vuelta";
        if(segundaVuelta==true){
            vuelta="Segunda Vuelta";
        }

        return super.toString()+"\n"+
                "Vuelta:"+vuelta;

    }

}
