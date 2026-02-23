
package gestion;

import modelo.ENUMTipoMiembro;
import modelo.HMiembroDeMesa;

public class GestionMiembros {
    //atributos
    private HMiembroDeMesa [] miembros;
    private int num;
    
    private static final int MAX=100;
    
    //contructor
    public GestionMiembros(){
        miembros = new HMiembroDeMesa[MAX];
        this.num = 0;
    }
    
    //OTROS METODOSs
    //agregar
    public void ingresarUnMiembro(HMiembroDeMesa m){
        //validar q haya espacio en el arreglo 
        if(num<miembros.length){
            miembros[num] = m;
            //aumentar la cant de miembros
            num++;
        }else{
            System.out.println("No hay espacio");
        }
    }
    
    public HMiembroDeMesa buscarMiembroPorDni(int dni){
        for (int i = 0; i < num; i++) {
            if(miembros[i].getNrodni() == dni ){
                return miembros[i];
            }
        }
        return null;
    }
    
    public HMiembroDeMesa modificarMiembro(int dni, String nombre, String apellido, ENUMTipoMiembro cargo){
        HMiembroDeMesa encontrada = buscarMiembroPorDni(dni);
        if(encontrada!= null){
            encontrada.setNrodni(dni);
            encontrada.setNombres(nombre);
            encontrada.setApellidos(apellido);
            encontrada.setTipoDeMiembro(cargo);
        }
        return encontrada;
        
    }
    
    //corregir
    public HMiembroDeMesa eliminar(int dni){
        HMiembroDeMesa encontrada = buscarMiembroPorDni(dni);
        for (int i = 0; i < num; i++) {
            if(encontrada != null){
                for (int j = i; j < num-1; j++) {
                    miembros [j]= miembros[j+1];
                    
                }
            num--;
            }
               
        }
        return null;
    }
    public String mostrarMiembros(){
        String mensaje = "";
        for(int i = 0; i < num; i++){
            mensaje = mensaje + miembros[i].verInfo() + "\n";
        }
        return mensaje;
    }
   
}
