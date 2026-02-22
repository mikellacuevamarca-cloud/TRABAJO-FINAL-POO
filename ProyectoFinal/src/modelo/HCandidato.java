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
        return "Candidato:"+nombres +"\n"+"Partido Politico:" + partidoPolitico;
    }
    public void registroCandidato(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del candidato:");
        nombres=sc.nextLine();
        System.out.print("Ingrese el apellido del candidato:");
        apellidos=sc.nextLine();
        System.out.print("Ingrese el numero de dni del candidato");
        nrodni=sc.nextInt();
        sc.nextLine();
    }
    public void modificarCandidato(){
        char opcion;
        Scanner sc = new Scanner(System.in);
        System.out.print("Modifique el nombre del candidato:");
        nombres=sc.nextLine();
        System.out.print("Modifique el apellido del candidato:");
        apellidos=sc.nextLine();
        System.out.println("Modifique el dni del candidato:");
        nrodni=sc.nextInt();
        System.out.print("Desea modificar los datos del partido actual:");
        opcion = sc.next().charAt(0);
    }
    @Override
    public void verInfo() {
        System.out.println("Información del candidato: ");
        super.verInfo();
        System.out.println(partidoPolitico);
    }

}
