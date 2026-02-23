package gestion;

import modelo.Acta;
import modelo.DetalleVoto;

public class GestionActa {
    //ATRIBUTOS
    private Acta[] listaActas;
    private int contador;

    private static final int MAX = 5;
            
    public GestionActa(int cant) {
        listaActas = new Acta[5];
        contador = 0;
    }
    
    //registrar Actas
    public void registrarActa(Acta a){
        if(contador < listaActas.length){
            listaActas[contador] = a;
            contador++;
        }else{
            System.out.println("Capacidad maxima");
        }
    }
    
    //=====METODOS de acuerdo a acta
    //buscar de acuerdo al nroacta ya que es unico
    public Acta buscarActaPorNro(int nroacta){
        for (int i = 0; i < contador; i++) {
            if(listaActas[i].getNroacta() == nroacta ){
                return listaActas[i];
            }
        }
        return null;
    }
    
    //corregir de las actas los votos de cada tipo
    public Acta corregirActa(int nroacta, int regis, int efec, int nulos, int blanco){
        Acta encontrada = buscarActaPorNro(nroacta);
        if(encontrada!= null){
            encontrada.setNumtotalVotantesRegistrados(regis);
            encontrada.setNumTotalVotantesEfectivos(efec);
            encontrada.setNumTotalVotosNulos(nulos);
            encontrada.setNumTotalVotosBlanco(blanco);
        }
        
        return encontrada;
    }
    
    //metodos a partir de actas pero con los items de los arreglos de actributos
    public void registrarVotosPreferenciales(int nroacta, int dniCandidato, int votosPref){
        Acta encontrada = buscarActaPorNro(nroacta);       
        if(encontrada != null){
            DetalleVoto[] resultados = encontrada.getResultadosCandidatos();
            for (int i = 0; i < resultados.length; i++) {
                if(resultados[i].getCandidato().getNrodni() == dniCandidato){
                    resultados[i].setVotosPreferenciales(votosPref);
                }
            }
        }
    }
    
    //corregir los datos de detalleVoto de acuerdo a dni
    public void corregirVotoCandidato(int nroacta, int dniCandidato, int nuevaCantidad) {
        Acta encontrada = buscarActaPorNro(nroacta);
        
        if(encontrada != null){
            DetalleVoto[] resultados = encontrada.getResultadosCandidatos();
            for (int i = 0; i < resultados.length; i++) {
                if(resultados[i].getCandidato().getNrodni() == dniCandidato){
                    resultados[i].setCantidadCandidato(nuevaCantidad); //correcion
                }
            }
        }else{
            System.out.println("No encontrado");
        }
        
    }
           
    //El sistema debe realizar el conteo automático de votos, incluyendo los votos 
    //preferenciales, y generar resultados instantáneos con desgloses por candidato.

    /*public void totalVotosCandidatos(HCandidato[] listaCandidatos){
        int suma = 0;
        for (int i = 0; i < contador; i++) {
            DetalleVoto[] resultados = listaActas[i].getResultadosCandidatos();
            for (int j = 0; j < resultados.length; j++) {
                suma += resultados[j].getCantidadCandidato();
            }
        }
        
    }*/
    
     // Conteo automático de votos por candidato
    public String contarVotosPorCandidato() {
        String resultado = "=== RESULTADOS POR CANDIDATO ===\n";
        for (int i = 0; i < contador; i++) {
            Acta a = listaActas[i];
            DetalleVoto[] resultados = a.getResultadosCandidatos();
            if(resultados != null){
                for (int j = 0; j < resultados.length; j++) {
                    if(resultados[j] != null){
                        resultado = resultado + "Candidato: " + resultados[j].getCandidato().getNombres() + " "
                                + resultados[j].getCandidato().getApellidos() + "\n";
                        resultado = resultado + "  Votos Totales: " + resultados[j].getCantidadCandidato() + "\n";
                        resultado = resultado + "  Votos Preferenciales: " + resultados[j].getVotosPreferenciales() + "\n";
                    }
                }
            }
        }
        return resultado;
    }

    // Generar informe detallado por elección y mesa electoral
    public String generarInformeDetallado() {
        String informe = "=== INFORME DETALLADO DE ACTAS ===\n";
        for (int i = 0; i < contador; i++) {
            Acta a = listaActas[i];
            informe = informe + "Acta Nro: " + a.getNroacta() + "\n";
            informe = informe + "Mesa ID: " + a.getIdmesa().getIdMesa() + "\n";
            informe = informe + "Votantes Registrados: " + a.getNumtotalVotantesRegistrados() + "\n";
            informe = informe + "Votantes Efectivos: " + a.getNumTotalVotantesEfectivos() + "\n";
            informe = informe + "Votos Nulos: " + a.getNumTotalVotosNulos() + "\n";
            informe = informe + "Votos en Blanco: " + a.getNumTotalVotosBlanco() + "\n";
            
            DetalleVoto[] resultados = a.getResultadosCandidatos();
            if(resultados != null){
                informe = informe + "Resultados por candidato:\n";
                for (int j = 0; j < resultados.length; j++) {
                    if(resultados[j] != null){
                        informe = informe + "  Candidato: " + resultados[j].getCandidato().getNombres() + " "
                                + resultados[j].getCandidato().getApellidos() + "\n";
                        informe = informe + "    Votos Totales: " + resultados[j].getCantidadCandidato() + "\n";
                        informe = informe + "    Votos Preferenciales: " + resultados[j].getVotosPreferenciales() + "\n";
                    }   //sumar totales + preferenciales
                }
            }
            informe = informe + "\n";
        }
        return informe;
    }
}



    
    

