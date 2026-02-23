package gestion;
import SubClasesEleccion.*;
import modelo.*;
public class Prueba {
    public static void main(String[] args){    
        GestionPartidoPolitico g1 = new GestionPartidoPolitico();
        PartidoPolitico p1 = new PartidoPolitico("Nombre","Sigla","Simbolo","Nombre");
        g1.agregarPartido(p1);
        PartidoPolitico p2 = new PartidoPolitico("Nombre","Sigla","Simbolo","Nombre");
        g1.agregarPartido(p2);
        System.out.println(g1.mostrarPartidos());
    }
}