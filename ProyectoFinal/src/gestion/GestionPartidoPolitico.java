
package gestion;

import modelo.*;
public class GestionPartidoPolitico {
    private PartidoPolitico[] partidos;
    private int nroPartidos;
    private static final int MAX=100;
    public GestionPartidoPolitico(){
        partidos=new PartidoPolitico[MAX];
        nroPartidos=0;
    }
    public void agregarPartido(PartidoPolitico partido){
        if(nroPartidos<MAX){
            partidos[nroPartidos]=partido;
        }
        else{
            System.out.println("Error, espacio lleno.");
        }
    }
    public PartidoPolitico busqueda(int pos){
        if(pos>=0&&pos<nroPartidos){
            return partidos[pos];
        }
        else{
            System.out.println("Posicion no valida");
            return null;
        }
    }
    public void eliminarPartido(int pos){
        if(pos>=0&&pos<nroPartidos){
            for(int i=pos;i<nroPartidos-1;i++){
                partidos[i]=partidos[i+1];
            }
        }
        else{
            System.out.println("Posicion no valida.");
        }
    }
}
