
package modelo;

public class Candidato extends Persona {
    //ATRIBUTOS
    private PartidoPolitico partidoPolitico;
    
    //METODOS
    //CONSTRUCTOR sin p
    public Candidato() {
        super();
        partidoPolitico = null;
    }

    //constructor con p
    public Candidato(String nombres, String apellidos, int nrodni, PartidoPolitico partidoPolitico){
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
    public void verInfo(){
        System.out.println("Información del candidato: ");
        super.verInfo();
        System.out.println("Partido politico: " + partidoPolitico);
    }

}
