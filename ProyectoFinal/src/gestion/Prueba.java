package gestion;
import SubClasesEleccion.*;
import modelo.*;
public class Prueba {
    public static void main(String[] args){    
        GestionElecciones g1 = new GestionElecciones();
        Fecha f1 = new Fecha(20,1,2012);
        PartidoPolitico p1 = new PartidoPolitico("Fuerza","fz","fz","Juan Perez");
        HCandidato c1 = new HCandidato("Juan","Perez",20,p1);
        PartidoPolitico p2 = new PartidoPolitico("Fredemo","Fred","Fred","Pedro Suarez");
        HCandidato c2 = new HCandidato("Pedro","Suarez",21,p2);
        Eleccion e1 = new EMunicipal();
        e1.agregarCandidato(c1);
        e1.agregarCandidato(c2);
        e1.setFecha(f1);
        e1.setTitulo("Elecciones 2012");
        ((EMunicipal)e1).setLugar("Surco");
        g1.agregarEleccion(e1);
        Eleccion e2 = new EMunicipal();
        e2.agregarCandidato(c1);
        e2.agregarCandidato(c2);
        e2.setFecha(f1);
        e2.setTitulo("Elecciones 2012");
        ((EMunicipal)e2).setLugar("Surco");
        g1.agregarEleccion(e2);
        System.out.println(g1.mostrarElecciones());
    }
}