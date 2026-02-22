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
    @Override
    public String toString() {
        return nombrePartido;
    }
    
}
