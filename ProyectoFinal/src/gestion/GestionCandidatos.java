package gestion;
import modelo.*;
public class GestionCandidatos {
    private HCandidato[] candidatos;
    private int nroCandidatos;
    private static final int MAX=100;
    public GestionCandidatos(){
        candidatos=new HCandidato[MAX];
        nroCandidatos=0;
    }
    public void agregarCandidato(HCandidato candidato){
        if(nroCandidatos<MAX){
            candidatos[nroCandidatos]= candidato;
            nroCandidatos++;
        }
        else{
            System.out.println("Error, espacio lleno");
        }
    }
    public void eliminarCandidato(int pos){
        if(pos>=0&&pos<nroCandidatos){
            for(int i=pos;i<nroCandidatos-1;i++){
                candidatos[i]=candidatos[i+1];
                nroCandidatos--;
            }
        }
        else{
            System.out.println("Posicion no encontrada");
        }
    }
    public HCandidato busqueda(int pos){
        if(pos>=0&&pos<nroCandidatos){
            return candidatos[pos];
        }
        else{
            return null;
        }
    }
}
