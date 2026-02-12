/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Mikella
 */
public class Persona {
    //ATRIBUTOS
    private String nombres;
    private String apellidos;
    
    //metodo
    //CONSTRUCTOR sin p
    public Persona() {
        nombres = "";
        apellidos = "";
    }

    //constructor con p
    public Persona(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    //get and set
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    //OTROS METODOS
    public void verInfo(){
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
    }
    
}
