package modelo;

public class Acta {
    //ATRIBUTOS de clase
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
    
    //ver info

    @Override
    public String toString() {
        return "Acta{" + "titulodoc=" + titulodoc + ", fecha=" + fecha + ", "
                + "hora=" + hora + ", lugar=" + lugar + ", idmesa=" + idmesa + ", "
                + "miembroMesa=" + miembroMesa + ", observaciones=" + observaciones + 
                ", firma=" + firma + ", sello=" + sello + ", nroacta=" + nroacta + 
                ", numtotalVotantesRegistrados=" + numtotalVotantesRegistrados + 
                ", numTotalVotantesEfectivos=" + numTotalVotantesEfectivos + 
                ", numTotalVotosNulos=" + numTotalVotosNulos + 
                ", numTotalVotosBlanco=" + numTotalVotosBlanco + 
                ", cantCandidatos=" + cantCandidatos + 
                ", resultadosCandidatos=" + resultadosCandidatos + '}';
    }


    public String verInfo() {
        return  "====== ACTA ELECTORAL ======" +
            "\nTitulo: " + titulodoc +
            "\nFecha: " + fecha +
            "\nHora: " + hora +
            "\nLugar: " + lugar +
            "\nMesa: " + idmesa +
            "\nMiembro de mesa: " + miembroMesa + //arreglo
            "\nObservaciones: " + observaciones +
            "\nFirma: " + firma +
            "\nSello: " + sello  +
            "\nNumero de Acta: " + nroacta  +
            "\nVotantes Registrados: " + numtotalVotantesRegistrados  +
            "\nVotantes Efectivos: " + numTotalVotantesEfectivos  +
            "\nVotos Nulos: " + numTotalVotosNulos  +
            "\nVotos en Blanco: " + numTotalVotosBlanco +
            "\nCantidad de Candidatos: " + cantCandidatos +
            "\nResultados de Candidatos: " + cantCandidatos;//arreglo
      
    }
}
