package gestion;
import modelo.*;
import SubClasesEleccion.*;
public class GestionElecciones {
    private Eleccion[] elecciones;
    private int nroElecciones;
    private static final int MAX=100;
    public GestionElecciones(){
        elecciones=new Eleccion[MAX];
        nroElecciones=0;
        
    }
    public void agregarEleccion(Eleccion e){
        if(nroElecciones<MAX){
            elecciones[nroElecciones]=e;
            nroElecciones++;
        }
        else{
            System.out.println("Espacio Lleno");
        }
    }
    public String mostrarElecciones(){
        String mensaje="";
        for(int i= 0;i<nroElecciones;i++){
            mensaje=mensaje+elecciones[i].verInfo()+"\n";
        }
    return mensaje;
    }
    public Eleccion busqueda(int pos){
        if(pos>=0&&pos<nroElecciones){
            return elecciones[pos];
        }
        else{
            return null;
        }
    }
    public void eliminarEleccion(int pos){
        if(pos>=0&&pos<nroElecciones){
            for(int i=pos;i<nroElecciones-1;i++){
                elecciones[i]=elecciones[i+1];
                nroElecciones--;
            }
        }
        else{
            System.out.println("Posicion no valida.");
        }   
    }   
}
