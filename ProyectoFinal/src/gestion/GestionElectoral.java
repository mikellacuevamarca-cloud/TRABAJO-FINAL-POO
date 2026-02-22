package gestion;
import modelo.*;
public class GestionElectoral {
    private Eleccion[] elecciones;
    private int nroElecciones;
    private static final int MAX=100;
    public GestionElectoral(){
        elecciones=new Eleccion[MAX];
        nroElecciones=0;
    }
    public void agregarEleccion(Eleccion e){
        if(nroElecciones<MAX){
            elecciones[nroElecciones]=e;
            nroElecciones++;
        }
        else{
            System.out.println("Error; capacidad maxima");
        }
    }
    public String listarElecciones(){
        String mensaje="";
        for(int i=0;i<nroElecciones;i++){
            mensaje=mensaje+elecciones[i].verInfo()+"\n";
        }
    return mensaje;
    }
    public void eliminarElecciones(){
        
    }
    
    
}
