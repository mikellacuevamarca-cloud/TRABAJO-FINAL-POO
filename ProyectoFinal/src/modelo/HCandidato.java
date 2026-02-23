package modelo;
import java.util.Scanner;
public class HCandidato extends HPersona {
    //ATRIBUTOS
    private PartidoPolitico partidoPolitico;
    
    //METODOS
    //CONSTRUCTOR sin p
    public HCandidato() {
        super();
    }

    //constructor con p
    public HCandidato(String nombres, String apellidos, int nrodni, PartidoPolitico partidoPolitico){
        super(nombres, apellidos, nrodni);
        this.partidoPolitico = partidoPolitico;
    }
    
    //GET AND SETTER

    public PartidoPolitico getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(PartidoPolitico partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }
    
    //REDEFINIR METODO verInfo
    
    @Override
    public String toString(){
        return nombres;
    }
    @Override
    public String verInfo() {
        return "====== INFORMACION CANDIDATO ======"+"\n"+
                super.verInfo()+"\n"+
                "Partido Politico:"+"\n"+
                "==== INFORMACION DE PARTIDO POLITICO ===="+"\n"+
                partidoPolitico.verInfo();
    }

}
