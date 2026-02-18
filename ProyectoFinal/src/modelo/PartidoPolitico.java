/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.Scanner;

public class PartidoPolitico {
    private String nombrePartido;
    private String sigla;
    private String simbolo;
    private String representante;
    public PartidoPolitico(){
        nombrePartido="";
        sigla="";
        simbolo="";
        representante="";
    }

    public PartidoPolitico(String nombrePartido, String sigla, String simbolo, String representante) {
        this.nombrePartido = nombrePartido;
        this.sigla = sigla;
        this.simbolo = simbolo;
        this.representante = representante;
    }

    public String getNombrePartido() {
        return nombrePartido;
    }

    public String getSigla() {
        return sigla;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setNombrePartido(String nombrePartido) {
        this.nombrePartido = nombrePartido;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }
    public void registrarPartido(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el Nombre del partido:");
        this.nombrePartido=sc.nextLine();
        System.out.print("Ingrese las siglas del partido:");
        this.sigla=sc.nextLine();
        System.out.print("Ingrese el simbolo Distintivo del partido:");
        this.simbolo=sc.nextLine();
        System.out.print("Ingrese el nombre del representante legal:");
        this.representante=sc.nextLine();
    }
    public void modificarPartido(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("=====MODIFICAR=====");
        System.out.println("1. Modificar nombre del partido.");
        System.out.println("2. Modificar siglas.");
        System.out.println("3. Modificar simbolo del partido.");
        System.out.println("4. Modificar representante Legal.");
        System.out.println("5. Modificar todos los datos.");
        System.out.println("6. Finalizar.");
        System.out.println("Que desea realizar");
        opcion= sc.nextInt();
        sc.nextLine();
        switch(opcion){
            case 1:
                System.out.println("Modifique el nombre del partido:");
                this.nombrePartido=sc.nextLine();
                break;
            case 2:
                System.out.println("Modifique las siglas del partido:");
                this.sigla=sc.nextLine();
                break;
            case 3:
                System.out.println("Modifique el simbolo del partido:");
                this.simbolo=sc.nextLine();
                break;
            case 4:
                System.out.println("Modifique el representante legal:");
                this.representante=sc.nextLine();
                break;
            case 5:
                System.out.print("Modifique el nombre del partido:");
                this.nombrePartido=sc.nextLine();
                System.out.print("Modifique las siglas del partido:");
                this.sigla=sc.nextLine();
                System.out.print("Modifique el simbolo del partido:");
                this.simbolo=sc.nextLine();
                System.out.print("Modifique el representante legal:");
                this.representante=sc.nextLine();
                break;
            case 6:
                break;
            default:
                System.out.println("Ingrese una opción valida.");
                break;
        }
        }while(opcion!=6);
    }

    @Override
    public String toString() {
        return "Nombre Partido:" + nombrePartido+"\n" + "Siglas:" + sigla +"\n"+ "Simbolo:" + simbolo + "\n"+"Representante:" + representante;
    }
    
}
