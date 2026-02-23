package gestion;

import modelo.*;

public class GestionMesaElectoral {

    private MesaElectoral[] mesas;
    private int nroMesas;
    private static final int MAX = 100;

    public GestionMesaElectoral(){
        mesas = new MesaElectoral[MAX];
        nroMesas = 0;
    }

    //para agregar mesa
    public void agregarMesa(MesaElectoral m){
        if(nroMesas < MAX){
            mesas[nroMesas] = m;
            nroMesas++;
        }else{
            System.out.println("Espacio lleno");
        }
    }

    //buscar mesa por id 
    public MesaElectoral buscarMesa(int idMesa){
        for(int i = 0; i < nroMesas; i++){
            if(mesas[i].getIdMesa() == idMesa){
                return mesas[i];
            }
        }
        return null;
    }

    //eliminar mesa por id
    public void eliminarMesa(int idMesa){
        for(int i = 0; i < nroMesas; i++){
            if(mesas[i].getIdMesa() == idMesa){
                for(int j = i; j < nroMesas - 1; j++){
                    mesas[j] = mesas[j+1];
                }
                nroMesas--;
            }
        }
    }

    //mostrar mesitas
    public String mostrarMesas(){
        String mensaje = "";
        for(int i = 0; i < nroMesas; i++){
            mensaje = mensaje + mesas[i].verInfo() + "\n";
        }
        return mensaje;
    }
}