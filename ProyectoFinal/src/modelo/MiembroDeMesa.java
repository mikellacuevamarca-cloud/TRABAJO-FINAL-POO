/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Mikella
 */
public class MiembroDeMesa extends Persona{
    //ATRIBUTOS
    public String tipoDeMiembro;
    
    //METODOS
    //CONSTRUCTOR sin p
    public MiembroDeMesa() {
        super();
        tipoDeMiembro = "";
    }
    
    //Constructor con p
    public MiembroDeMesa(String nombres, String apellidos, String tipoDeMiembro){
        super(nombres, apellidos);
        this.tipoDeMiembro = tipoDeMiembro;
    }
    
    //get and set

    public String getTipoDeMiembro() {
        return tipoDeMiembro;
    }

    public void setTipoDeMiembro(String tipoDeMiembro) {
        this.tipoDeMiembro = tipoDeMiembro;
    }
    
    //redefinir verInfo()
    public void verInfo(){
        System.out.println("Tipo de miembro(presidente, secretarion o vocal): " + tipoDeMiembro);
    }
    
    
}
