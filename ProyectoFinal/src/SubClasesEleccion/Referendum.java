/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubClasesEleccion;
import modelo.*;

public class Referendum extends Eleccion{
    private String pregunta;
    public Referendum(){
        super();
        pregunta="";
    }
    public Referendum(Fecha fecha,String titulo,String pregunta){
        super();
        this.fecha=fecha;
        this.titulo=titulo;
        this.candidatos=new HCandidato[2];
        this.candidatos[0]=new HCandidato("Opcion Si","",0,null);
        this.candidatos[1]=new HCandidato("Opcion No","",0,null);
        this.pregunta=pregunta;
    }
    @Override
    public String verInfo(){
        return super.toString()+"\n"+
                "Consulta:"+pregunta;
    }
}
