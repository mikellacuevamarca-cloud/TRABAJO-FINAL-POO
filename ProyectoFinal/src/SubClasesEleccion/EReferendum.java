/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SubClasesEleccion;
import modelo.*;

public class EReferendum extends Eleccion{
    private String pregunta;
    public EReferendum(){
        super();
        pregunta="";
    }
    public EReferendum(Fecha fecha,String titulo,String pregunta){
        super();
        this.fecha=fecha;
        this.titulo=titulo;
        this.candidatos=new Candidato[2];
        this.candidatos[0]=new Candidato("Opcion Si","",0,null);
        this.candidatos[1]=new Candidato("Opcion No","",0,null);
        this.pregunta=pregunta;
    }
    @Override
    public String verInfo(){
        return super.toString()+"\n"+
                "Consulta:"+pregunta;
    }
}
