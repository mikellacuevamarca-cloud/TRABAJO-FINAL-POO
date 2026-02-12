/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Mikella
 */
    
public class Candidato extends Persona {
    //ATRIBUTOS
    private int nrodni;
    private String partidoPolitico;
    
    //METODOS
    //CONSTRUCTOR sin p
    public Candidato() {
        super();
        nrodni = 0;
        partidoPolitico = "";
    }

    //constructor con p
    public Candidato(String nombres, String apellidos, int nrodni, String partidoPolitico){
        super(nombres, apellidos);
        this.nrodni = nrodni;
        this.partidoPolitico = partidoPolitico;
    }
    
    //GET AND SETTER

    public int getNrodni() {
        return nrodni;
    }

    public void setNrodni(int nrodni) {
        this.nrodni = nrodni;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }
    
    //REDEFINIR METODO verInfo
    public void verInfo(){
        System.out.println("DNI: " + nrodni);
        System.out.println("Partido politico: " + partidoPolitico);
    }

}
