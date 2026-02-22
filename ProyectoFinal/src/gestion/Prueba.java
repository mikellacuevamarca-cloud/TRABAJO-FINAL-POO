package gestion;
import modelo.*;
import SubClasesEleccion.*;
public class Prueba {
    public static void main(String[] args){    
        GestionElectoral g1 = new GestionElectoral();
        Fecha f1 = new Fecha(20,01,2012);
        PartidoPolitico p1 = new PartidoPolitico("Nombre","Sigla","Simbolo","Representante");
         Candidato c1 = new Candidato("nombres","Apellidos",20,p1);
         PartidoPolitico p2 = new PartidoPolitico("Nombre1","Sigla1","Simbolo1","Representante1");
         Candidato c2 = new Candidato("nombres1","Apellidos1",21,p2);
        Eleccion e1 = new EMunicipal(f1,new Candidato[]{c1,c2},"Elecciones 2012","Surco");
        g1.agregarEleccion(e1);
        Fecha f2 = new Fecha(20,01,2024);
        Eleccion e2 = new ENacional(f1,new Candidato[]{c1,c2},"Elecciones 2024",true);
        g1.agregarEleccion(e2);
        System.out.println(g1.listarElecciones());
        
    }
}
