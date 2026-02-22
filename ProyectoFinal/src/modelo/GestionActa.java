
package modelo;

public class GestionActa {
    //ATRIBUTOS
    private Acta[] listaActas;
    private int contador;

    public GestionActa(int cant) {
        listaActas = new Acta[cant];
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

    public void totalVotosCandidatos(HCandidato[] listaCandidatos){
        int suma = 0;
        for (int i = 0; i < contador; i++) {
            DetalleVoto[] resultados = listaActas[i].getResultadosCandidatos();
            for (int j = 0; j < resultados.length; j++) {
                suma += resultados[j].getCantidadCandidato();
            }
        }
        
    }
    
    
}
