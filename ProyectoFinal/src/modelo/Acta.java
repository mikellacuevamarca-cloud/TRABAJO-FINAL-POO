package modelo;
import modelo.*;
public class Acta {
    //ATRIBUTOS
    private String titulodoc;
    private Fecha fecha;
    private Hora hora;
    private String lugar;
    private MesaElectoral idmesa;
    private HMiembroDeMesa[] miembroMesa;
    private String observaciones;
    private String firma;
    private String sello;
    private int nroacta;
    private int numtotalVotantesRegistrados;
    private int numTotalVotantesEfectivos;
    private int numTotalVotosNulos;
    private int numTotalVotosBlanco;
    private int cantCandidatos;
    private DetalleVoto[] resultadosCandidatos;
           


    public Acta(String titulodoc, Fecha fecha, Hora hora, String lugar, 
            MesaElectoral idmesa, HMiembroDeMesa[] miembroMesa, 
            String observaciones, String firma, String sello, int nroacta, 
            int numtotalVotantesRegistrados, int numTotalVotantesEfectivos, 
            int numTotalVotosNulos, int numTotalVotosBlanco, int cantCandidatos, 
            DetalleVoto[] resultadosCandidatos) {
        this.titulodoc = titulodoc;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.idmesa = idmesa; 
        this.observaciones = observaciones;
        this.firma = firma;
        this.sello = sello;
        this.nroacta = nroacta;
        this.numtotalVotantesRegistrados = numtotalVotantesRegistrados;
        this.numTotalVotantesEfectivos = numTotalVotantesEfectivos;
        this.numTotalVotosNulos = numTotalVotosNulos;
        this.numTotalVotosBlanco = numTotalVotosBlanco;
        
        //arreglos
        this.miembroMesa = new HMiembroDeMesa[3];
        this.resultadosCandidatos = new DetalleVoto[cantCandidatos];
    }
    
    //GETTER AND SETTER
    public String getTitulodoc() {
        return titulodoc;
    }

    public void setTitulodoc(String titulodoc) {
        this.titulodoc = titulodoc;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public MesaElectoral getIdmesa() {
        return idmesa;
    }

    public void setIdmesa(MesaElectoral idmesa) {
        this.idmesa = idmesa;
    }

    public HMiembroDeMesa[] getMiembroMesa() {
        return miembroMesa;
    }

    public void setMiembroMesa(HMiembroDeMesa[] miembroMesa) {
        this.miembroMesa = miembroMesa;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getSello() {
        return sello;
    }

    public void setSello(String sello) {
        this.sello = sello;
    }

    public int getNroacta() {
        return nroacta;
    }

    public void setNroacta(int nroacta) {
        this.nroacta = nroacta;
    }

    public int getNumtotalVotantesRegistrados() {
        return numtotalVotantesRegistrados;
    }

    public void setNumtotalVotantesRegistrados(int numtotalVotantesRegistrados) {
        this.numtotalVotantesRegistrados = numtotalVotantesRegistrados;
    }

    public int getNumTotalVotantesEfectivos() {
        return numTotalVotantesEfectivos;
    }

    public void setNumTotalVotantesEfectivos(int numTotalVotantesEfectivos) {
        this.numTotalVotantesEfectivos = numTotalVotantesEfectivos;
    }

    public int getNumTotalVotosNulos() {
        return numTotalVotosNulos;
    }

    public void setNumTotalVotosNulos(int numTotalVotosNulos) {
        this.numTotalVotosNulos = numTotalVotosNulos;
    }

    public int getNumTotalVotosBlanco() {
        return numTotalVotosBlanco;
    }

    public void setNumTotalVotosBlanco(int numTotalVotosBlanco) {
        this.numTotalVotosBlanco = numTotalVotosBlanco;
    }

    public int getCantCandidatos() {
        return cantCandidatos;
    }

    public void setCantCandidatos(int cantCandidatos) {
        this.cantCandidatos = cantCandidatos;
    }

    public DetalleVoto[] getResultadosCandidatos() {
        return resultadosCandidatos;
    }

    public void setResultadosCandidatos(DetalleVoto[] resultadosCandidatos) {
        this.resultadosCandidatos = resultadosCandidatos;
    }
    

    // metodo eliminar agregar y modificar
    public void agregarMiembroMesa(HMiembroDeMesa m, int pos) {
        if (pos >= 0 && pos < miembroMesa.length) {
            miembroMesa[pos] = m;
        }
    }

    public void eliminarMiembroMesa(int pos) {
        if (pos >= 0 && pos < miembroMesa.length) {
            miembroMesa[pos] = null;
        }
    }

    public void modificarMiembroMesa(int pos, HMiembroDeMesa nuevo) {
        if (pos >= 0 && pos < miembroMesa.length) {
            miembroMesa[pos] = nuevo;
        }
    }

    //candidatos
    public void agregarResultado(int pos, DetalleVoto detalle) {
        if (pos >= 0 && pos < resultadosCandidatos.length) {
            resultadosCandidatos[pos] = detalle;
        }
    }

    public void eliminarResultado(int pos) {
        if (pos >= 0 && pos < resultadosCandidatos.length) {
            resultadosCandidatos[pos] = null;
        }
    }

    public void modificarResultado(int pos, DetalleVoto nuevoDetalle) {
        if (pos >= 0 && pos < resultadosCandidatos.length) {
            resultadosCandidatos[pos] = nuevoDetalle;
        }
    }

    public String verInfo() {
        return  "====== ACTA ELECTORAL ======\n" +
            "Titulo: " + titulodoc + "\n" +
            "Fecha: " + fecha + "\n" +
            "Hora: " + hora + "\n" +
            "Lugar: " + lugar + "\n" +
            "Mesa: " + idmesa + "\n" +
            "Observaciones: " + observaciones + "\n" +
            "Firma: " + firma + "\n" +
            "Sello: " + sello + "\n" +
            "Numero de Acta: " + nroacta + "\n" +
            "Votantes Registrados: " + numtotalVotantesRegistrados + "\n" +
            "Votantes Efectivos: " + numTotalVotantesEfectivos + "\n" +
            "Votos Nulos: " + numTotalVotosNulos + "\n" +
            "Votos en Blanco: " + numTotalVotosBlanco + "\n" +
            "Cantidad de Candidatos: " + cantCandidatos;
      
    }
}
